import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println("==================================================== SpeedConverter");
        SpeedConverter.printConversion(100.00d);
        System.out.println("==================================================== MegabytesConverter");
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        System.out.println("==================================================== BarkingDog");
        System.out.println(BarkingDog.shouldWakeUp(true, 1));
        System.out.println(BarkingDog.shouldWakeUp(false, 2));
        System.out.println(BarkingDog.shouldWakeUp(true, 8));
        System.out.println(BarkingDog.shouldWakeUp(true, -1));
        System.out.println("==================================================== LeapYear");
        System.out.println(LeapYear.isLeapYear(-1600));
        System.out.println(LeapYear.isLeapYear(1600));
        System.out.println(LeapYear.isLeapYear(2017));
        System.out.println(LeapYear.isLeapYear(2000));
    }

}
