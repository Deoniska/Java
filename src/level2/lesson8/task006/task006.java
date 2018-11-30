package level2.lesson8.task006;

/*
Минимум четырех чисел
*/

public class task006 {
    public static int min(int a, int b, int c, int d) {
     int m = min(a, b);
     int m2 =min(c, d);
     if (m<=m2) return m;
     else return m2;//напишите тут ваш код

    }

    public static int min(int a, int b) {
        if (a >= b) return b;
        else return a; //напишите тут ваш код

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }

}
