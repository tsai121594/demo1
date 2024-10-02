package org.example.demo1;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import org.primefaces.event.FileUploadEvent;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named(value = "user")
@RequestScoped
public class User implements Serializable {
    private String firstName = "Test";
    private String lastName;
    private String dob;
    private String phone;
    private String country;

    public List<String> countryList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("India");
        list.add("Australia");
        list.add("Germany");
        list.add("Italy");
        list.add("United States");
        list.add("Russia");
        return list;
    }

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

    public String showDetails() {
        System.out.println(firstName + " " + lastName + " " + dob);
        FacesMessage msg = new FacesMessage("Successful", "Welcome :" + this.getFirstName() + " " + this.getLastName() + " " + dob + " " + phone);
        FacesContext.getCurrentInstance().addMessage("growl", msg);
        return "userDetails";
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void handleFileUpload(FileUploadEvent event) {
        FacesMessage message = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage("growl", message);
    }
}