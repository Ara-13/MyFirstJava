import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] arg) {
        Scanner inputReader = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 100);
        int userNum = 0;
        int attempts = 0;
        while (userNum != 999) {
            System.out.println("Guess A Number Between 0 to 100: ");
            try {
                int Test = Integer.parseInt(inputReader.nextLine());
                if (Test < 0 || Test > 100) {
                    System.out.println("You Should Guess Between 0 to 100! ");
                } else {
                    userNum = Test;
                    if (userNum < randomNum) {
                        System.out.println("Guess Higher!");
                        ++attempts;
                    } else if (userNum > randomNum) {
                        System.out.println("Guess Lower!");
                        ++attempts;
                    } else {
                        ++attempts;
                        userNum = 999;
                        System.out.println("You Guessed Correctly!\nWith: " + attempts + " Attempts");
                    }
                }
            } catch (Exception e) {
                System.out.println("Guess a Natural Number between 0 to 100");
            }
            ;
        }
    }
}
