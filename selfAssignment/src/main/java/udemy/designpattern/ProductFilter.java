package udemy.designpattern;

import udemy.designpattern.interfacepackage.Filter;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by pankaj on 01,2019
 */
public class ProductFilter {
    /** Filter Color*/

    public Stream<Product> filterByColor(List<Product> list ,  Color color){
        return list.stream().filter(p-> p.getColor()==color);
    }

    /**Filter Size **/

    public Stream<Product> filterBySize(List<Product> list ,  Size size){
        return list.stream().filter(p-> p.getSize()==size);
    }

    /** Filter Size and Color **/
    public Stream<Product> filterBySizeAndColor(List<Product> list ,  Size size,Color color){
        return list.stream().filter(p-> (p.getColor()==color)&&(p.getSize()==size));
    }
}
