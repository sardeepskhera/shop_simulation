public class Menu
{
    public String description = "\nTAKE A LOOK AT OUR MENU\n-----------------------------------------------------------------------------------------------------------------\n";

    private Item[] menuItems = {
    new Item("01", "Rings of Saturn", "An appetizing tray of 8 jumbo onion rings for the whole table!", 6.95),
    new Item("02", "Po-Tae-Tots", "A serving of crispy tater tots with our Famous Kiwi Sauce™", 3.95),
    new Item("03", "Fillip's Fries", "Some delicious truffle parmesan fries just for you!", 4.95),
    new Item("04", "The Blues", "A burger with blue cheese, blue cheese ranch & bacon!", 10.95),
    new Item("05", "Eastern Style", "A culture condensed into a tasty burger! Served with kebab style meat, mayonnaise and sriracha sauce!", 12.95),
    new Item("06", "From The Stand", "Is it getting hot in here or is it just you? Either way, take a sip of our thirst-quenching lemonade!", 2.95),
    new Item("07", "Helicarrier Wings", "We don't go small with our 20 flavored wings served with celery sticks!", 15.95),
    new Item("08", "Tendies", "Don't wanna leave out our more picky customers so we got you covered with our breaded chicken tenders with your choice of sauce!", 10.95),
    new Item("09", "Texican Chicken Salad", "Get your cowboy hat for a healthy serving of buttermilk chicken with corn and tortilla strips!", 13.95),
    new Item("10", "Highway 55", "Nothing like a creamy chocolate shake with carmel to finish off a meal!", 4.95)
    };

    public Item[] getMenuItems()
    {
        return menuItems;
    }

    public String toString()
    {
        System.out.print(description);

        for(int counter = 0; counter < menuItems.length; counter++)
        {
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(menuItems[counter]);
        }
        return "\n-----------------------------------------------------------------------------------------------------------------";
    }
}