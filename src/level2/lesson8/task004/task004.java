package level2.lesson8.task004;

/*
Минимум двух чисел
*/

public class task004 {
    public static int min(int a, int b) {
        if (a > b) return b;
        else return a; //напишите тут ваш код
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}
