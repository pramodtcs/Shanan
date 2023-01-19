package Star_Pattern;

public class Right_Angle_Reverse {



	public static void main(String[] args) {
		
		int star = 0;
		for (int i=1;i<=5;i++) {
			
			for (int j=1;j<=star;j++) {
				System.out.print("*");
				
			}
		}
			System.out.println();
			
			star--;
		}
	}

