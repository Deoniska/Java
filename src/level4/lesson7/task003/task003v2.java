package level4.lesson7.task003;
/*
Положительное число
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;


public class task003v2 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        int value1 = read();
        int value2 = read();
        int value3 = read();


        int[] array = new int[3];
        array[0] = value1;
        array[1] = value2;
        array[2] = value3;


        int count = 0;
        for (int i = 0; i < 3; i++)
        {
            if(array[i] >0 )
                count = count + 1;

        }
        System.out.println(count);
    }

    public static int read () throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String valueString1 = reader.readLine();
        int value1 = Integer.parseInt(valueString1);
        return value1;
    }
}