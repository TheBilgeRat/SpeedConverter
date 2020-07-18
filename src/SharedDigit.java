public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if(a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }

        int lastA = a % 10;
        a = a / 10;

        int lastB = b % 10;
        b = b / 10;

        return ( lastA == lastB || lastA == b || lastB == a || a == b);
    }
}
