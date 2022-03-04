package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.company.IllegalPhoneNumberException.*;

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
     * @throws IllegalPhoneNumberException ueberprueft ob country, number, areaycode im richtigen Wertebereich liegen
     */
    PhoneNumber(String number) throws IllegalPhoneNumberException {

        String zwischenspeicher = " ";
        String[] parts = number.split(" ");


        this.country = Integer.parseInt(parts[0]);
        if (this.country < 0 || this.country > 999) {
            throw new IllegalPhoneNumberException(COUNTRY_ILLEGAL);
        }

        zwischenspeicher = parts[1];
        String[] parts2 = zwischenspeicher.split("/");


        this.areacode = Integer.parseInt(parts[0]);
        if (this.areacode <= 0 || this.areacode > 9999) {
            throw new IllegalPhoneNumberException(AREA_ILLEGAL);
        }

        this.number = Integer.parseInt(parts[1]);
        if (this.number < 999 || this.number > 999999999) {
            throw new IllegalPhoneNumberException(NUMBER_ILLEGAL);
        }

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
     * @throws IllegalPhoneNumberException ueberprueft ob der String (komplette PhoneNummer) im richtigen Wertebereich liegt
     */
    boolean isValid(PhoneNumber d) throws IllegalPhoneNumberException {
        boolean rv = false;

        Pattern pattern = Pattern.compile("(\\+|\\d+)\\s\\d+\\/\\d+");
        Matcher matcher = pattern.matcher((CharSequence) d);

        if (matcher.find()) {
            rv = true;
        } else {
            throw new IllegalPhoneNumberException(STRING_FORMAT_ILLEGAL);
        }


        return rv;
    }
}
