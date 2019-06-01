package old.array;



import com.sun.xml.internal.bind.api.TypeReference;
import org.apache.commons.beanutils.ConvertUtils;



import org.springframework.core.ParameterizedTypeReference;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by pankaj on 01,2019
 */
public class InputArray {
    private static Scanner sc = new Scanner(System.in);
    public static <T> List<T> readIntegerArray(int size ,  Class <?> clazz){
        List<T> list = new ArrayList<T>();
        for(int i=0;i<size;i++){
            String st=sc.nextLine();
            list.add ((T) ConvertUtils.convert(st, clazz));
        }
        return list;
    }

}
