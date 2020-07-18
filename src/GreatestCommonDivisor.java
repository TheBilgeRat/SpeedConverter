public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10) {
            return -1;
        }

        int gcd = 0;
        int smallest = first < second ? first : second;
        for(int i = 1; i < smallest; i++) {
            if(first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
