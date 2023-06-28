/*Madlib project that allows the user to input his/her own details to create a whole different story.*/
import java.util.Scanner;
public class MadLipStory{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Nelson's Mad Libs Game! created @27 June 2023, by N.Nelson.N\n"); System.out.println("                                    Have funnn!!!");
        System.out.println("");
        System.out.println("");
        
        System.out.print("Enter any adjective e.g beautiful, ugly, handsome, etc (just one): ");
        String adjective =scanner.nextLine();
        
        System.out.print("Now, Enter a noun: ");
        String noun = scanner.nextLine();
        
        System.out.print("Enter a verb ending with ing: ");
        String verb1 = scanner.nextLine();
        System.out.println("Almost there");
        System.out.println("");
          System.out.println("");
           System.out.println("");
        
        System.out.print("Enter a number of your choice: ");
        String number = scanner.nextLine();
        
         
        System.out.println("\nOnce upon a time, in a " + adjective + " land, there lived a " + noun + " who had a peculiar obsession with " + verb1 + ".");
        System.out.println("One day, while " + verb1+ " in the " + noun + "'s " + noun + ", a " + adjective + " " + noun + " appeared out of nowhere.");
        System.out.println("The " + noun + " was " + adjective + ", and it carried a magical " + noun + " that could grant " + number + " wishes.");
        System.out.println("Excitedly, the " + noun + " grabbed the " + noun + " and made a wish to " + verb1 + ".");
        System.out.println("Instantly, " + noun + "'s wish came true, and the " + noun + " found themselves " + verb1 + " happily ever after.");
        
        System.out.print("Created by Nchopereu Nelson @27June2023");
    }
}
