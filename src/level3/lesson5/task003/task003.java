package level3.lesson5.task003;
/*
Конвертируем время
*/

public class task003 {
    public static int convertToSeconds(int hour) {
        hour = hour*60*60;
        return hour;
    }

    //напишите тут ваш код

    public static void main(String[] args) {
        System.out.println(convertToSeconds(5));
        System.out.println(convertToSeconds(10));//напишите тут ваш код
    }
}
