package level4.lesson4.task002;
/*
Ближайшее к 10
*/

//import com.sun.tools.internal.xjc.model.CBuiltinLeafInfo;

public class task002 {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(14, 7);
    }
    public static void closeToTen(int a, int b) {
        int ab = abs(10-a);
        int ba = abs(10-b);
        if (ab>ba)
            System.out.println(b);
        else
            System.out.println(a);

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
