package level4.lesson7.task004;
/*
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class task004v2 {

    public static void main(String[] args) throws Exception {

        int a = read();
        int b = read();
        int c = read();

        count(a,b,c);

    }

    public static void count (int a, int b, int c) {
        int pos = 0;
        int neg = 0;

        if (a > 0) {
            pos++;
        }
        else if (a<0) {
            neg++;
        }
        if (b > 0) {
            pos++;
        }
        else if (b<0) {
            neg++;
        }
        if (c > 0) {
            pos++;
        }
        else if (c<0){
            neg++;
        }
        System.out.println("количество отрицательных чисел: " + neg);
        System.out.println("количество положительных чисел: " + pos); //напишите тут ваш код

    }
    public static int read() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int ns = Integer.parseInt(s);
        return ns;
    }
}
