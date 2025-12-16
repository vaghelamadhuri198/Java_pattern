import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = 5;

		//outer loop
		for (int i = 1; i<= n; i++) {
			//spaces
			for (int j = 1; j<= n - i; j++) {
				System.out.print(" ");
			}
			// star
			for (int j = 1; j <=n ; j++) {
				System.out.print("*");
			}


			System.out.println();
		}
	}
}
