package Star_Pattern;

public class Right_angel_Star {
	
	private static int Star = 1;

	public static void main(String[] args) {
		 for (int i=1;i<=6;i++) {// outer for loop 
			 
			 for (int j=1;j<=Star;j++){// inner for loop 

				 
				 System.out.print("*");
			 }
				
			 System.out.println(); 
			 Star++;
		 }
	}

}
