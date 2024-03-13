import java.util.*;

public class taxi {
    public static void main (String [] args)
    {
    int pass;
    int cab;
    int passleftover;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of passenger: ");
    pass = input.nextInt();
    input.close();

    cab = pass / 4;
    passleftover = pass % 4;

    System.out.println(cab + " are required");
    System.out.println(passleftover + " passenger(s) will be left over");


    }
    

}
