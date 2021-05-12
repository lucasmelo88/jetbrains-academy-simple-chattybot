import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sequenceNumber = scanner.nextInt();
        int value = scanner.nextInt();
        int maxNum = 0;
        if (sequenceNumber > 1000 || value > 30000) {
            System.out.println("Number is to high");
        } else {
            for (int i = 1; i < sequenceNumber; i++) {
                if (value % 4 == 0 && value > maxNum) {
                    maxNum = value;
                }
                value = scanner.nextInt();
            }
            System.out.println(maxNum);
        }
    }
}