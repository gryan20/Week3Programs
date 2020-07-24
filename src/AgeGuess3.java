import java.util.Random;
import java.util.Scanner;

public class AgeGuess3 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		Scanner keyboard = new Scanner(System.in);
		Random generator = new Random();
		
	
		int age = generator.nextInt(100) + 0;
		int guess;
			
		System.out.println("What's your name?");
		String name = scan.nextLine();
			
		{
			do {
				
				System.out.println("Guess my age?");
				guess = keyboard.nextInt();
				System.out.println("You Guessed Wrong");
			
			
			if (guess == age)
			{System.out.println("That is correct!");}
			
			else if (guess < age)
				{System.out.println("Older");}			
			else if (guess > age) 
				{ System.out.println("Younger");}		
			} 
			while (guess != age);
			{
		
		scan.close();
		keyboard.close();
	
		System.out.println("Your name is: " + name + "Your last Guess was: "+ guess + "My actual age was: " + age);
		}
}
}
}