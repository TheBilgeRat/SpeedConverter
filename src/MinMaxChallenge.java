import java.util.Scanner;

public class MinMaxChallenge {
    public static void getMinMax() {
        Scanner scan = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean firstNum = true;

        while(true) {
            System.out.print("Enter Number: ");
            if(!scan.hasNextInt()) {
                break;
            }
            int read = scan.nextInt();
            if(firstNum) {
                max = read;
                min = read;
                firstNum = false;
                continue;
            }
            if(read > max) {
                max = read;
            } else if(read < min) {
                min = read;
            }
        }
        System.out.println("Min: " + min + " Max: " + max);
        scan.close();
    }
}
