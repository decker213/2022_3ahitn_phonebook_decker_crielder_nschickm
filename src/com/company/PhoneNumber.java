package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @auther: Nico Schickmair
 * In dieser Klasse wird geprueft ob eine Telefonnummer gueltig ist.
 * Sie wird in country und areacode aufgeteilt.
 * Konsolenausgabe
 */
public class PhoneNumber {

    public int country;
    public int areacode;
    public int number;

    /**
     * Konstruktor
     * <p>
     * Telefonnummer Eingabe: 43 07252
     *
     * @param country  ist die Vorwahl einer Telefonnummer eines Landes, zb Österreich ist +43
     * @param areacode ist die Vorwahl einer Telefonnummer eines Ortes, zb Steyr ist 07252
     * @param number   ist die komplette Telefonnummer
     */
    PhoneNumber(int country, int areacode, int number) {
        country = this.country;
        areacode = this.areacode;
        number = this.number;
    }

    /**
     * Die Telefonnummer wird geteilt in country und areacode durch ein Leerzeichen
     *
     * @param number ist die komplette Telefonnummer
     */
    PhoneNumber(String number) {
        this.number = Integer.parseInt(number);

        String[] parts = number.split(" ");
        country = Integer.parseInt(parts[0]);
        areacode = Integer.parseInt(parts[1]);

    }

    /**
     * Genierte Funktion
     *
     * @return areacode
     */
    public int getAreacode() {
        return areacode;
    }

    /**
     * Genierte Funktion
     *
     * @return number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Genierte Funktion
     *
     * @return country
     */
    public int getCountryCode() {
        return country;
    }

    /**
     * Genierte Funktion
     *
     * @return Ausgabe der Konsole
     */
    @Override
    public String toString() {
        return "PhoneNumber{" +
                "country=" + country +
                ", areacode=" + areacode +
                ", number=" + number +
                '}';
    }

    /**
     * Prueft ob die Telefonnummner gueltig ist
     *
     * @param d ist die Telefonnummer
     * @return true wenn die Telefonnummer gueltig ist
     * false wenn die Telefonnummer nicht gueltig ist
     */
    boolean isValid(PhoneNumber d) {
        boolean rv = false;

        Pattern pattern = Pattern.compile("\\d+\\s\\d+");
        Matcher matcher = pattern.matcher((CharSequence) d);

        if(matcher.find()){
            rv = true;
        }

        return rv;
    }
}
