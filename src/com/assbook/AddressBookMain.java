package com.assbook;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Contacts contacts = new Contacts();
        int input;
        System.out.println("Welcome to Address Book");
        do {
            System.out.println("1: Add contacts details ");
            System.out.println("2: Edit the contact");
            System.out.println("3: delete person");
            System.out.println("0: exit the system");
            System.out.println("Please choose:");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Enter Name");
                    String name = scan.nextLine();
                    System.out.println("Enter Address");
                    String address = scan.nextLine();
                    System.out.println("Enter City");
                    String city = scan.nextLine();
                    System.out.println("Enter State");
                    String state = scan.nextLine();
                    System.out.println("Enter Zip");
                    String zip = scan.nextLine();
                    System.out.println("Enter PhoneNo");
                    String phoneNo = scan.nextLine();
                    System.out.println("Enter Email");
                    String email = scan.nextLine();
                    PersonDetails person = new PersonDetails(name, address, city, state, zip, phoneNo, email);
                    contacts.addContact(person);
                    break;

                case 2:
                    contacts.editContact();
                    break;

                case 3:
                    contacts.deleteContact();
            }
        } while (input != 0) ;
            System.out.println("Thank you!");
    }
}
