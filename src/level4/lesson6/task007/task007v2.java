package level4.lesson6.task007;

/*
Три числа
*/

import java.io.*;

public class task007v2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        String number2 = reader.readLine();
        String number3 = reader.readLine();
        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        int c = Integer.parseInt(number3);

        /*if (((a!=b)||(a!=c)) && ((a==b)||(a==c))) System.out.println(1);
        else if (((b!=a)||(b!=c)) && ((b==a)||(b==c))) System.out.println(2);
        else if (((c!=a)||(c!=b)) && ((c==a)||(c==b))) System.out.println(3);
            //напишите тут ваш код*/

        if (a !=b && a!=c && b!=c){
        }
        else if (a != b && a !=c)
            System.out.println(1);
        else if (b != a && b !=c)
            System.out.println(2);
        else if (c != a && b !=c)
            System.out.println(3);
    }
}



