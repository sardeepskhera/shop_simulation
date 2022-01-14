import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Order
{
    private String storeName = Shop.fullCompanyName;
    private String ownerName = Owner.firstName + " " + Owner.lastName;
    private double subtotal;
    private double tax;
    private double total;
    private Item[] orderedItems;

    DecimalFormat df = new DecimalFormat("##.##");

    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm");
    Date date = new Date();

    public String setOrderedItems()
    {
        Menu aMenu = new Menu();
        Scanner in = new Scanner(System.in);

        System.out.print("So, how many things look good to ya?: ");
        String howManyItems = in.nextLine();
        int selectedNumber = Integer.parseInt(howManyItems);

        orderedItems = new Item[selectedNumber];

        for (int counter = 0; counter < selectedNumber; counter++)
        {
            System.out.print("What's the ID for item number " + (counter + 1) + ": ");
            String desiredItem = in.nextLine();
            int desiredItemNumber = Integer.parseInt(desiredItem);

            if (desiredItemNumber < 1 || desiredItemNumber > 10)
            {
                System.out.println("That item doesn't exist, try again!");
                counter--;
            }
            else
            {
                orderedItems[counter] = aMenu.getMenuItems()[desiredItemNumber- 1];
            }
        }
        return "-----------------------------------------------------------------------------------------------------------------";
    }

    public String getOrderedItems()
    {
        String receipt = "";
        for(int counter = 0; counter < orderedItems.length; counter++)
        {
            receipt += "\n" + orderedItems[counter].getItemName() + "\n\t" + orderedItems[counter].getItemPrice() ;
        }
        return receipt;
    }

    public double getSubtotal(Item[] _orderedItems)
    {
        _orderedItems = orderedItems;

        for(int counter = 0; counter < _orderedItems.length; counter++)
        {
            subtotal +=  _orderedItems[counter].getItemPrice();
        }
        return subtotal;
    }

    public double getTax()
    {
        tax = subtotal * 0.075;
        return tax;
    }
    public double getTotal()
    {
        total = subtotal + tax;
        return total;
    }

    public String toString()
    {
        Customer aCustomer = null;

        String receipt = "Awesome, all done! Here's a receipt of your purchase, enjoy your meal!\n--------------------------------------------\n" +
                storeName + " owned by " + ownerName + "\n" + formatter.format(date) + "\n~~~~~~~~~~~~~~~~" + getOrderedItems() +"\n~~~~~~~~~~~~~~~~" +
                "\nSubtotal: $" + df.format(getSubtotal(orderedItems)) + "\nTax: $" + df.format(getTax()) + "\nTotal: $" + df.format(getTotal()) + "\n--------------------------------------------";

        return receipt;
    }
}