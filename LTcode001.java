public class LTcode001 {
    import java.util.Scanner;

public class LTcode001 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int originalNumber = x;
        int reversedNumber = 0;

        while (x != 0) {
            int digit = x % 10;
            reversedNumber = reversedNumber * 10 + digit;
            x /= 10;
        }

        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for a number
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        
        // Create an instance of Lt001 to call the isPalindrome method
        LTcode001 solution = new LTcode001();
        
        // Check if the number is a palindrome and output the result
        if (solution.isPalindrome(userInput)) {
            System.out.println(userInput + " is a palindrome.");
        } else {
            System.out.println(userInput + " is not a palindrome.");
        }
        scanner.close();
}
}
    
}
