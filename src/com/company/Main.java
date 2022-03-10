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
        FileReader fr = new FileReader("personen.csv");

        while (so.fromStream(fr) != null) {
            al.add(so.fromStream(fr).getBirthday());
        }
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}

