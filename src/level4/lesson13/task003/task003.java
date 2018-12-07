package level4.lesson13.task003;

/*
Треугольник из восьмерок
*/

public class task003 {
    public static void main(String[] args) {
        String s = "8";
        for (int i =0; i<11; i++) {
            System.out.println(s);
            s=s+8;
        }
    }
}
