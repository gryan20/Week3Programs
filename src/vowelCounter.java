import java.util.Scanner;

public class vowelCounter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Please write a sentance. ");
        String line = scan.nextLine();	
	        int a = 0; 
	        int e = 0; 
	        int i = 0; 
	        int o = 0; 
	        int u = 0; 
	        int other = 0, digits = 0;

	        line = line.toLowerCase();
	        for(int sentance = 0; sentance < line.length(); ++sentance)
	        {
	            char ch = line.charAt(sentance);
	            if(ch == 'a' ) {
	                ++a; }
	            else if (ch == 'e') {
	                ++e;  }
	            else if (ch == 'i') {
	                ++i; }
	            else if (ch == 'o') {
	                ++o; }
	            else if (ch == 'u') {
	                ++u;
	            }
	            else if((ch >= 'a' && ch <= 'z')) {
	                ++other;
	            }
	            else if( ch >= '0' && ch <= '9')
	            {
	                ++digits;
	            }
	            
	        }

	        System.out.println("Vowels 'a': " + a + ", 'e':" + e + ", 'i':" + i + ", 'o':" + o + ": 'u':" + u);
	        System.out.println("Consonants: " + other);
	        System.out.println("Digits: " + digits);
	    
	        scan.close();   
	    }
	}
