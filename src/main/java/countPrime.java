import java.util.Scanner;

public class countPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 0;
        System.out.println("Enter amount of prime that you want to print!");
        number = scanner.nextInt();
        if (number > 0) {
            int i = 2;
            while (count < number) {
                if (checkPrime(i)) {
                    count++;
                    System.out.println(count + " " + i);
                }
                i++;
            }
        }
    }

    private static boolean checkPrime(int number) {
        if (number < 2)
            return false;
        else
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) return false;
            }
        return true;
    }
}
