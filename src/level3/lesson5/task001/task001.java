package level3.lesson5.task001;

/*
Набираем воду в бассейн
*/

public class task001 {
    public static void main(String[] args) {
        System.out.println(getVolume(25, 5, 2));
    }

    public static long getVolume(int a, int b, int c) {
      int v = a*b*c*1000;
      return v;//напишите тут ваш код
    }
}
