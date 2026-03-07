import java.util.Scanner;

public class PalindromeCheckerApp {

    static boolean checkPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        long start = System.nanoTime();

        boolean result = checkPalindrome(input);

        long end = System.nanoTime();

        if (result)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        System.out.println("Execution Time: " + (end - start) + " ns");

        sc.close();
    }
}
