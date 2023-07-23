package tekioday2;
import java.util.Scanner;
public class CurrencyConvertor {

    final static double RUPEES_CONVERSION_RATE = 80;

    final static double GIVEN_DOLLAR_AMOUNT = 10;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Please Enter Dollar Amount");
       // Double dollarAmount = scanner.nextDouble();
        System.out.println("After Converting Dollar to Ruppes is : "+ GIVEN_DOLLAR_AMOUNT*RUPEES_CONVERSION_RATE);
    }
}
