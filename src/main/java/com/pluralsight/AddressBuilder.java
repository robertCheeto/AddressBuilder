package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        StringBuilder billingInformation = new StringBuilder();

        System.out.println("Enter the following information:\n");

        System.out.print("Enter your name: ");
        String userName = keyboard.nextLine();
        billingInformation.append(userName);

        System.out.print("Billing Street: ");
        String billingStreet = keyboard.nextLine();
        billingInformation.append(billingStreet);

        System.out.print("Billing City: ");
        String billingCity = keyboard.nextLine();
        billingInformation.append(billingCity);

        System.out.print("Billing State: ");
        String billingState = keyboard.nextLine();
        billingInformation.append(billingState);

        System.out.print("Billing Zipcode: ");
        int billingZip = keyboard.nextInt();
        billingInformation.append(billingZip);


        System.out.print("\nShipping Street: ");
        System.out.print("Shipping City: ");
        System.out.print("Shipping State: ");
        System.out.print("Shipping Zipcode: ");

        String customerInformation = billingInformation.toString();
        System.out.printf("\n%s",customerInformation);



    }
}
