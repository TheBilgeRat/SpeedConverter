public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if(a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }
        int burnerB = b;
        while(a > 0) {
            int lastA = a % 10;
            int lastB = burnerB % 10;
            burnerB = burnerB / 10;

            if(lastA == lastB) {
                return true;
            }

            while(burnerB > 0) {
                lastB = burnerB % 10;
                if(lastB == lastA) {
                    return true;
                }
                burnerB = burnerB / 10;
            }
            burnerB = b;
            a = a / 10;
        }
        return false;
    }
}
