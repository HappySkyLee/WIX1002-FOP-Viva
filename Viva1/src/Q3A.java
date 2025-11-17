import java.util.Scanner;

public class Q3A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isValid;
        int height;
        char style;

        System.out.print("Enter the number of queries (1-50): ");
        int queries = sc.nextInt();
        if (queries < 1 || queries > 50) {
            System.out.println("Error. Number of queries is out of range (1-50).");
            return;
        }

        for(int i = 0 ; i<queries ; i++) {
            do {
                System.out.println("Enter the height,H (1-9) and Style,S ('A' or 'P'):");
                height = sc.nextInt();
                style = sc.next().charAt(0);
                if (height < 1 || height > 9) {
                    System.out.println("Error. The value is out of range. Try Again!");
                    isValid = false;
                } else if (style != 'P' && style != 'A') {
                    System.out.println("Error. Enter the single uppercase character, 'A' or 'P' only. Try Again!");
                    isValid = false;
                }
                else{
                    isValid = true;
                }
            }while(!isValid);
            for (int row = 1; row <= height; row++) {
                if (style == 'A') {
                    for(int l = 0 ; l < (height - row) ; l++){
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= row; k++) {
                        System.out.print(row);
                    }
                    System.out.println();
                }

                if (style == 'P') {
                    for (int space = 0; space < height - row; space++) {
                        System.out.print(" ");
                    }

                    for (int a = 1; a <= row; a++) {
                        System.out.print(a);
                    }

                    for (int d = row - 1; d >= 1; d--) {
                        System.out.print(d);
                    }
                    System.out.println();
                }

            }

        }
    }
}
