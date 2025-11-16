import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;


        System.out.println("Enter a string that not longer than 50 character: ");
        String string = sc.nextLine();
        String s = string.toLowerCase();
        int lengthString = s.length();

        System.out.println("Enter a single positive integer for the length of the substrings: ");
        int lengthSubString = sc.nextInt();

        if (lengthString < 1 || lengthString > 50) {
            System.out.println("Error. Number of queries is out of range (1-50).");
            return;
        }


        if(lengthString < lengthSubString){
            return;
        }


        String CoreValue = "";
        String firstSubString = s.substring(0,lengthSubString);
        String FirstWhisper = firstSubString;
        String LastEcho = firstSubString;


        for(int i = 0 ; i <= (lengthString - lengthSubString) ; i++){
            int sum = 0;

            String subString = s.substring(i,i+lengthSubString);
            System.out.println(subString);

            for(int j = 0 ; j < lengthSubString ; j++) {
                int ascii = subString.charAt(j);
                sum += ascii;
                if(sum > max){
                    max = sum;
                    CoreValue = subString;
                }
                if (subString.compareTo(FirstWhisper) < 0) {
                    FirstWhisper = subString;
                }
                if (subString.compareTo(LastEcho) > 0) {
                    LastEcho = subString;
                }
            }

        }
        System.out.println("First Whisper: " + FirstWhisper);
        System.out.println("Last Echo: " + LastEcho);
        System.out.println("Core Value: " + CoreValue);
    }
}
