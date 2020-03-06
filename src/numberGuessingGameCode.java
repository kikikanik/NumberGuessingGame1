import java.util.Scanner;
import java.util.Random;
public class numberGuessingGameCode {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Random rand = new Random();
		
		int randomNumber = rand.nextInt(5);
	//	int randomNumber2 = 1 + rand.nextInt(5);
		
		System.out.println ("Welcome to the Number Guessing Game!");
		System.out.print("We will give you one try to guess what our secret number is. Enter your guess Now:");
		int guess = in.nextInt();
		if (guess == randomNumber) {
			System.out.print("Our secret has been found out! Congradulations");
		}
		else {
			System.out.print("Incorrect, my friend. It is: " + randomNumber);
		}
		in.close();
	}

}
