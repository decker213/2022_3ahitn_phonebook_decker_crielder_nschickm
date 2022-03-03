package com.company;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

/**
 * @author david
 */
public class StreamOperation {
    public void ToStream(Writer w, Person p) throws IOException {
        String stream = p.getName() + ";" + p.getGivenname() + ";" + p.getNickname() + ";" + p.getBirthday() + ";" + p.getPhonenumber();
        w.write(stream);
        w.close();
    }

    public Person fromStream(Reader r) throws IOException {
        while (r.read() != -1) {

        }
    }
}
