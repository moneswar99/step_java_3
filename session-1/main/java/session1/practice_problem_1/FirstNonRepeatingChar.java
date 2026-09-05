package session1.practice_problem_1;

public class FirstNonRepeatingChar {

    static char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        char result1 = findFirstNonRepeatingChar("swiss");
        if (result1 != '\0') {
            System.out.println("First Non-Repeating Character: '" + result1 + "'");
        } else {
            System.out.println("No Non-Repeating Character Found");
        }

        char result2 = findFirstNonRepeatingChar("aabbcc");
        if (result2 != '\0') {
            System.out.println("First Non-Repeating Character: '" + result2 + "'");
        } else {
            System.out.println("No Non-Repeating Character Found");
        }
    }
}