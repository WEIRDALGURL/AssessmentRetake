import java.util.Scanner;

/**
 * Created by lrterry on 10/13/16.
 */
public class Question2 {
    public static void main(String[] args) {
        //Ask a user to add in a number, save it to a variable and print out that variable.
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int response = userInput.nextInt();
        System.out.print(response);
    }
}