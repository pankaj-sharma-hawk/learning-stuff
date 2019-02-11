package udemy.designpattern;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by pankaj on 01,2019
 */
public class MainClass {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = Arrays.asList(apple,tree,house);
        ProductFilter productFilter = new ProductFilter();
        Stream<Product> result = productFilter.filterByColor(products, Color.GREEN);
        result.forEach(product -> System.out.println("1. Product Name "+product.getName() +
                " Color "+ product.getColor()+" Size "+product.getSize()));

        Stream<Product> result1 = productFilter.filterBySize(products,Size.LARGE);
        result1.forEach(product -> System.out.println("2. Product Name "+product.getName() +
                " Color "+ product.getColor()+" Size "+product.getSize()));

        Stream<Product> result2 = productFilter.filterBySizeAndColor(products, Size.LARGE, Color.BLUE);
        result2.forEach(product -> System.out.println("3. Product Name "+product.getName() +
                " Color "+ product.getColor()+" Size "+product.getSize()));

        //-------------------------------------------------------

        ColorFilter colorFilter = new ColorFilter(Color.GREEN);
        SizeFilter sizeFilter = new SizeFilter(Size.LARGE);
        SizeAndColorFilter sizeAndColorFilter = new SizeAndColorFilter<>(new ColorFilter(Color.BLUE),sizeFilter);

        ProductBetterFilter productBetterFilter = new ProductBetterFilter();
        Stream<Product> r1=productBetterFilter.filterItems(products,colorFilter);
        r1.forEach(product -> System.out.println("r1. Product Name "+product.getName() +
                " Color "+ product.getColor()+" Size "+product.getSize()));

        Stream<Product> r2=productBetterFilter.filterItems(products,sizeFilter);
        r2.forEach(product -> System.out.println("r2. Product Name "+product.getName() +
                " Color "+ product.getColor()+" Size "+product.getSize()));

        Stream<Product> r3=productBetterFilter.filterItems(products,sizeAndColorFilter);
        r3.forEach(product -> System.out.println("r3. Product Name "+product.getName() +
                " Color "+ product.getColor()+" Size "+product.getSize()));

        HashMap<Integer,String> map = new HashMap();
        map.put(1,"Abc");


    }
}
