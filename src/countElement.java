import java.util.Scanner;

public class countElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string:");
        String magic= scanner.nextLine();
        System.out.println("Enter character:");
        char X=scanner.next().charAt(0);
        int count=0;
        for (int i = 0; i <magic.length() ; i++) {
            if(X==magic.charAt(i)){
                count++;
            }
        }
        System.out.printf("Character appearing %d times in string",count);
    }

}
