package com.example.communityloansystem;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class LoanCycle {
    private int id;
    private BigDecimal monthlyPot;
    private List<Integer> contributorIds;
    private LocalDate startDate;
    private LocalDate endDate;
    private int numMonths;

    public LoanCycle(BigDecimal monthlyPot, List<Integer> contributorIds, LocalDate startDate, int numMonths) {
        this.monthlyPot = monthlyPot;
        this.contributorIds = contributorIds;
        this.startDate = startDate;
        this.numMonths = numMonths;
        this.endDate = startDate.plusMonths(numMonths);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getMonthlyPot() {
        return monthlyPot;
    }

    public void setMonthlyPot(BigDecimal monthlyPot) {
        this.monthlyPot = monthlyPot;
    }

    public List<Integer> getContributorIds() {
        return contributorIds;
    }

    public void setContributorIds(List<Integer> contributorIds) {
        this.contributorIds = contributorIds;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getNumMonths() {
        return numMonths;
    }

    public void setNumMonths(int numMonths) {
        this.numMonths = numMonths;
    }
}
