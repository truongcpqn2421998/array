import java.util.Scanner;

public class merge2Array {
    public static void main(String[] args) {
        int size1;
        int[] array1;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.print("Enter a size1:");
            size1=scanner.nextInt();
            if(size1>20){
                System.out.println("Size should not exceed 20");
            }
        }while (size1>20);
        array1=new int[size1];
        for (int i = 0; i <array1.length ; i++) {
            System.out.println("Enter element "+(i+1)+':');
            array1[i]=scanner.nextInt();
        }
        int size2;
        int[] array2;
        do{
            System.out.print("Enter a size2:");
            size2=scanner.nextInt();
            if(size2>20){
                System.out.println("Size should not exceed 20");
            }
        }while (size2>20);
        array2=new int[size2];
        for (int i = 0; i <array2.length ; i++) {
            System.out.println("Enter element "+(i+1)+':');
            array2[i]=scanner.nextInt();
        }
        System.out.print("Array1: ");
        for (int a:array1) {
            System.out.print(a+"\t");
        }
        System.out.print("\nArray2: ");
        for (int a:array2) {
            System.out.print(a+"\t");
        }
        merge(array1,array2);

    }
    public static void merge(int[] array1,int[] array2){
        int size=array1.length+ array2.length;
        int[] array3=new int[size];
        for (int i = 0; i < array1.length; i++) {
            array3[i]=array1[i];
        }
        for (int i = array1.length,j=0; i <size ; i++,j++) {
            array3[i]=array2[j];
        }
        System.out.print("\nArray3: ");
        for (int a:array3) {
            System.out.print(a+"\t");
        }
    }
}
