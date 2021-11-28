public abstract class Animal {
    public static Object animalcount;
    private String name;
    private String type;
    private int runMax;
    private int swimMax;
    private int rundistance;
    private int swimdistance;
    public static int countAnimal = 0;

    public Animal(String name, String type, int runMax, int swimMax, int rundistance, int swimdistance) {
        this.name = name;
        this.type = type;
        this.runMax = runMax;
        this.swimMax = swimMax;
        this.rundistance = rundistance;
        this.swimdistance = swimdistance;
        ++countAnimal;
    }

    public void run() {
        if (rundistance <= runMax) {
            System.out.println(name + " " + " " + type + " " + "пробежал " + rundistance + " метров");
        } else {
            System.out.println(name + " " + " " + type + " " + "не пробежал " + rundistance + " метров");
        }
    }

    public void swim() {
        if (swimdistance <= swimMax) {
            System.out.println(name + " " + " " + type + " " + "проплыл " + swimdistance + " метров");
        } else {
            System.out.println(name + " " + " " + type + " " + "не проплыл " + swimdistance + " метров");
        }
    }
}