import java.util.Scanner;

public class Laboratory001{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter word/phrase: ");
        String original = input.nextLine();

        String wordPhrase = "";
        String reverse = "";

        for (int i = 0; i < original.length(); i++) {
            char c = Character.toLowerCase(original.charAt(i));

            if (c >= 'a' && c <= 'z'){
                wordPhrase = wordPhrase + c;
                reverse = c + reverse;
            }
        }
        
        String answer = wordPhrase.equals(reverse) ? " is a " : " is NOT a ";
        System.out.println(original + answer + "palindrome");
    }
}