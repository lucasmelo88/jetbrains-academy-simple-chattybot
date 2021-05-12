import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append(num1);
        num1 = Integer.parseInt(sb.reverse().toString());
        System.out.println(num1);
    }

}

