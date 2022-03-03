package com.company;

/**
 * @author criedler
 * Ermöglicht anlegen eines Objekts mit Tag, Monat, Jahr.
 */
public class Date {
    int day;
    int mon;
    int year;

    public Date(int day, int mon, int year) throws IllegalDateException {
        if (!(mon < 13 && mon > 0)) {
            throw new IllegalDateException(IllegalDateException.MON_ILLEGAL);
        } else if (day < 31 && day > 0) {
            throw new IllegalDateException(IllegalDateException.DAY_ILLEGAL);
        }
        this.day = day;
        this.mon = mon;
        this.year = year;
    }

    public Date(String date) throws IllegalDateException {
        String[] parts = date.split("\\.");
        int mon = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);
        if (!(mon < 13 && mon > 0)) {
            throw new IllegalDateException(IllegalDateException.MON_ILLEGAL);
        } else if (day < 31 && day > 0) {
            throw new IllegalDateException(IllegalDateException.DAY_ILLEGAL);
        }

        this.day = Integer.parseInt(parts[0]);
        this.mon = Integer.parseInt(parts[1]);
        this.year = Integer.parseInt(parts[2]);

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMon() {
        return mon;
    }

    public void setMon(int mon) {
        this.mon = mon;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean istSchaltjahr() {
        if (this.year % 4 == 0 && (this.year % 100 != 0 || this.year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public boolean isValidDate(Date d) {
        if ((d.mon < 13 && d.mon > 0) && (d.day < 31 && d.day > 0)) {
            return true;
        }
        return false;
    }
}
