package level5.lessonfirst.task002;


    public class Cat {
        public String name;
        public int age;
        public int weight;
        public int strength;

        public Cat() {
        }


        public boolean fight(Cat anotherCat) {
            if (this.age + this.weight + this.strength > anotherCat.age + anotherCat.weight + anotherCat.strength)
                return true;
            else if (this.age + this.weight + this.strength == anotherCat.age + anotherCat.weight + anotherCat.strength)
                return true;
            else
                return false;
        }

        public static void main(String[] args) {
            Cat cat1 = new Cat();
            cat1.age = 3;
            cat1.weight = 5;
            cat1.strength = 39;

            Cat cat2 = new Cat();
            cat2.age = 2;
            cat2.weight = 6;
            cat2.strength = 38;

            System.out.println(cat1.fight(cat2));
            System.out.println(cat2.fight(cat1));
        }

    }

