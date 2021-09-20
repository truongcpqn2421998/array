import java.util.Scanner;

public class maxInMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter matrix length: ");
        int size=scanner.nextInt();
        int[][] matrix=new int[size][size];
        System.out.println("Enter "+matrix.length+" row and "+matrix[0].length+"columns");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length;j++) {
                System.out.printf("Enter in index[%d][%d]: ",i,j);
                matrix[i][j]=scanner.nextInt();
            }
        }
        float max=matrix[0][0];
        int index1=0,index2=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < (matrix[i]).length; j++) {
                if(max<matrix[i][j]){
                    max=matrix[i][j];
                    index1=i;
                    index2=j;
                }
            }
        }
        System.out.printf("max number in matrix is %f in index %d:%d",max,index1,index2);
    }
}
