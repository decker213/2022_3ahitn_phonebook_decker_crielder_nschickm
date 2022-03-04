package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;

/**
 * @author david
 */
public class StreamOperation {

    /**
     * @param w -> schreibt die Daten der Person in die Datei
     * @param p -> Daten, die in die Datei geschrieben werden
     * @throws IOException
     */
    public void ToStream(Writer w, Person p) throws IOException {
        String s = p.getName() + ";" + p.getGivenname() + ";" + p.getNickname() + ";" + p.getBirthday() + ";" + p.getPhonenumber();
        w.write(s);
    }

    /**
     * @param r -> liest die Daten einer Person aus
     * @return -> gibt die ausgelesene Person zurück, falls das File aus ist wird NULL zurückegegeben
     * @throws IOException
     */
    public Person fromStream(Reader r) throws IOException, IllegalDateException {
        Person p = null;
        BufferedReader br = new BufferedReader(r);
        String s = br.readLine();

        if (s != null) {
            String[] parts = s.split(";");
            Date date = new Date(parts[3]);
            PhoneNumber phoneNumber = new PhoneNumber(parts[4]);
            p = new Person(parts[0], parts[1], parts[2], date, phoneNumber);
        }

        return p;
    }

}
