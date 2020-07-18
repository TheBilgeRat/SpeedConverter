public class NumberToWords {
    public static void  numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reversedNum = reverse(number);
            int revCnt = getDigitCount(reversedNum);
            int origCnt = getDigitCount(number);
            for(int i = 0; i < revCnt; i++) {
                int firstDigit = reversedNum % 10;
                reversedNum = reversedNum / 10;
                switch (firstDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        break;
                }
            }
            if(origCnt > revCnt) {
                for(int i = revCnt; i < origCnt; i++) {
                    System.out.println("Zero");
                }
            }
        }
    }

    public static int reverse(int number) {
        int remainder;
        int reversedNum = 0;
        while(number != 0) {
            remainder = number % 10;
            number = number / 10;
            reversedNum = (reversedNum * 10) + remainder;
        }
        return reversedNum;
    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        }
        if(number == 0) {
            return 1;
        }
        int count = 0;
        while(number > 0) {
            count++;
            number = number / 10;
        }
        return count;
    }
}
