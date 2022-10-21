import java.util.Random;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        rangeNumbers(10, 2);
        rangeNumber(10);
        booleanRangeNumber(0);
        printString("Hillel", 10);
        System.out.println(booleanYear(604));
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = 3;
        System.out.println(a + b >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    public static void printColor() {
        int value = 100;
        System.out.println(value <= 0 ? "Красный" : value <= 100 ? "Желтый" : "Зелёный");
    }

    public static void compareNumbers() {
        int a = 25;
        int b = 56;
        System.out.println(a <= b ? "a >= b" : false);
    }

    public static void rangeNumbers(int a, int b) {
        System.out.println(a + b > 10 && a + b <= 20);
    }

    public static void rangeNumber(int value) {
        System.out.println(value >= 0 ? "Положительное число" : "Отрицательное число");
    }

    public static void booleanRangeNumber(int value) {
        System.out.println(value < 0);
    }

    public static void printString(String str, int index) {
        for (int i = 0; i < index; i++) {
            System.out.println(str);
        }
    }

    public static boolean booleanYear(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
}
