public class MinutesToYearsDaysCalculator {
    public static final Long HOUR_FACTOR = 60L;
    public static final Long DAY_FACTOR = 24L;
    public static final Long YEAR_FACTOR = 365L;

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        }

        long years = ((minutes / HOUR_FACTOR) / DAY_FACTOR) / YEAR_FACTOR;
        long remDays = ((minutes / HOUR_FACTOR) / DAY_FACTOR) % YEAR_FACTOR;
        System.out.println(minutes + " min = " + years + " y and " + remDays + " d");
    }
}
