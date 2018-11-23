package task02.task002;

/*
Прибавка к зарплате
*/

public class task002 {
    public static void main(String[] args) {
        hackSalary(700);
    }

    public static void hackSalary(int a) {

       String s = "Твоя зарплата составляет: ";
       String s2 = " долларов в месяц."; // напишите тут ваш код
        a = a+100;
        System.out.println(s+a+s2);
    }

}
