package com.example.latisha.collegeapp;

/**
 * Created by Latisha on 12/7/17.
 */

public class FamilyMember {
    //2.1.4 step 5 implemented in lines 9-10
    private String firstName;
    private String lastName;
    //2.1.4 step 6 implemented in lines 11-25
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //2.1.5 step 10 implemented in FamilyMember()
    public FamilyMember() {
        firstName="Ada";
        lastName="Lovelace";

    }

}
