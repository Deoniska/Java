package level4.lesson13.task002;

/*
Рисуем прямоугольник
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task002 {
    public static void main(String[] args) throws Exception {

        int m = read();
        int n = read();

        for (int i=0; i<n; i++) {
            System.out.println("");
            for (int i1=0; i1<m; i1++) {
                System.out.print(m);
            }
        }

    }

    public static int read() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s =reader.readLine();
        int ns = Integer.parseInt(s);
        return ns;
    }
}
