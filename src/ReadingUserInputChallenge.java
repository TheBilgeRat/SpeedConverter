import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void readUserNumbers() {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while(count <= 10) {
            System.out.print("Enter number #" + count + ": ");
            if(scanner.hasNextInt()) {
                sum += scanner.nextInt();
                count++;
            } else {
                System.out.println("invalid number!");
            }
            scanner.nextLine();
        }
        System.out.println("The sum of your 10 numbers is " + sum);
        scanner.close();
    }
}
