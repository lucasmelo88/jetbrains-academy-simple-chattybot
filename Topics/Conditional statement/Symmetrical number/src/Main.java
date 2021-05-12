import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        String valueAsString = String.valueOf(value);
        String value1 = valueAsString.substring(0, 2);
        String value2 = valueAsString.substring(2, 4);
        StringBuilder reversedValue2 = new StringBuilder(value2);
        reversedValue2.reverse();
        int newValue = Integer.parseInt(value1);
        int newValue1 = Integer.parseInt(reversedValue2.toString());
        if (newValue == newValue1) {
            System.out.println(1);
        } else {
            Random random = new Random();
            System.out.println(random.nextInt());
        }
    }
}