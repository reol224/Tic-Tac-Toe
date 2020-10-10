import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                int value = Math.abs(row - col);  // Subtract row - col and take absolute value
                System.out.print(value + " ");
            }
            System.out.println(); // Add newline at end of each row
        }
    }
    }