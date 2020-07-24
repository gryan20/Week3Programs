import java.util.Scanner;

public class EvenNumSum {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        System.out.println("Enter a number larger than 2");
	        int num = scan.nextInt();
	        
	        scan.close();
	        
	        if (num >= 2) {
	            int sum = 0;
	            for (int start = 2; start <= num; start +=2) {
	                sum += start;
	            }
	            System.out.println("The sum of all even numbers between 2 and the input is " + sum);
	                } 
	        else 
	                {
	        	System.out.println("Invalid, please enter a number above 2");
	              }
	        
	 }
	 
}

