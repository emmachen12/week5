import java.util.*;

public class Sleep {
    public static void main (String [] args)
    {
    int year;
    int month;
    int day;
    int year1;
    int month1;
    int day1;
    int yearsalive;
    int monthsalive;
    int daysalive;
    int slept;

    System.out.println("Enter Your Birthdate:");

    Scanner input = new Scanner(System.in);
    System.out.print("Year: ");
    year = input.nextInt();
    System.out.print("Month: ");
    month = input.nextInt();
    System.out.print("Day: ");
    day = input.nextInt();
    System.out.println("Enter Todays Date:");
    System.out.print("Year: ");
    year1 = input.nextInt();
    System.out.print("Month: ");
    month1 = input.nextInt();
    System.out.print("Day: ");
    day1 = input.nextInt();

    yearsalive = (year1 - year);
    monthsalive = (12-month + 12*yearsalive + month1);
    daysalive = (30*monthsalive);
    slept = 24*(daysalive/3);

    System.out.println("You have been alive for: " + daysalive);
    System.out.println("You have slept: " + slept);

    }
}
