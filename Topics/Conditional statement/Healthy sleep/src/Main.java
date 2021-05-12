import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minSleepHours = scanner.nextInt();
        int maxSleepHours = scanner.nextInt();
        int sleepedHours = scanner.nextInt();
        if (sleepedHours <  minSleepHours) {
            System.out.println("Deficiency");
        } else if (sleepedHours > maxSleepHours) {
            System.out.println("Excess");
        } else if (sleepedHours >= minSleepHours || sleepedHours <= maxSleepHours) {
            System.out.println("Normal");
        }
    }
}
