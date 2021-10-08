public class Home6 {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", "Бенгал", 200, 1, 150, 10);
        Cat cat2 = new Cat("Мурзик", "Британец", 400, 2, 120, 35);
        Dog dog1 = new Dog("Тузик", "Овчарка", 500, 10, 400, 5);
        Dog dog2 = new Dog("Бобик", "Питбуль", 350, 5, 365, 12);

        Animal[] animals = {cat1, cat2, dog1, dog2};

        for (int i = 0; i < animals.length; i++) {
            animals[i].run();
            animals[i].swim();
            }
        System.out.println("Общее колличество животных учавствовавших в соревнованиях = " + Animal.countAnimal);
        }
    }