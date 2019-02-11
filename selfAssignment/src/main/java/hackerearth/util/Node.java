package hackerearth.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by pankaj on 02,2019
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Node {
    private int data;
    private int start;
    private int end;
    private Node left;
    private Node right;

    public Node(int data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }
}
