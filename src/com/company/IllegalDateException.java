package com.company;

/**
 * @author david
 */
public class IllegalDateException extends Exception {
    private int type;
    public static final int DAY_ILLEGAL = 1;
    public static final int MON_ILLEGAL = 2;

    public IllegalDateException(int type) {
        this.type = type;
    }

    // throw new IllegalDateException(IllegalDateException.DAY_ILLEGAL)
    // try {
    //} catch (IllegalDateException e){
    //     e.
    // }
}
