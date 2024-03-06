import java.util.*;
public class election {
    public static void main (String[]args)
    {
    int emmaNY;
    int emmaNJ;
    int emmaCN;
    int ellNY;
    int ellNJ;
    int ellCN;
    int emmatotal;
    int elltotal;
    double emmapercent;
    double ellpercent;
    int total;

    Scanner input = new Scanner(System.in);
    System.out.print("Emma's New York results: ");
    emmaNY = input.nextInt();
    System.out.print("Emma's New Jersey results: ");
    emmaNJ = input.nextInt();
    System.out.print("Emma's Connecticut results: ");
    emmaCN = input.nextInt();
    System.out.print("Ellery's New York results: ");
    ellNY = input.nextInt();
    System.out.print("Ellery's New Jersey results: ");
    ellNJ = input.nextInt();
    System.out.print("Ellery's Connecticut results: ");
    ellCN = input.nextInt();
    input.close();

    emmatotal = (emmaNY + emmaNJ + emmaCN);
    elltotal = (ellNY + ellNJ + ellCN);
    total = (emmatotal + elltotal);

    emmapercent = ((double)emmatotal/total);
    ellpercent = ((double)elltotal/total);

    System.out.println("Candidate\t\tVotes\tPercentage");
    System.out.println("Emma\t\t\t"+ emmatotal + "\t" + emmapercent + "%");
    System.out.println("Ellery\t\t\t"+ elltotal + "\t" + ellpercent + "%");
    System.out.println("TOTAL VOTES:\t\t"+ total);


    }
}