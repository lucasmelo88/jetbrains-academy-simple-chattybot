import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        String textNormalized = text.toLowerCase();
        boolean isEqual = textNormalized.charAt(0) == 'j';
        System.out.println(isEqual);
    }
}