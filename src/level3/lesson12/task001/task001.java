package level3.lesson12.task001;

/*
Сумма цифр трехзначного числа
*/

public class task001 {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }
    public static int sumDigitsInNumber(int number) {
        int a1 = number/100;
        int a2 = (number - a1*100)/10;
        int a3 = (number - (a1*100 +a2*10));
        int sum = a1+a2+a3;
        return sum;


    }
}
