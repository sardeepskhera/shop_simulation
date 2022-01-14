public class Shop
{
    public final static String fullCompanyName = "Saucy Kiwi Tavern";
    public final static String bannerMessage =  "╔═╗┌─┐┬ ┬┌─┐┬ ┬  ╦╔═┬┬ ┬┬ \n" +
                                                "╚═╗├─┤│ ││  └┬┘  ╠╩╗│││││ \n" +
                                                "╚═╝┴ ┴└─┘└─┘ ┴   ╩ ╩┴└┴┘┴";

    public String toString()
    {
        return bannerMessage + "\nHi, my name is " + Owner.firstName + ". \nWelcome to the " + fullCompanyName + "!";
    }
} // end class