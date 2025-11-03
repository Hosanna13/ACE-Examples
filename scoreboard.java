import java.util.ArrayList;
import java.util.Scanner;

public class scoreboard {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();
        int choice = 0; 

    
        while (choice != 4) {
            String name = "";
            System.out.println();
            System.out.println(" Select an option:");
            System.out.println("*1. Add Player");
            System.out.println("2. Delete Player");
            System.out.println("3. View Players");
            System.out.println("4. Exit");

            System.out.print("Enter your choice [1/2/3/4]: ");
            choice = Integer.parseInt(input.nextLine());

            // add player name 
            if(choice == 1){
                System.out.print(" Enter your name: ");
                name = input.nextLine();
                System.out.print(" Enter your score: ");
                int score = Integer.parseInt(input.nextLine());
                names.add(name);
                scores.add(score);
                System.out.println(" Player added.");
                System.out.println();
            }
            

            // delete player name 
            else if(choice == 2){
                System.out.print(" Enter the name of the player to delete: ");
                name = input.nextLine();
                int index = names.indexOf(name);
                if(index != -1){
                    names.remove(index);
                    scores.remove(index);
                }
                System.out.println();
            }

            // view players 
            else if(choice == 3){
                System.out.println();
                System.out.println(" Scoreboard:");
                for(int i = 0; i < names.size(); i++){
                    System.out.println((i+1) + ". " + names.get(i) + " - " + scores.get(i));
                }
                System.out.println();
            }

        }

        // get max score 
        int maxInt = 0;
        int maXScore = scores.get(0);
        for(int i = 1; i < scores.size(); i++){
            if (scores.get(i) > maXScore){
                maXScore = scores.get(i);
                maxInt = i;
            }
        }
        int numStars = ( scores.get(maxInt) / maXScore ) * 50; // use fractions


        // display winner
        System.out.println();
        System.out.println("Scoreboard: ");
        System.out.println("------------------------");
        System.out.println(numStars);
        for(int i = 0; i < names.size(); i++){
            if (names.get(i) != "")
            {
                System.out.print(names.get(i) + ": ");
            }

           if (i == maxInt && names.get(i) != "") {
            for( int j = 0; j < numStars; j++){
               System.out.print("* ");
            }
           } else {
               System.out.print("  ");
           }
        }
        System.out.print("* ");
        

        System.out.println("Goodbye!");
        input.close();
}
}
