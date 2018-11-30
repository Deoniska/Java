package level3.lesson6.task003;

/*
Каждый охотник желает знать…
*/

public class task003 {
    public static void main(String[] args) {
      Red red = new Red();
      Orange orange = new Orange();
      Yellow yellow = new Yellow();
      Green gren = new Green();
      Blue blue = new Blue();
      Indigo indigo = new Indigo();
      Violet violet = new Violet();//напишите тут ваш код
    }

    public static class Red {
        public Red() {
            System.out.println("Red");
        }
    }

    public static class Orange {
        public Orange() {
            System.out.println("Orange");
        }
    }

    public static class Yellow {
        public Yellow() {
            System.out.println("Yellow");
        }
    }

    public static class Green {
        public Green() {
            System.out.println("Green");
        }
    }

    public static class Blue {
        public Blue() {
            System.out.println("Blue");
        }
    }

    public static class Indigo {
        public Indigo() {
            System.out.println("Indigo");
        }
    }

    public static class Violet {
        public Violet() {
            System.out.println("Violet");
        }
    }
}
