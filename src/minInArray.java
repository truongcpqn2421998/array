import java.util.Scanner;

public class minInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("Enter size:");
            size=scanner.nextInt();
            if(size>20){
                System.out.println("size should less 20");
            }
        }while (size>20);
        array=new int[size];
        for (int i = 0; i < array.length ; i++) {
            System.out.print("Enter element "+(i+1)+" :");
            array[i]=scanner.nextInt();
        }
        int min=array[0];
        for (int a:array) {
            if(min>a){
                min=a;
            }
        }
        System.out.println("Min in Array:"+min);
    }
}
