public class numberPrime {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
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
