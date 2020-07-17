public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean ret = false;
        if(summer) {
            ret = temperature >= 25 && temperature <= 45;
        } else {
            ret = temperature >= 25 && temperature <= 35;
        }
        return ret;
    }
}
