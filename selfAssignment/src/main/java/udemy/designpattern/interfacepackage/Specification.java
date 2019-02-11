package udemy.designpattern.interfacepackage;

import udemy.designpattern.Product;

import java.util.function.Predicate;

/**
 * Created by pankaj on 01,2019
 */
public interface Specification<T> {
    boolean isSatifiedCondtion(T object);
}
