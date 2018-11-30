package level4.lesson4.task009;
/*
Переходим дорогу вслепую
*/
        import java.io.*;

public class task009 {
    public static void main (String[] args) throws Exception {

        double t=read();
        String s;

        if((t%5>=0)&&(t%5<3))
            s="зеленый";
        else if((t%5<4)&&(t%5>=3))
            s="желтый";
        else if((t%5<5)&&(t%5>=4))
            s="красный";
        else
            s = "такого не может быть";
        System.out.println(s);

    }

    public static double read () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String r = reader.readLine();
        double c = Double.parseDouble(r);
        return c;
    }
}
