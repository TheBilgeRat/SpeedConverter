public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0)
            System.out.println("Invalid Value");

        System.out.println(kiloBytes + " KB = " + (kiloBytes / 1024) + " MB");
    }
}
