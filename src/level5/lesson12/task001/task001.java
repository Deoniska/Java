package level5.lesson12.task001;

public class task001 {

/*
Мужчина и женщина
*/


        public static void main(String[] args) {

            Man man1 = new Man("Костя", 40, "Moscow");
            Man man2 = new Man("Дима", 20, "Moscow");

            Woman woman1 = new Woman("Женя", 35, "Moscow");
            Woman woman2 = new Woman("Саша", 30, "Moscow");


            System.out.println(man1);
            System.out.println(man2);
            System.out.println(woman1);
            System.out.println(woman2);


            //напишите тут ваш код
        }
        public static class Man {
            String name;
            int age;
            String address;

            public Man(String name, int age, String address) {
                this.name = name;
                this.age = age;
                this.address = address;
            }
            public String toString() {
                return name + " " + age + " " + address;
            }
        }

        public static class Woman {
            String name;
            int age;
            String address;

            public Woman(String name, int age, String address) {
                this.name = name;
                this.age = age;
                this.address = address;
            }
            public String toString() {
                return name + " " + age + " " + address;
            }
        }
        //напишите тут ваш код
}

