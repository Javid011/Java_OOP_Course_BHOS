import java.util.Scanner;

interface OddChecker {
    boolean check(int num);
}
interface PrimeChecker {
    boolean check(int num);
}
interface PalindromeChecker {
    boolean check(int num);
}

public class LambdaApp {
    public static void main(String[] args) {
        OddChecker isOdd = num -> num % 2 != 0;

        PrimeChecker isPrime = num -> {
            if (num < 2) return false;
            if (num == 2) return true;
            if (num % 2 == 0) return false;
            for (int i = 3; i * i <= num; i += 2) {
                if (num % i == 0) return false;
            }
            return true;
        };

        PalindromeChecker isPalindrome = num -> {
            int original = num, reversed = 0;
            while (num > 0) {
                reversed = reversed * 10 + num % 10;
                num /= 10;
            }
            return original == reversed;
        };

        try (Scanner sc = new Scanner(System.in)) {
            int testCases = sc.nextInt();
            while (testCases-- > 0) {
                int operation = sc.nextInt();
                int num = sc.nextInt();

                switch (operation) {
                    case 1 -> System.out.println(isOdd.check(num) ? "ODD" : "EVEN");
                    case 2 -> System.out.println(isPrime.check(num) ? "PRIME" : "COMPOSITE");
                    case 3 -> System.out.println(isPalindrome.check(num) ? "PALINDROME" : "NOT PALINDROME");
                    default -> System.out.println("INVALID OPERATION");
                }
            }
        }
    }
}
