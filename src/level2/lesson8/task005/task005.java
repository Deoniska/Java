package level2.lesson8.task005;
/*
Минимум трёх чисел
*/

public class task005 {
    public static int min(int a, int b, int c) {
      if (a <= b & a <=c) return a;
      else if (b<=a&b<=c) return b;
      else  return c;//напишите тут ваш код
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
