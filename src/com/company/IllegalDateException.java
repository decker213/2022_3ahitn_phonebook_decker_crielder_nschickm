package com.company;

/**
 * @author david
 */
public class IllegalDateException extends Exception {
    private int type;
    private int DAY_ILLEGAL ;
    private int MON_ILLEGAL ;

    public IllegalDateException(int type) {
        this.type = type;
    }

   // throw new IllegalDateException(IllegalDateException.DAY_ILLEGAL)
    // try {
    //} catch (IllegalDateException e){
    //     e.
    // }
}
