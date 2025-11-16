import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] vowel = {'a','e','i','o','u'};


        System.out.print("Enter the number of test (1-100): ");
        int test = sc.nextInt();
        sc.nextLine(); //clear the \n
        if (test < 1 || test > 100) {
            System.out.println("Error. Number of test is out of range (1-100).");
            return;
        }

        for(int i = 0 ; i<test ; i++){
            boolean rule = true;

            System.out.println("Enter the word ( 1-50 character ): ");
            String word = sc.nextLine();
            int length = word.length();

            if( length<1 || length>50 ){
                System.out.println("Error. The length of the word is out of range.");
                continue;
            }

            String LowercaseWord = word.toLowerCase();
            char LastCharacter = LowercaseWord.charAt(length-1);

            //Rule 1
            for(int j = 0 ; j<5 ; j++){
                if(LastCharacter == vowel[j]){
                    rule = false;
                    break;
                }
            }

            //Rule 2
            for(int j = 0 ; j<length-1 ; j++){
                char currentCharacter = LowercaseWord.charAt(j);
                char nextCharacter = LowercaseWord.charAt(j+1);

                for(int k = 0 ; k<5 ; k++){
                    if(currentCharacter == vowel[k]){

                        for(int l = 0 ; l<5 ; l++){
                            if(nextCharacter == vowel[l]){
                                rule = false;
                                break;
                            }
                        }
                    }
                }
            }

            if(rule){
                System.out.println("Harmony");
            }
            else{
                System.out.println("Chaos");
            }


        }
    }
}

