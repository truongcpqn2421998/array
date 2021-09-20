import java.util.Scanner;

public class sumOfMainDiagonal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter matrix length: ");
        int size=scanner.nextInt();
        double[][] matrix=new double[size][size];
        System.out.println("Enter "+matrix.length+" row and "+matrix[0].length+"columns");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length;j++) {
                System.out.printf("Enter in index[%d][%d]: ",i,j);
                matrix[i][j]=scanner.nextDouble();
            }
        }
        mainDiagonal(matrix);
    }
    public static void mainDiagonal (double[][] array){
        double sum=0;
        for (int i = 0; i < array.length; i++) {
                sum+=array[i][i];
        }
        System.out.println("Sum of the main diagonal: "+sum);
    }
}
