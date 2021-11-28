public class Cat extends Animal {
    Cat(String name, String type, int runMax, int swimMax, int rundistance,int swimdistance)
    {
        super(name,type,runMax,swimMax,rundistance,swimdistance);
    }
    @Override
    public void swim() {
        System.out.println("По условиям ТЗ коты 'не хотят' плавать");
    }
}



