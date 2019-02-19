package tree.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LevelNode{
    private int data;
    public LevelNode nextSibbling;
    public LevelNode left;
    public LevelNode right;

    public LevelNode(int data) {
        this.data = data;
    }
}
