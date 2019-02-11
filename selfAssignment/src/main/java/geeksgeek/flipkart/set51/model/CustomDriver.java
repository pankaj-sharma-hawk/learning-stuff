package geeksgeek.flipkart.set51.model;

import java.util.Comparator;

/**
 * Created by pankaj on 02,2019
 */
public class CustomDriver implements Comparator<Driver> {

    @Override
    public int compare(Driver o1, Driver o2) {
        return o1.getAverageRating()<o2.getAverageRating()?-1:(o1.getAverageRating()>o2.getAverageRating()?1:0);
    }
}