import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of queries (1-50): ");
        int queries = sc.nextInt();
        if (queries < 1 || queries > 50) {
            System.out.println("Error. Number of queries is out of range (1-50).");
            return;
        }

        for(int i = 0 ; i<queries ; i++) {
            System.out.println("Enter the height,H (1-9) and Style,S ('A' or 'P'):");
            int height = sc.nextInt();
            char style = sc.next().charAt(0);
            if (height < 1 || height > 50) {
                System.out.println("Error. The value is out of range.");
                continue;
            } else if (style != 'P' && style != 'A') {
                System.out.println("Error. Enter the single uppercase character, 'A' or 'P' only");
                continue;
            }

            for(int row = 1; row <= height; row++) {
                if (style == 'A') {
                    for(int k = 1 ; k <= row ; k++) {
                        System.out.print(row);
                    }
                    System.out.println();
                }

                if (style == 'P') {
                      for (int space = 0; space < height - row; space++){ // loop for leading space
                          System.out.print(" ");
                      }

                      for (int a = 1; a <= row; a++) { //loop for ascending number
                          System.out.print(a);
                      }

                      for(int d = row - 1 ; d >= 1 ; d-- ){ //loop for descending order
                          System.out.print(d);
                      }
                      System.out.println();
                }

            }
        }
    }
}
