public class Item
{
    public String itemId;
    public String itemName;
    public String itemDescription;
    public double itemPrice;

    public Item(String id, String name, String description, double price)
    {
        itemId = id;
        itemName = name;
        itemDescription = description;
        itemPrice = price;
    }

    public String getItemId()
    {
        return itemId;
    }

    public double getItemPrice()
    {
        return itemPrice;
    }

    public String getItemName()
    {
        return itemName;
    }

    public String getItemDescription()
    {
        return itemDescription;
    }

    public    String toString()
    {
        return "\n" + itemId + " - " + itemName + "\n\t" + itemDescription + " - $" + itemPrice;
    }
}