package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author criedler
 */
public class Main {

    /**
     * Lest die Geburtstage aller Personen in eine ArrayList ein
     */
    public static void main(String[] args) throws IOException, IllegalDateException, IllegalPhoneNumberException {
        // write your code here
        StreamOperation so = new StreamOperation();
        ArrayList<Date> al = new ArrayList<>();
        FileReader r = new FileReader("personen.csv");
        BufferedReader fr = new BufferedReader(r);
        FileWriter fw = new FileWriter("personen.csv", true);
        Person person;

        do {
            person = so.fromStream(fr);
            if (person != null) {
                al.add(person.getBirthday());
            }
        } while (person != null);

        for (Date date : al) {
            System.out.println(date.getDay() + "-" + date.getMon() + "-" + date.getYear());
        }

        Person person1 = new Person("Manuel", "Mani", "Pepper Mani", new Date(1, 1, 2013), new PhoneNumber("001 1234/234451"));

        so.ToStream(fw, person1);
    }
}

