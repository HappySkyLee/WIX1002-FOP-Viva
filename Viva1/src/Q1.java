import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of queries (1-500): ");
        int queries = sc.nextInt();
        if (queries < 1 || queries > 500) {
            System.out.println("Error. Number of queries is out of range (1-500).");
            return;
        }

        for(int i = 0 ; i<queries ; i++){

            System.out.println("Enter the initial value(0-50), Multiplier Seed(0-50) and Charm Length(1-15)");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            if( a<0 || a>50 || b<0 || b>50 || n<1 || n>15 ){
                System.out.println("Error. The value is out of range.");
                continue;
            }

            for(int j = 0 ; j<n ; j++){
                int result = a + (b * (int)Math.pow(2,j));
                System.out.print(result+" ");
            }
            System.out.println();


        }
    }
}
