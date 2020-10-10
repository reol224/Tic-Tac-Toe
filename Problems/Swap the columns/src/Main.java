import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        int [][] matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scanner.nextInt();}}

        int c0 = scanner.nextInt();
        int c1 = scanner.nextInt();

        for (int i=0; i < row; i++) {
            int temp = matrix[i][c0];
            matrix[i][c0] = matrix[i][c1];
            matrix[i][c1] = temp;
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j]+" "); }
            System.out.println();}

    }
}