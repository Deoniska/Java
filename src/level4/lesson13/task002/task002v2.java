package level4.lesson13.task002;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task002v2 {
    public static void main(String [] args) throws Exception {

        int m = read();
        int n = read();

        int i=0;
        int i1=0;
        while (i<m) {
            while (i1<n) {
                System.out.print(n);
                i1++;
            }
            System.out.println(" ");
            i++;
            i1=0;
        }

    }

    public static int read() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int ns = Integer.parseInt(s);
        return ns;
    }
}
