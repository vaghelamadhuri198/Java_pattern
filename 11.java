public class Main {
	public static void main(String[] args) {
		int n = 5 ;

		//outer loop
		for (int i = 1; i <= n; i++) {
			//(pre increment)
			//System.out.print(i++);
			//(post increment)
			System.out.print(++i);
		}

		System.out.println();
	}
}
