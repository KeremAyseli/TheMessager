package com.themessagger.DataLayer.Person;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Person {
    @Id
    private String id;
    private String name;
    private String surname;
    private String address;
    private String phone;
    @Indexed(unique = true)
    private String email;
    private String password;
    private String username;
    private String birthdate;
    public Person(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
    public Person() {
    }
    public Person(String name, String surname, String address, String phone, String email, String password,
            String username, String birthdate) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.username = username;
        this.birthdate = birthdate;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    
}
