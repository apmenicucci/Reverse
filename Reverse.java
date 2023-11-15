import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.print("Input: ");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String reversedString = "";
        int numChar = input.length() - 1;
        for (int y = 0; y <= numChar;) {
            char sub = input.charAt(numChar);
            reversedString += sub;
            numChar--;
        }
        System.out.println(reversedString);
        s.close();
    }
}