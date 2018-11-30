package level4.lesson4.task004;

/*
Времена года на Терре
*/

public class task004 {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
        checkSeason(15);
        checkSeason(-1);
    }
    public static void checkSeason(int month) {
        if (month <=2&&month>0)
            System.out.println("Зима");
        else if (month <=5 && month>2)
            System.out.println("Весна");
        else if (month <=8 && month>5)
            System.out.println("Лето");
        else if (month<=11 && month>8)
        System.out.println("Осень");
        else if (month<=12 && month>11)
        System.out.println("Зима");
        else
        System.out.println("В году 12 месяцев");
    }
}
