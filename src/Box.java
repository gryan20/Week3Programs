

public class Box {
	public int size = 0;
	
	
	public void printBox() { 
		
		for (int row =0;  row < size; row ++)
		{
			for (int col = 0; col < size; col ++)
				{	
			System.out.print("*");
		}
			System.out.println();
		}
	}
		 public static void main(String[] args) {
			Box myBox = new Box();
		 	myBox.size = 5;
			myBox.printBox();
	 }
}
	 
	 	