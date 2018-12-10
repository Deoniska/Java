package level4.lesson16.task003;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task003v2 {
    public static void main(String[] args) throws Exception {
        System.out.println(circule());

    }
   public static int circule() throws Exception {
        int sum =0;
        for (int i =0;i==0;) {
            int number = read();//считываем число
            sum = sum + number;
            if (number == -1) {
                break;
            }
        }
        return sum;
   }

    public static int read() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int ns = Integer.parseInt(s);
        return ns;
    }
}
