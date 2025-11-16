import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            String compressedLog = sc.next();

            long decompressedLength = 0;
            boolean isValid = true;


            for (int i = 0; i < compressedLog.length(); i++) {
                char c = compressedLog.charAt(i);

                //Rule C
                if (c == '0' || c == '1') {
                    isValid = false;
                    break;
                }
                else if (c >= 'a' && c <= 'z') {
                    decompressedLength++;
                }
                //Rule A
                else if (c >= '2' && c <= '9') {
                    if (i == 0) {
                        isValid = false;
                        break;
                    }

                    //Rule B
                    char precedingChar = compressedLog.charAt(i - 1);
                    if (precedingChar >= '2' && precedingChar <= '9') {
                        isValid = false;
                        break;
                    }

                    int d = c - '0'; // Convert the character digit to its integer value (e.g., '4' -> 4)
                    int additionalRepeats = d - 1;
                    decompressedLength += additionalRepeats;
                }

            }

            if (isValid) {
                System.out.println(decompressedLength);
            } else {
                System.out.println("Invalid Log");
            }
        }

    }
}