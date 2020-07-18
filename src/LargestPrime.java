public class LargestPrime {
    public static int getLargestPrime(int number) {
        if(number < 2) {
            return -1;
        }
        if(number == 2) {
            return 2;
        }

        int prime = 2;
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                boolean isPrime = true;
                for(int j = 2; j <= i / 2; j++) {
                    if(i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime && i > prime) {
                    prime = i;
                }
            }
        }
        return prime;
    }
}
