package session1.practice_problem_1;

public class ReverseCustomerName {

    static String reverseCustomerName(String customerName) {
        char[] chars = customerName.toCharArray();
        StringBuilder reversed = new StringBuilder();

        for (int i = chars.length - 1; i >= 0; i--) {
            reversed.append(chars[i]);
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String name = "Sunil";
        String reversedName = reverseCustomerName(name);
        System.out.println("Original Name: " + name);
        System.out.println("Reversed Name: " + reversedName);
    }
}