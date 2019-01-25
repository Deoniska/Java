package level5.lesson7.task011;

public class Dog {

    private String name;
    private String color;
    private int height;

    public void initialize (String name) {
        this.name = name;
    }
    public void initialize (String  name, int height) {
        this.name = name;
        this.height = height;
    }
    public void initialize (String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public static void main(String[] args) {

    }


}
