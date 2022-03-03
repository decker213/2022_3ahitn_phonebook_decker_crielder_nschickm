package com.company;

/**
 * @author david
 */
public class IllegalPhoneNumberException extends Exception{
    private int type;
    private int COUNTRY_ILLEGAL;
    private int AREA_ILLEGAL;
    private int NUMBER_ILLEGAL;
    private int STRING_FORMAT_ILLEGAL;

    public IllegalPhoneNumberException(int type) {
        this.type = type;
    }
}
