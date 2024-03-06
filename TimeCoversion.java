import java.util.*;
public class TimeCoversion {
    public static void main (String [] args)
    {
    int min;
    int hour;
    int sectens;
    int secones;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter time in minutes: ");
    min = input.nextInt();

    hour = min / 60;
    secones = min % 60;
    sectens = (min - secones) % 60;

    System.out.print("The time is: " + hour + ":" + sectens + secones);

    }
}
