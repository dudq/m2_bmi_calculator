import java.util.Scanner;

public class exchangeMoney {
    public static void main(String[] args) {
        int exchangeRateUSDvsVND = 23000;
        float amountUSD;
        float amountVND;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amont USD: ");
        amountUSD = scanner.nextFloat();
        amountVND = amountUSD * exchangeRateUSDvsVND;
        System.out.printf(" VND = %f", amountVND);
    }
}
