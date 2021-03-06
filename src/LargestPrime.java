public class LargestPrime {
    public static int getLargestPrime(int number) {
        if(number < 2) {
            return -1;
        }

        int prime = 0;
        for(int i = 2; i <= number; i++) {
            if(number % i == 0) {
                prime = i;
                number /= i;
                i--;
            }
        }
        return prime;
    }
}
