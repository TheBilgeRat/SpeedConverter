
public class Main {

    public static void main(String[] args) {
        SpeedConverter.printConversion(100.00d);
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        System.out.println(BarkingDog.shouldWakeUp(true, 1));
        System.out.println(BarkingDog.shouldWakeUp(false, 2));
        System.out.println(BarkingDog.shouldWakeUp(true, 8));
        System.out.println(BarkingDog.shouldWakeUp(true, -1));
    }

}
