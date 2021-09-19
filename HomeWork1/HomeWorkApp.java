public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

        public static void printThreeWords(){
        System.out.println("Задание 2: ответ");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    //задание 3
    public static void checkSumSign(){
            int a = -12;
            int b = 10;
            int result = a + b;
        System.out.println("Задание 3: ответ");
            System.out.println("Result = " + result);
            if (result >=0) {
                System.out.println("Сумма положительная");
            }
            else {
                System.out.println("Сумма отрицательная");
            }
        }
    public static void printColor(){
        int value = 5;
        System.out.println("Задание 4: ответ");
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
        else {
            System.out.println("Желтый");
        }
    }
    public static void compareNumbers(){
        int a = 15;
        int b = 27;
        System.out.println("Задание 5: ответ");
        if (a>=b) {
            System.out.println("a>=b");}
        else {
                System.out.println("a<b");
            }
        }
    }



