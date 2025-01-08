package com.subscripDatabase.model;
import java.time.LocalDate;
import java.util.concurrent.Flow;

public class Subscriber {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String subscriptionType;
    private LocalDate subscriptionStartDate;
    private boolean isActive;

    private static int idCounter = 0;

    public Subscriber(String firstName, String lastName, String email, String subscriptionType, LocalDate subscriptionStartDate) {
        this.id = ++idCounter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.subscriptionType = subscriptionType;
        this.subscriptionStartDate = subscriptionStartDate;
        this.isActive = true;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public LocalDate getSubscriptionStartDate() {
        return subscriptionStartDate;
    }

    public void setSubscriptionStartDate(LocalDate subscriptionStartDate) {
        this.subscriptionStartDate = subscriptionStartDate;
    }   

   public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}