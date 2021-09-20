import java.util.Scanner;

public class totalColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter columnSize:");
        int columnSize = scanner.nextInt();
        System.out.print("Enter rowSize:");
        int rowSize = scanner.nextInt();
        int[][] array = new int[columnSize][rowSize];
        for (int i = 0; i < columnSize; i++) {
            for (int j = 0; j < rowSize; j++) {
                System.out.printf("Enter number in index[%d][%d]", i, j);
                array[i][j] = scanner.nextInt();
            }
        }
        int columnSum;
        do {
            System.out.println("Enter the column you want to sum:");
            columnSum = scanner.nextInt();
            if (columnSum < 0 || columnSum > (rowSize - 1)) {
                System.out.println("the number of column you want to sum out of array:");
            }
        } while (columnSum < 0 || columnSum > (rowSize - 1));
        int sum=0;
        for (int i = 0; i <columnSize ; i++) {
            sum+=array[i][columnSum];
        }
        System.out.println("sum of this column is: "+sum);
    }
}
