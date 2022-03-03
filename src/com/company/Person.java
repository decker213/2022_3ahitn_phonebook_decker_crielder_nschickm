package com.company;

/**
 * @author david
 */
public class Person {
    private String name;
    private String givenname;
    private Date birthday;
    private Phone phonenumber;

    public Person(String name, String givenname, Date birthday, Phone phonenumber) {
        this.name = name;
        this.givenname = givenname;
        this.birthday = birthday;
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", givenname='" + givenname + '\'' +
                ", birthday=" + birthday +
                ", phonenumber=" + phonenumber +
                '}';
    }
}
