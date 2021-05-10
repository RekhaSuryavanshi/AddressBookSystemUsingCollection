package com.assbook;

import java.util.ArrayList;
import java.util.List;

public class Contacts {

    List<PersonDetails> list = new ArrayList<PersonDetails>();

    public void addContact(PersonDetails person) {
        list.add(person);
        System.out.println(list);
    }
}
