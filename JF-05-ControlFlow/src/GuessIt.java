import java.util.Random;

public class GuessIt {
    public static void main(String[] args) {
        int randomNum =  new Random().nextInt(3) + 1; //  1 , 2, 3
        System.out.printf("Generated number is: %d.%n", randomNum);

        if (randomNum == 3) {
            System.out.println("You got it!");
        } else {
            System.out.println("Sorry, you didn't get it. ");
        }
    }
}
