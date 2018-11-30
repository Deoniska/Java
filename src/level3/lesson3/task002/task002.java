package level3.lesson3.task002;

/*
Обмен валют
*/

public class task002 {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(13,76.6));
        System.out.println(convertEurToUsd(15,78));//напишите тут ваш код
    }

    public static double convertEurToUsd(int eur, double course) {
       double dollar = eur * course;
       return dollar;//напишите тут ваш код
    }

}
