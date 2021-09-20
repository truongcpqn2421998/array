import java.util.Scanner;

public class findElenmentInArray {
    public static void main(String[] args) {
        String[] students = {"Talya", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name’s student:");
        String input_name = scanner.nextLine();
        boolean isExist=false;
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(input_name)){
                System.out.println("Positive of the student in the list "+input_name+" is "+i);
                isExist=true;
                break;
            }
        }
        if(!isExist){
            System.out.println("No found "+input_name+" in the list");
        }
    }

}
