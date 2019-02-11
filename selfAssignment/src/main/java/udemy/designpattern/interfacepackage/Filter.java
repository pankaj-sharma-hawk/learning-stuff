package udemy.designpattern.interfacepackage;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by pankaj on 01,2019
 */
public interface Filter<T> {
    Stream<T> filterItems(List<T> list,Specification<T> specification);
}
