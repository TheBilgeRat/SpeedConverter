import com.sun.security.jgss.GSSUtil;

import java.lang.instrument.ClassDefinition;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        /*
        System.out.println("==================================================== SpeedConverter");
        {
            SpeedConverter.printConversion(100.00d);
        }
        System.out.println("==================================================== MegabytesConverter");
        {
            MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        }
        System.out.println("==================================================== BarkingDog");
        {
            System.out.println(BarkingDog.shouldWakeUp(true, 1));
            System.out.println(BarkingDog.shouldWakeUp(false, 2));
            System.out.println(BarkingDog.shouldWakeUp(true, 8));
            System.out.println(BarkingDog.shouldWakeUp(true, -1));
        }
        System.out.println("==================================================== LeapYear");
        {
            System.out.println(LeapYear.isLeapYear(-1600));
            System.out.println(LeapYear.isLeapYear(1600));
            System.out.println(LeapYear.isLeapYear(2017));
            System.out.println(LeapYear.isLeapYear(2000));
        }
        System.out.println("==================================================== DecimalComparator");
        {
            System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
            System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
            System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
            System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
        }
        System.out.println("==================================================== EqualSumChecker");
        {
            System.out.println(EqualSumChecker.hasEqualSum(1, 1, 1));
            System.out.println(EqualSumChecker.hasEqualSum(1, 1, 2));
            System.out.println(EqualSumChecker.hasEqualSum(1, -1, 0));
        }
        System.out.println("==================================================== TeenNumberChecker");
        {
            System.out.println(TeenNumberChecker.hasTeen(9, 99, 19));
            System.out.println(TeenNumberChecker.hasTeen(23, 15, 42));
            System.out.println(TeenNumberChecker.hasTeen(22, 23, 34));
            System.out.println(TeenNumberChecker.isTeen(9));
            System.out.println(TeenNumberChecker.isTeen(13));
        }
        System.out.println("==================================================== AreaChecker");
        {
            System.out.println(AreaCalculator.area(5.0));
            System.out.println(AreaCalculator.area(-1));
            System.out.println(AreaCalculator.area(5.0, 4.0));
            System.out.println(AreaCalculator.area(-1.0, 4.0));
        }
        System.out.println("==================================================== MinToYearsAndDays");
        {
            MinutesToYearsDaysCalculator.printYearsAndDays(525600);
            MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
            MinutesToYearsDaysCalculator.printYearsAndDays(561600);
        }
        System.out.println("==================================================== IntEqualityPrinter");
        {
            IntEqualityPrinter.printEqual(1, 1, 1);
            IntEqualityPrinter.printEqual(1, 1, 2);
            IntEqualityPrinter.printEqual(-1, -1, -1);
            IntEqualityPrinter.printEqual(1, 2, 3);
        }
        System.out.println("==================================================== PlayingCat");
        {
            System.out.println(PlayingCat.isCatPlaying(true, 10));
            System.out.println(PlayingCat.isCatPlaying(false, 36));
            System.out.println(PlayingCat.isCatPlaying(false, 35));
        }
        System.out.println("==================================================== NumberInWord");
        {
            NumberInWord.printNumberInWord(0);
            NumberInWord.printNumberInWord(1);
            NumberInWord.printNumberInWord(2);
            NumberInWord.printNumberInWord(3);
            NumberInWord.printNumberInWord(4);
            NumberInWord.printNumberInWord(5);
            NumberInWord.printNumberInWord(6);
            NumberInWord.printNumberInWord(7);
            NumberInWord.printNumberInWord(8);
            NumberInWord.printNumberInWord(9);
            NumberInWord.printNumberInWord(-123);
            NumberInWord.printNumberInWord(234);
        }
        System.out.println("==================================================== NumberInWord");
        {
            System.out.println(NumberOfDaysInMonth.isLeapYear(-1600));
            System.out.println(NumberOfDaysInMonth.isLeapYear(1600));
            System.out.println(NumberOfDaysInMonth.isLeapYear(2017));
            System.out.println(NumberOfDaysInMonth.isLeapYear(2000));
            System.out.println("+++++");
            System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2020));
            System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));
            System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018));
            System.out.println(NumberOfDaysInMonth.getDaysInMonth(4, 2020));
            System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
            System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, -2020));
        }
        System.out.println("==================================================== sumOddRange");
        {
            System.out.println(SumOddRange.sumOdd(1, 100));
            System.out.println(SumOddRange.sumOdd(-1, 100));
            System.out.println(SumOddRange.sumOdd(100, 100));
            System.out.println(SumOddRange.sumOdd(13, 13));
            System.out.println(SumOddRange.sumOdd(100, -100));
            System.out.println(SumOddRange.sumOdd(100, 1000));
        }
        System.out.println("==================================================== NumberPalindrome");
        {
            System.out.println(NumberPalindrome.isPalindrome(-1221));
            System.out.println(NumberPalindrome.isPalindrome(707));
            System.out.println(NumberPalindrome.isPalindrome(11212));
        }
        System.out.println("==================================================== FirstLastDigitSum");
        {
            System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(252));
            System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(257));
            System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(0));
            System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(5));
            System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(-10));
        }
        System.out.println("==================================================== EvenDigitSum");
        {
            System.out.println(EvenDigitSum.getEvenDigitSum(123456789));
            System.out.println(EvenDigitSum.getEvenDigitSum(252));
            System.out.println(EvenDigitSum.getEvenDigitSum(-22));
        }
        System.out.println("==================================================== SharedDigit");
        {
            System.out.println(SharedDigit.hasSharedDigit(12, 23));
            System.out.println(SharedDigit.hasSharedDigit(9, 99));
            System.out.println(SharedDigit.hasSharedDigit(15, 55));
            System.out.println(SharedDigit.hasSharedDigit(45, 56));
        }
        System.out.println("==================================================== SharedDigit");
        {
            System.out.println(LastDigitChecker.hasSameLastDigit(41, 22, 71));
            System.out.println(LastDigitChecker.hasSameLastDigit(23, 32, 42));
            System.out.println(LastDigitChecker.hasSameLastDigit(9, 99, 999));
            System.out.println("+++");
            System.out.println(LastDigitChecker.isValid(10));
            System.out.println(LastDigitChecker.isValid(468));
            System.out.println(LastDigitChecker.isValid(1051));
        }
        System.out.println("==================================================== GCD");
        {
            System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));
            System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12, 30));
            System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(9, 18));
            System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));
            System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(1010, 10));
        }
        System.out.println("==================================================== Factor Printer");
        {
            FactorPrinter.printFactors(6);
            FactorPrinter.printFactors(32);
            FactorPrinter.printFactors(10);
            FactorPrinter.printFactors(-1);
        }
        System.out.println("==================================================== Perfect Number");
        {
            System.out.println(PerfectNumber.isPerfectNumber(6));
            System.out.println(PerfectNumber.isPerfectNumber(28));
            System.out.println(PerfectNumber.isPerfectNumber(5));
            System.out.println(PerfectNumber.isPerfectNumber(-1));
        }
        System.out.println("==================================================== NumberToWords");
        {
            System.out.println(NumberToWords.getDigitCount(0));
            System.out.println(NumberToWords.getDigitCount(123));
            System.out.println(NumberToWords.getDigitCount(-12));
            System.out.println(NumberToWords.getDigitCount(5200));
            System.out.println("++++++++");
            System.out.println(NumberToWords.reverse(-121));
            System.out.println(NumberToWords.reverse(1212));
            System.out.println(NumberToWords.reverse(1234));
            System.out.println(NumberToWords.reverse(100));
            System.out.println("++++++++");
            NumberToWords.numberToWords(123);
            System.out.println("////");
            NumberToWords.numberToWords(1010);
            System.out.println("////");
            NumberToWords.numberToWords(1000);
            System.out.println("////");
            NumberToWords.numberToWords(-12);
        }
        System.out.println("==================================================== FlourPacker");
        {
            System.out.println(FlourPacker.canPack(1, 0, 4)); //false
            System.out.println(FlourPacker.canPack(1, 0, 5)); //true
            System.out.println(FlourPacker.canPack(0, 5, 4)); //true
            System.out.println(FlourPacker.canPack(2, 2, 11)); //true
            System.out.println(FlourPacker.canPack(-3, 2, 12)); //false
        }
        System.out.println("==================================================== LargestPrime");
        {
            System.out.println(LargestPrime.getLargestPrime(21)); // 7
            System.out.println(LargestPrime.getLargestPrime(217)); // 31
            System.out.println(LargestPrime.getLargestPrime(0)); // -1
            System.out.println(LargestPrime.getLargestPrime(45)); // 5
            System.out.println(LargestPrime.getLargestPrime(-1)); //-1
            System.out.println(LargestPrime.getLargestPrime(2)); //2
        }
        System.out.println("==================================================== LargestPrime");
        {
            DiagonalStar.printSquareStar(5);
            DiagonalStar.printSquareStar(8);
        }
        System.out.println("==================================================== ReadingUserInputChallenge");
        {
            ReadingUserInputChallenge.readUserNumbers();
        }
        System.out.println("==================================================== MinMaxChallenge");
        MinMaxChallenge.getMinMax();
        System.out.println("==================================================== InputCalculator");
        InputCalculator.inputThenPrintSumAndAverage();
        */
        System.out.println("==================================================== PaintJob");
        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2)); // -1
        System.out.println(PaintJob.getBucketCount(3.4,2.1,1.5,2)); // 3
        System.out.println(PaintJob.getBucketCount(2.75,3.25,2.5, 1)); // 3
        System.out.println("+++ overload 1 +++");
        System.out.println(PaintJob.getBucketCount(-3.4,2.1,1.5)); // -1
        System.out.println(PaintJob.getBucketCount(3.4,2.1,1.5)); // 5
        System.out.println(PaintJob.getBucketCount(7.25,4.3,2.35)); // 14
        System.out.println("+++ overload 2 +++");
        System.out.println(PaintJob.getBucketCount(3.4,1.5)); // 3
        System.out.println(PaintJob.getBucketCount(6.26,2.2)); // 3
        System.out.println(PaintJob.getBucketCount(3.26,0.75)); // 5
    }

}
