public class HomeWorkAppTwo {
    public static void main(String[] args) {
        if (checkSumSign(10, 61)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (checkInt(-5)) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
        System.out.println(isNegativ(-1));//задание 3
        ismethodName("andrei",3);
        System.out.println("Year " + year(2015));
    }
    public static boolean checkSumSign(int a, int b) {
        return a + b > 10 && a + b <= 20;
    }

    public static boolean checkInt(int c) {
        return c >= 0;
    }

    public static boolean isNegativ(int d) {
        if (d < 0) return true;
        else return false;
    }
    public static void ismethodName(String name, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(name);
        }

    }

    public static boolean year (int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0); //Ваше решение гораздо прктичнее чем этаж if и else
    }
}




