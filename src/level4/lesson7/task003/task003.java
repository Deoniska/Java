package level4.lesson7.task003;

/*
Положительное число
*/


        import java.io.BufferedReader;
        import java.io.InputStreamReader;

public class task003 {
    public static void main (String[] args) throws Exception {

        int a = read();
        int b = read();
        int c = read();

        System.out.println(count(a,b,c));

    }

    public static int count (int a, int b, int c) {
        int summ = 0;

        if ((a >0)&&(b>0)&&(c>0))  summ=3;
        else if ((a>0)&&(b>0)) summ =2;
        else if ((a>0)&&(c>0)) summ=2;
        else if ((b>0)&&(c>0)) summ=2;
        else if ((a>0)|(b>0)|(c>0)) summ=1;
        else if (a == 0& b==0 & c==0) summ=0;


        return summ;
    }


    public static int read () throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String c = reader.readLine();
        int nc = Integer.parseInt(c);
        return nc;

    }
}
