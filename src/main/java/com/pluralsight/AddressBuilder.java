package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        StringBuilder billingInformation = new StringBuilder();
        StringBuilder shippingInformation = new StringBuilder();

        System.out.print("Enter your name: ");
        String userName = keyboard.nextLine();
        billingInformation.append(userName + "\n\n");

        System.out.println("\n*** Enter Billing Information ***");
        System.out.print("Billing Street: ");
        String billingStreet = keyboard.nextLine();
        billingInformation.append("Billing Address:\n" + billingStreet + "\n");

        System.out.print("Billing City: ");
        String billingCity = keyboard.nextLine();
        billingInformation.append(billingCity + ", ");

        System.out.print("Billing State: ");
        String billingState = keyboard.nextLine();
        billingInformation.append(billingState + " ");

        System.out.print("Billing Zipcode: ");
        int billingZip = keyboard.nextInt();
        billingInformation.append(billingZip);
        keyboard.nextLine();

        System.out.println("\n*** Enter Shipping Information ***");
        System.out.print("Shipping Street: ");
        String shippingStreet = keyboard.nextLine();
        shippingInformation.append("\nShipping Address:\n" + shippingStreet + "\n");

        System.out.print("Shipping City: ");
        String shippingCity = keyboard.nextLine();
        shippingInformation.append(shippingCity + ", ");

        System.out.print("Shipping State: ");
        String shippingState = keyboard.nextLine();
        shippingInformation.append(shippingState + " ");

        System.out.print("Shipping Zipcode: ");
        String shippingZipcode = keyboard.nextLine();
        shippingInformation.append(shippingZipcode);

        String customerInformation = billingInformation.toString() + "\n" + shippingInformation.toString();
        System.out.printf("\n*** Order Information ***\n%s\n************************",customerInformation);



    }
}
