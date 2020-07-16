public class LeapYear {
    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999)
            return false;

        boolean ret = false;
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    ret = true;
                }
            } else {
               ret = true;
            }
        }
        return ret;
    }
}
