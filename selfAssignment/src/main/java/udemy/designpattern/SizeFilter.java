package udemy.designpattern;

import udemy.designpattern.interfacepackage.Specification;

import java.util.function.Predicate;

/**
 * Created by pankaj on 01,2019
 */
public class SizeFilter implements Specification<Product> {
    private Size size;

    public SizeFilter(Size size){
        this.size=size;
    }
    @Override
    public boolean isSatifiedCondtion(Product product) {
        return product.getSize()==size;
    }
}

class ColorFilter implements  Specification<Product>{
    private Color color;
    public ColorFilter(Color color){
        this.color=color;
    }

    @Override
    public boolean isSatifiedCondtion(Product object) {
        return object.getColor()==color;
    }
}

class SizeAndColorFilter<T> implements Specification<T>{
    private Specification<T> first;
    private Specification<T> second;

    public SizeAndColorFilter(Specification<T> first , Specification<T> second){
        this.first=first;
        this.second=second;
    }

    @Override
    public boolean isSatifiedCondtion(T object) {
        return first.isSatifiedCondtion(object) && second.isSatifiedCondtion(object);
    }
}