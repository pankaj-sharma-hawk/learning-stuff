package geeksgeek.flipkart.set52.model;

public enum UserLevel{
    ROOT(0),ADMIN(1),USER(2);

    private int level;

    UserLevel(int level){
        this.level=level;
    }
}