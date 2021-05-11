package com.assbook;

import java.util.*;

public class Contacts {

    Map<String, List<PersonDetails>> addressBookMap = new HashMap<String, List<PersonDetails>>();
    List<PersonDetails> list = new ArrayList<PersonDetails>();
    Scanner scan = new Scanner(System.in);

    public void addContact(PersonDetails person) {
        System.out.println("Enter the address book name");
        String key = scan.nextLine();
        list.add(person);
        addressBookMap.put(key, list);
        System.out.println(addressBookMap);
        System.out.println("Fetching Keys and corresponding multiple Values ");
        for (Map.Entry<String, List<PersonDetails>> entry : addressBookMap.entrySet()) {
            key = entry.getKey();
            List<PersonDetails> values = entry.getValue();
            System.out.println("Key = " + key);
            System.out.println("Values = " + values );
        }
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
        }
        System.out.println(list);
    }

    public void view() {
        for (PersonDetails person : list) {
            System.out.println(person);
        }
    }

    public void searchPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the city name in which you want search the person");
        String cityname = sc.nextLine();
        PersonDetails details = null;
        for (int i = 0; i < list.size(); i++) {
            details = list.get(i);
            if (details.getCity().equals(cityname)) {
                System.out.println(list.get(i));
            }
        }
    }

    public void viewPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the state name in which you want view the person");
        String statename = sc.nextLine();
        PersonDetails details = null;
        for (int i = 0; i < list.size(); i++) {
            details = list.get(i);
            if (details.getState().equals(statename)) {
                System.out.println(list.get(i));
            }
        }
    }
}
