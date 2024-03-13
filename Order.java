import java.util.*;
public class Order {
    public static void main (String [] args)
    {
    int burger;
    int fries;
    int soda;
    double nburger;
    double nfries;
    double nsoda;
    double btax;
    double tax;
    double total;
    double tend;
    double change; 

    Scanner input = new Scanner(System.in);
    System.out.println("Enter full name: ");
    System.out.print("Enter number of burgers: ");
    burger = input.nextInt();
    System.out.print("Enter number of fries: ");
    fries = input.nextInt();
    System.out.print("Enter number of sodas: ");
    soda = input.nextInt();
    System.out.print("Enter the amount tendered: ");
    tend = input.nextInt();
    input.close();

    nburger = (burger * 1.69);
    nfries = (fries * 1.09);
    nsoda = (soda * 0.99);

    btax = (nburger + nfries + nsoda);
    tax = (btax * .085);
    total = (btax - tax);
    change = (total % tend); 


    System.out.println("Total before tax: " + btax);
    System.out.println("Total after tax: " + tax);
    System.out.println("Total: " + total);
    System.out.println("Enter the amount tendered: " + tend);
    System.out.println("Change: " + change);

    


 


    }
}
