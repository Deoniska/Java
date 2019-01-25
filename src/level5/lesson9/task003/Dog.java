package level5.lesson9.task003;

public class Dog {
    private String name;
    private int height;
    private String color;

    public Dog (String name) {
        this.name=name;
    }
    public Dog(String name, int height){
        this.name=name;
        this.height=height;
    }
    public Dog(String color, String name, int height){
        this.color=color;
        this.name=name;
        this.height=height;
    }

    public static void main (String [] args) {


    }
}
