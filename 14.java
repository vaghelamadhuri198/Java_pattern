public class PalindromePyramid {
    public static void main(String[] args) {
        int n = 5; // number of rows

        for (int i=1; i<=n; i++) {
            // print spaces
            for (int j=1; j<=n-i; j++) {
                //for (int j=i; j<=n; j++) {
                System.out.print(" ");
            }

            // print decreasing numbers
                for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // print increasing numbers
            for (int j = 2; j<=i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
