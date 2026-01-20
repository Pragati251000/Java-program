import java.util.Scanner;

class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] result = new int[2][2];

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                b[i][j] = sc.nextInt();

        System.out.println("1. Addition\n2. Multiplication\n3. Transpose of A");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        result[i][j] = a[i][j] + b[i][j];

                System.out.println("Addition Result:");
                break;

            case 2:
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        for (int k = 0; k < 2; k++)
                            result[i][j] += a[i][k] * b[k][j];

                System.out.println("Multiplication Result:");
                break;

            case 3:
                System.out.println("Transpose of Matrix A:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++)
                        System.out.print(a[j][i] + " ");
                    System.out.println();
                }
                return;

            default:
                System.out.println("Invalid choice");
                return;
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }
    }
}