package level4.lesson10.task005;
/*
Таблица умножения
*/
public class task005v2 {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            System.out.print(" ");
            for (int n=1; n<=10; n++) {
                System.out.print(i*n+" ");
            }
            System.out.println("");
        }
    }
}
