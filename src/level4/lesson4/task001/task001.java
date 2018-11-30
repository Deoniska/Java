package level4.lesson4.task001;
/*
Хорошо или плохо?
*/
public class task001 {

    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare (int a) {

        if (a < 5)
            System.out.println("Число " + a + " меньше 5");
        else if (a == 5)
            System.out.println("Число " + a + " равно 5");
        else
            System.out.println("Число " + a + " больше 5");
    }
}
