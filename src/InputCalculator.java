import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while(true) {
            if(!s.hasNextInt()) {
                break;
            }
            sum += s.nextInt();
            count++;
        }

        System.out.println("SUM = " + sum + " AVG = " + Math.round((float)(sum / count)));
        s.close();
    }
}
