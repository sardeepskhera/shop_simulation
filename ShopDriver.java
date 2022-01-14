/**
 ITSC 1212 - 025 - von Briesen
 @author Khera, Sardeep
 @version 1.0.
 @since 12/14/2021 @ 16:24

 Your Shop, ShopDriver
 Create an application that would serve as a Point of Sale System (POS) for a small shop that sells at least 10 items of something you find useful/interesting.
 */

import java.util.Scanner;

public class ShopDriver
{
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("┌(=^‥^=)┐ ┌(=^‥^=)┐ START ┌(=^‥^=)┐ ┌(=^‥^=)┐\n");

        //SHOP INTRO
        Shop aShop = new Shop();
        System.out.println(aShop);

        //GREETING INTRO
        Thread.sleep(2000);
        Scanner in = new Scanner(System.in);
        System.out.print("\nWhat's your name?: ");
        String customerName = in.nextLine();
        int customerId = (int) (Math.random() * (1000 - 1) + 1);
        Customer aCustomer = new Customer(customerName, customerId);
        System.out.println(aCustomer);

        //MENU INTRO
        Thread.sleep(1000);
        Menu aMenu = new Menu();
        System.out.println(aMenu);

        //ORDER TAKING
        Thread.sleep(2000);
        Order anOrder = new Order();
        System.out.println(anOrder.setOrderedItems());

        //RECEIPT OUTRO
        System.out.println("\n" + anOrder);

        System.out.println("\n└(=^‥^=)┘ └(=^‥^=)┘  END  └(=^‥^=)┘ └(=^‥^=)┘");
    } // end main
} // end class