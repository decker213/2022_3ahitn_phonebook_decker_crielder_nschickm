package com.company;

/**
 * @author david
 */
public class Person {
    private String name;
    private String givenname;
    private String nickname;
    private Date birthday;
    private PhoneNumber phonenumber;

    public String getName() {
        return name;
    }

    public String getGivenname() {
        return givenname;
    }

    public String getNickname() {
        return nickname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public PhoneNumber getPhonenumber() {
        return phonenumber;
    }

    public Person(String name, String givenname, String nickname, Date birthday, PhoneNumber phonenumber) {
        this.name = name;
        this.givenname = givenname;
        this.nickname = nickname;
        this.birthday = birthday;
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", givenname='" + givenname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", birthday=" + birthday +
                ", phonenumber=" + phonenumber +
                '}';
    }
}
