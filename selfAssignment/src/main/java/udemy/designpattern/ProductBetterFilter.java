package udemy.designpattern;

import udemy.designpattern.interfacepackage.Filter;
import udemy.designpattern.interfacepackage.Specification;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by pankaj on 01,2019
 */
public class ProductBetterFilter implements Filter<Product> {
    @Override
    public Stream<Product> filterItems(List<Product> list, Specification<Product> specification) {
        return list.stream().filter(p->specification.isSatifiedCondtion(p));
    }
}
