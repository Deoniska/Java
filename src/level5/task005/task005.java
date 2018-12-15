package level5.task005;

/*
Кошачья бойня
*/

public class task005 {
    public static void main(String[] args) {
        Cat cat = new Cat("Murzik", 4, 9, 89);
        Cat cat1 = new Cat("Vaska", 4, 9, 89);
        Cat cat3 = new Cat("Petr", 4, 9, 89);
        System.out.println(cat.fight(cat1));
        System.out.println(cat.fight(cat3));
        System.out.println( cat1.fight(cat3));
        //напишите тут ваш код
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
