public class Customer
{
    public String customerName;
    public int customerId;

    public Customer(String name, int id)
    {
        customerName = name;
        customerId = id;
    }

    public String toString()
    {
        return "Customer " + customerId + ", " + customerName;
    }


}