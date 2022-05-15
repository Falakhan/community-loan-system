package com.example.communityloansystem;

import java.math.BigDecimal;

//creating contributor class
public class Contributor {
    //fields
    private String firstName;
    private String surname;
    private int id;
    private String address;
    private BigDecimal monthlyDeposit;
    private BigDecimal remainingPayout;
    private BigDecimal totalPayout;

//constructor

    public Contributor(String firstName, String surname, String address, BigDecimal monthlyDeposit, int numMonths) {
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
        this.monthlyDeposit = monthlyDeposit;
        this.totalPayout = monthlyDeposit.multiply(BigDecimal.valueOf(numMonths));
        this.remainingPayout = totalPayout;
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getMonthlyDeposit() {
        return monthlyDeposit;
    }

    public void setMonthlyDeposit(BigDecimal monthlyDeposit) {
        this.monthlyDeposit = monthlyDeposit;
    }

    public BigDecimal getRemainingPayout() {
        return remainingPayout;
    }

    public void setRemainingPayout(BigDecimal remainingPayout) {
        this.remainingPayout = remainingPayout;
    }

    public BigDecimal getTotalPayout() {
        return totalPayout;
    }

    public void setTotalPayout(BigDecimal totalPayout) {
        this.totalPayout = totalPayout;
    }
}
