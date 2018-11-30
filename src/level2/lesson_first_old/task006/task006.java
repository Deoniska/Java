package level2.lesson_first_old.task006;

/*
Наш первый конвертер!
*/

public class task006 {
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(41));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
       double sum = celsium * 9.0/5.0 + 32;
       return sum;
        //напишите тут ваш код


    }

}
