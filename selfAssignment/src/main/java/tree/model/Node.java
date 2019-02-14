package tree.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by pankaj on 02,2019
 */
@Data
@NoArgsConstructor
public class Node {
    public Node left;
    private int data;
    public Node right;

    public Node(int data) {
        this.data = data;
    }
}
