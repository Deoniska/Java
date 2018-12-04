package level4.lesson7.task002;

/*
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task002 {
    public static void main (String[] args) throws Exception {
        String c = read();
        int number = c.length();
        sort(number, c);
    }

    public static String  read ()  throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
       // int ns = Integer.parseInt(s);
        return s;
    }

    public static void sort (int n, String number) {
        if ((n%2==0)&&(number.length() == 1)&&(n>0)) {System.out.println("четное однозначное число");}
        else if ((n%2!=0)&&(number.length()==1)&&(n>0)) {System.out.println("нечетное однозначное число");}
        else if ((n%2==0)&&(number.length()==2)&&(n>0)) {System.out.println("четное двузначное число");}
        else if ((n%2!=0)&&(number.length()==2)&&(n>0)) {System.out.println("нечетное двузначное число");}
        else if ((n%2==0)&&(number.length()==3)&&(n>0)) {System.out.println("четное трехзначное число");}
        else if ((n%2!=0)&&(number.length()==3)&&(n>0)) {System.out.println("нечетное трехзначное число");}
    }
}
