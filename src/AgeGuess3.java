import java.util.Random;
import java.util.Scanner;

public class AgeGuess3 {

	public static void main(String[] args) {
		
		String name;
		Scanner scan = new Scanner(System.in);
		Scanner keyboard = new Scanner(System.in);
		Random generator = new Random();
		
		int MIN = 0;
		int MAX = 100;
		int age = generator.nextInt(100) + 0;
		int guess;
		int ageguesscount = 0;
		boolean win = false;
		
		System.out.println("What's your name?");
		name = scan.nextLine();
		System.out.println("Guess my age?");
		guess = scan.nextInt();
		
		int count = 0;
		
		while (win == false) 
		{
			
			System.out.println("You Guessed Wrong");
			count ++;
			
			if (guess < age)
				{System.out.println("Older");}
				
			
			else if (guess > age) 
				{ 
				System.out.println("Younger");
				}
			else
				{ 
				System.out.println("You got it!");
				}

				
		System.out.println("Your Name: " + name + ", " + "Your Guess: " + guess + ", " + "Correct Answer was: " + age);
		
		
		}
	}
}
