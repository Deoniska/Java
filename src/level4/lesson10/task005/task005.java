package level4.lesson10.task005;
/*
Таблица умножения
*/

public class task005 {
    public static void main(String[] args) {
        int i=1, n=1;
        while (i<=10) {
            System.out.print(" ");
            while (n<=10) {
                System.out.print(i*n+" ");
                n++;
            }
            i++;
            n=1;
            System.out.println("");
        }
    }
}
