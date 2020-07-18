public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // big: 5kg, small: 1kg, goal amount of kilos to assemble a package
        // Case 1: Negatives in any number or too many big bags:
        if(bigCount < 0 || smallCount < 0 || goal < 0 || ((bigCount * 5) > goal && smallCount == 0)) {
            return false;
        }

        // Case 2: verifying that we have enough flour to go around
        return ((bigCount * 5) + smallCount >= goal || bigCount == 0 && smallCount >= goal);
    }
}
