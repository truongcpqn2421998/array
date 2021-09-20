import javafx.scene.transform.Scale;

import java.util.Scanner;

public class minimum {
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
        array= new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter element %d:",i+1);
            array[i]=scanner.nextInt();
        }
        int index= foundMin(array);
        System.out.println("The smallest element in the array is:"+array[index]);
    }
    public static int foundMin(int[] array){
        int index=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<array[index]){
                index=i;
            }
        }
        return index;
    }
}
