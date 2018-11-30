package level3.lesson4.task003;

/*
Привет StarCraft!
*/

public class task003 {
    public static void main(String[] args) {

        Protoss protoss1 = new Protoss();
        Protoss protoss2 = new Protoss();
        Protoss protoss3 = new Protoss();
        protoss1.name = "p1";
        protoss2.name = "p2";
        protoss3.name = "p3";

        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        zerg1.name = "z1";
        zerg2.name = "z2";
        zerg3.name = "z3";
        zerg4.name = "z4";
        zerg5.name = "z5";

        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        terran1.name = "t1";
        terran2.name = "t2";
        terran3.name = "t3";



        //напишите тут ваш код
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
