import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int pieces = scanner.nextInt();
        int totalPieces = length * width;
        if (pieces > totalPieces) {
            System.out.println("NO");
        } else if (pieces < length || pieces < width) {
            System.out.println("NO");
        } else if (pieces % length == 0 || pieces % width == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
