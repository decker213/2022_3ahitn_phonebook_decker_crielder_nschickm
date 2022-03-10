package com.company;

/**
 * @author criedler
 * Ermöglicht anlegen eines Objekts mit Tag, Monat, Jahr.
 */
public class Date {
    int day;
    int mon;
    int year;

    /**
     * Überprüft die mitgegebenen Werte auf validät wenn nicht,
     * wird eine Illegaldateexception geworfen und mitgegebn,
     * ob es sich um ein falsches Montag oder falschen Tag Handelt
     * @param day mitgegebener Tag
     * @param mon mitgegebener Monat
     * @param year mitgegebenes jahr
     * @throws IllegalDateException
     */
    public Date(int day, int mon, int year) throws IllegalDateException {
        if (!(mon < 13 && mon > 0)) {
            throw new IllegalDateException(IllegalDateException.MON_ILLEGAL);
        } else if (!(day < 31 && day > 0)) {
            throw new IllegalDateException(IllegalDateException.DAY_ILLEGAL);
        }
        this.day = day;
        this.mon = mon;
        this.year = year;
    }

    /**
     * Splitet den String an den Stellen wo punkte sind,
     * convertiert diese teile dann in Integerwerte und überprüft ob sie valide sind.
     * Wenn nicht wird eine Illegaldateexception geworfen und mitgegebn,
     * ob es sich um ein falsches Montag oder falschen Tag Handelt
     * @param date Datum in einem String
     * @throws IllegalDateException
     */
    public Date(String date) throws IllegalDateException {
        String[] parts = date.split("\\.");
        int day = Integer.parseInt(parts[0]);
        int mon = Integer.parseInt(parts[1]);
        if (mon > 12 || mon < 1) {
            throw new IllegalDateException(IllegalDateException.MON_ILLEGAL);
        } else if (day > 31 || day < 1) {
            throw new IllegalDateException(IllegalDateException.DAY_ILLEGAL);
        }

        this.day = Integer.parseInt(parts[0]);
        this.mon = Integer.parseInt(parts[1]);
        this.year = Integer.parseInt(parts[2]);

    }

    /**
     * Returned den Tag eines Objekts
     * @return Tag eines Objekts
     */
    public int getDay() {
        return day;
    }

    /**
     * Returned den Monat eines Objekts
     * @return Monat eines Objekts
     */
    public int getMon() {
        return mon;
    }

    /**
     * Returned das Jahr eines Objekts
     * @return Jahr eines Objekts
     */
    public int getYear() {
        return year;
    }


    /**
     * Überprüft mit 3 Statements ob ein jahr durch 4 teilbar, durch 100 nicht teilbar und durch 400 teilbar ist.
     * @return True oder False
     */
    public boolean istSchaltjahr() {
        if (this.year % 4 == 0 && (this.year % 100 != 0 || this.year % 400 == 0)) {
            return true;
        }
        return false;
    }

    /**
     * Überprüft ob das Monat im normalen Monat bereich und der Tag im normalen Tag bereich ist
     * @param d zu Überprüfendes Datum
     * @return Ob das Datum valide ist mit true oder false
     */
    public boolean isValidDate(Date d) {
        if ((d.mon < 13 && d.mon > 0) && (d.day < 31 && d.day > 0)) {
            return true;
        }
        return false;
    }
}
