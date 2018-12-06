package level4.lesson7.task004;
/*
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task004 {
    public static void main(String[] args) throws Exception {

        int a = read();
        int b = read();
        int c = read();

        System.out.println(count(a,b,c));


    }

    public static countNumber count(int a, int b, int c) {


        countNumber number = new countNumber();



        if (a>0) {
            countNumber.pos++;
        }
        else if (a<0) {
            countNumber.neg++;
        }

        if (b>0) {
            countNumber.pos++;
        }
        else if (b<0) {
            countNumber.neg++;
        }
        if (c>0) countNumber.pos++;
        else if (c<0) {
            countNumber.neg++;
        }
        return number;
    }


    public static int read () throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String c = reader.readLine();
        int nc = Integer.parseInt(c);
        return nc;

    }

    public static class countNumber {


        private static int pos;
        private static int neg;


        @Override
        public String toString() {
            return "количество отрицательных чисел: " + pos  + "\n" + "количество положительных чисел: " + neg;
        }
    }
}

