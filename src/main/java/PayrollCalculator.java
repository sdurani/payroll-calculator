import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        // User inputs name.
        System.out.println("What is your name?");
        String userName = read.nextLine();

        // User inputs hours worked.
        System.out.println("How many hours have you worked?");
        float hoursWorked = read.nextFloat();

        // User inputs pay rate.
        System.out.println("What is your pay rate?");
        float payRate = read.nextFloat();

        // Calculate gross pay.
        float grossPay = hoursWorked * payRate;

        // BONUS
        if (hoursWorked > 40) {
            float overtimeHours = hoursWorked - 40;
            float regularPay = 40 * payRate;
            float overtimePay = overtimeHours * payRate * 1.5f;
            grossPay = regularPay + overtimePay;
        }

        // Display info.
        System.out.println(userName + ", " + "your gross pay is " + "$" + grossPay);
        System.out.printf("%s, your gross pay is $%.2f ", userName, grossPay);

    }
}
