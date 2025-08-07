import java.util.*;

public class Main {

    public static void main(String[] args) {
        String userInput = "aaaaabbc";
        char target = 'b';

        int count = tell(userInput, target);
        System.out.println(target + " = " + count);
    }

    public static int tell(String input, char targetChar) {
        int count = 0;

        for (char ch : input.toCharArray()) {
            if (Character.toLowerCase(ch) == Character.toLowerCase(targetChar)) {
                count++;
            }
        }

        return count;  // ✅ Return is now inside method
    }
}