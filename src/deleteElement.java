import java.util.Scanner;

public class deleteElement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("Enter a size:");
            size=scanner.nextInt();
            if(size>20){
                System.out.println("Size should not exceed 20");
            }
        }while (size>20);
        array=new int[size];
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Enter element "+(i+1)+':');
            array[i]=scanner.nextInt();
        }
        System.out.print("Array: ");
        for (int a:array) {
            System.out.print(a+"\t");
        }
        System.out.print("\n Enter X:");
        int X=scanner.nextInt();
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==X){
                count++;
            }
        }
        if (count!=0){
            size=size-count;
            int[] newArray=new int[size];
            for (int i = 0,j=0; i < array.length ; i++,j++) {
                if(array[i]==X){
                    j--;
                    continue;
                }
                newArray[j]=array[i];
            }
            System.out.print("New Array: ");
            for (int a:newArray) {
                System.out.print(a+"\t");
            }
        }else {
            System.out.println("No X:");
        }
    }
}
