package level5.lesson7.task012;

public class Circle {

    private int centerX;
    private int centerY;
    private int radius;
    private int width;
    private String color;

    public void initialize (int centerX, int centerY, int radius) {
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
    }
    public void initialization(int centerX, int centerY, int radius, int width) {
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
        this.width=width;
    }
    public void initialization(int centerX, int centerY, int radius, int width, String color) {
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
        this.width=width;
        this.color=color;
    }
    public static void main (String[] args) {

    }
}
