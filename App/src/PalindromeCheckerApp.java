import java.util.*;

interface PalindromeStrategy {
    boolean check(String str);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray())
            stack.push(c);

        for (char c : str.toCharArray()) {

            if (c != stack.pop())
                return false;
        }

        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {

    public boolean check(String str) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray())
            deque.add(c);

        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast())
                return false;
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeStrategy strategy = new StackStrategy();

        if (strategy.check(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}
