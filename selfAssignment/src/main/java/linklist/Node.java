package linklist;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by pankaj on 09,2018
 */
@Data
@NoArgsConstructor
public class Node {
    private Object data;
    private Node next;

    public Node(Object data){
        this.data=data;
    }
}
