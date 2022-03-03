package com.company;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

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
        String stream = p.getName() + ";" + p.getGivenname() + ";" + p.getNickname() + ";" + p.getBirthday() + ";" + p.getPhonenumber();
        w.write(stream);
        w.close();
    }

    /**
     * @param r -> liest die Daten einer Person aus
     * @return -> gibt die ausgelesene Person zurück
     * @throws IOException
     */
    public Person fromStream(Reader r) throws IOException {
        Person p = null;
        while (r.read() != -1) {

        }
        return p;
    }
}
