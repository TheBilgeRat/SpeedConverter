public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        number = Math.abs(number);
        int numCopy = number;

        while (number > 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number = number / 10;
        }

        return reverse == numCopy;
    }
}
