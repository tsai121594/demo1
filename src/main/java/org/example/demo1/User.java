package org.example.demo1;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named(value = "user")
@ViewScoped
public class User implements Serializable {
    private String firstName = "Test";
    private String lastName;
    private String dob;
    private String phone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

    public User() {
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void showDetails() {
        System.out.println(firstName + " " + lastName + " " + dob);
        FacesMessage msg = new FacesMessage("Successful", "Welcome :" + this.getFirstName() + " " + this.getLastName() + " " + dob + " " + phone);
        FacesContext.getCurrentInstance().addMessage("growl", msg);
    }
}

