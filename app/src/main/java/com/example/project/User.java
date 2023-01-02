package com.example.project;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import java.util.Date;

@Entity
@TypeConverters({DateConverter.class})
public class User {
    @PrimaryKey(autoGenerate = true)
    int userid;
    String userName;
    String email;
    Date dateOfBirth;
    String gender;
    String country ;


    public User() {
        this.dateOfBirth = dateOfBirth;
    }


    public User(String userName, String email , String gender, String country) {
        this.userName = userName;
        this.email = email;
        this.gender = gender;
        this.country = country;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
