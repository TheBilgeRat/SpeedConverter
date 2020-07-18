public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for(int i = 1; i <= number; i++) {
            if(number % i == 0 && i != number) {
                sum += i;
            }
        }
        return sum == number;
    }
}
