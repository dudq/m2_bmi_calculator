import java.util.Scanner;

public class geometry {
    public static void main(String[] args) {
        int width = 7;
        int height = 5;
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the Rectangle");
            System.out.println("2. Draw the Bottom-Left Square Triangle");
            System.out.println("3. Draw the Bottom-Right Square Triangle");
            System.out.println("4. Draw the Top-Left Square Triangle");
            System.out.println("5. Draw the Top-Right Square Triangle");
            System.out.println("6. Draw the Isosceles Triangle");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    drawRectangle(width, height);
                    break;
                case 2:
                    drawBottomLeftSquareTriangle(width);
                    break;
                case 3:
                    drawBottomRightSquareTriangle(width);
                    break;
                case 4:
                    drawTopLeftSquareTriangle(width);
                    break;
                case 5:
                    drawTopRightSquareTriangle(width);
                    break;
                case 6:
                    drawIsoscelesTriangle(width);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }

    private static void drawRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void drawBottomLeftSquareTriangle(int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void drawBottomRightSquareTriangle(int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                if (j > (width - 1 - i))
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void drawTopLeftSquareTriangle(int width) {
        for (int i = width; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void drawTopRightSquareTriangle(int width) {
        for (int i = width; i > 0; i--) {
            for (int j = 0; j < width; j++) {
                if (j > (width - 1 - i))
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void drawIsoscelesTriangle(int width) {
        for (int i = 0; i <= (width - 1) / 2; i++) {
            for (int j = 0; j < width; j++) {
                if ((j <= width - 1 - i) && (j >= i)) {
                    System.out.print("* ");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
