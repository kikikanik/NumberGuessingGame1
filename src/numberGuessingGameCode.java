import java.util.Scanner;
import java.util.Random;
public class numberGuessingGameCode {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Random rand = new Random();

		int randomNumber = rand.nextInt(5);
		int guess;
		//	int guessCount 
		//	int randomNumber2 = 1 + rand.nextInt(5);

		System.out.println ("Welcome to the Number Guessing Game! Try to find out our secret. Our secret number is between 0 and 5");

		System.out.print("Enter your guess Now:");
		guess = in.nextInt();
		while(true) {
			if (guess == randomNumber) {
				break;
			}
			while (guess != randomNumber) {
				System.out.print("Incorrect, my friend. Try again:");
				guess = in.nextInt();
			}
			System.out.print("Our secret has been found out! Congradulations");
			in.close();
		}

	}
}
