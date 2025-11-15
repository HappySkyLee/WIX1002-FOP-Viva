import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of queries (1-200): ");
        int T = sc.nextInt();
        if (T < 1 || T > 200) {
            System.out.println("Error. Number of queries is out of range (1-200).");
            return;
        }


        for(int i = 0 ; i<T ; i++){
            int LuckyCount = 0;
            int ZeroCount = 0;
            int EvenCount = 0;
            int OddCount = 0;

            System.out.print("Enter the Number (0-2,000,000,000) follow by Lucky Digit (0-9): ");
            int N = sc.nextInt();
            int L = sc.nextInt();
            if(  N<0 || N>2000000000 || L<0 || L>9 ){
                System.out.println("Error. The number is out of range.");
                continue;
            }

            int numDigits = String.valueOf(N).length();
            for(int j = 0 ; j<numDigits ; j++){

                int CurrentDigit = N % 10;
                if( CurrentDigit == L ){
                    LuckyCount++;
                }
                else if( CurrentDigit == 0 ){
                    ZeroCount++;
                }
                else if( CurrentDigit % 2 == 0 ){
                    EvenCount++;
                }
                else{
                    OddCount++;
                }
                N /= 10;
            }

            if( LuckyCount>ZeroCount && LuckyCount>EvenCount && LuckyCount>OddCount ){
                System.out.println("LUCKY");

            }
            else if( EvenCount>ZeroCount && EvenCount>LuckyCount && EvenCount>OddCount ){
                System.out.println("BALANCED");

            }
            else if( OddCount>ZeroCount && OddCount>EvenCount && OddCount>LuckyCount ){
                System.out.println("ENERGETIC");

            }
            else{
                System.out.println("NEUTRAL");

            }
        }
    }
}
