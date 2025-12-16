public class StarPattern {
	public static void main(String[] args) {
		int rows = 5;

		for (int i = 1; i <= rows; i++) {
			// Print leading spaces
			//for (int j = rows; j > i; j--) {
			for (int j = 1; j <= rows - i; j++) {

				System.out.print(" ");
			}

			// Print stars and inner spaces
			for (int j = 1; j <= rows; j++) {
				//if (i == 1 || i == rows || j == 1 || j == rows)
				if (j == 1 || j == rows || i==1 || i == rows) {
					System.out.print("*");
			    }	else  {
					System.out.print(" ");
			    }
			}
			System.out.println();
		}
	}
}
