import java.util.Scanner;

public class addValue {
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
        System.out.println("\n Enter X:");
        int X=scanner.nextInt();
        System.out.println("Enter index:");
        int index=scanner.nextInt();
        if(index<=-1||index>= (array.length-1)){
            System.out.println("can't add value");
        }else {
            int[] newArray=new int[size+1];
            for(int i=0,j=0;i<newArray.length;i++,j++){
                if(i==index){
                    newArray[i]=X;
                    j--;
                    continue;
                }
                newArray[i]=array[j];
            }
            System.out.print("New Array: ");
            for (int a:newArray) {
                System.out.print(a+"\t");
            }
        }
    }
}
