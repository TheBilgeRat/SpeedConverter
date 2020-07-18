import java.util.Scanner;

public class MinMaxChallenge {
    public static void getMinMax() {
        Scanner scan = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(true) {
            System.out.print("Enter Number: ");
            if(!scan.hasNextInt()) {
                break;
            }
            int read = scan.nextInt();

            if(read > max) {
                max = read;
            }
            if(read < min) {
                min = read;
            }
        }
        System.out.println("Min: " + min + " Max: " + max);
        scan.close();
    }
}
