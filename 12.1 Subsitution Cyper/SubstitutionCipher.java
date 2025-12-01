import java.util.Scanner;
public class SubstitutionCipher {
    public static char getChoice(Scanner in){
        char choice = ' '; 
        while(choice != 'E' && choice != 'D' && choice != 'Q'){
            System.out.print("Enter your choice (E)ncrypt, (D)ecrypt, or (Q)uit: ");
            String input = in.nextLine().trim().toUpperCase();
            if (input.length() == 1){
                choice = input.charAt(0);
            }
            }
           return choice;
        }

        
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Char: " + getChoice(in));
        
    }
}

