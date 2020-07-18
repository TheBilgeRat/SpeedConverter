public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // big: 5kg, small: 1kg, goal amount of kilos to assemble a package
        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        return true;
    }
}
