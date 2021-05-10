package com.assbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contacts {

    List<PersonDetails> list = new ArrayList<PersonDetails>();
    Scanner scan = new Scanner(System.in);

    public void addContact(PersonDetails person) {
        list.add(person);
        System.out.println(list);
    }

    public void editContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name for which you want to edit information");
        String editname = sc.nextLine();
        PersonDetails details = null;
        boolean detailsfound = false;
        for (int i = 0; i < list.size(); i++) {
            details = list.get(i);
            if (details.getName().equals(editname)) {
                System.out.println("Enter the Name which you want to set");
                String newName = scan.nextLine();
                details.setName(newName);
                System.out.println("Enter the new address which you want to set");
                String newAdd = scan.nextLine();
                details.setAddress(newAdd);
                System.out.println("Enter the new city which you want to set");
                String newCity = scan.nextLine();
                details.setCity(newCity);
                System.out.println("Enter the new state which you want to set");
                String newState = scan.nextLine();
                details.setState(newState);
                System.out.println("Enter the new zip which you want to set");
                String newZip = scan.nextLine();
                details.setZip(newZip);
                System.out.println("Enter the new phoneNo which you want to set");
                String newphoneNo = scan.nextLine();
                details.setPhoneNo(newphoneNo);
                System.out.println("Enter the new email which you want to set");
                String newemail = scan.nextLine();
                details.setEmail(newemail);
                detailsfound = true;
                break;
            }
        }
        System.out.println(list);
    }

    public void deleteContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.nextLine();

        PersonDetails details = null;
        for (int i = 0; i < list.size(); i++) {
            details = list.get(i);
            if (details.getName().equals(name)) {
                list.remove(i);
            }
            break;
        }
        System.out.println(list);
    }
}
