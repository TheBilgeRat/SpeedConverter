public class NumberToWords {
    public static void  numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        } else {

        }
    }

    public static int reverse(int number) {
        return -1;
    }

    public static int getDigitCount(int number) {
        int count = 0;
        while(number > 0) {
            count++;
            number = number / 10;
        }
        return count;
    }
}
