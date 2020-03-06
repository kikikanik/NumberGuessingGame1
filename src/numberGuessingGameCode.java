import java.util.Scanner;
import java.util.Random;
public class numberGuessingGameCode {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Random rand = new Random();

		int randomNumber = rand.nextInt(5);
		int guess;
		int guessCounter = 1;
		//	int randomNumber2 = 1 + rand.nextInt(5);

		System.out.println ("Welcome to the Number Guessing Game! Try to find out our secret. Our secret number is between 0 and 5 inclusive");

		System.out.print("Enter your guess Now:");
		guess = in.nextInt();
		while(true) {
			if (guess == randomNumber) {
				break;
			}
			while (guess != randomNumber) {
				System.out.print("Incorrect, my friend. Try again:");
				guess = in.nextInt();
				guessCounter = guessCounter + 1;
			}
			System.out.println("Our secret has been found out! Congradulations");
			System.out.println(guessCounter + " tries!");
			in.close();
		}

	}
}
