public class FactorPrinter {
    public static void printFactors(int number) {
        if(number < 1) {
            System.out.println("Invalid Value");
        } else {
            String factors = "";
            for(int i = 1; i <= number; i++) {
                if(number % i == 0) {
                    if(number == i) {
                        factors += i;
                    } else {
                        factors += (i + " ");
                    }
                }
            }
        }
    }
}
