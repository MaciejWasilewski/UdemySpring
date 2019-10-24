package com.mwasilewski.example;

public class CricketCoach implements Coach {
    private FortuneService service;
    private String emailAddress;
    private String team;
    private static int noOfInstances=0;

    public CricketCoach() {
        noOfInstances++;
        System.out.println("Number of instances="+noOfInstances);
    }
    public int getNoOfInstances() {
        return noOfInstances;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setService(FortuneService service) {
        this.service = service;
    }

    @Override
    public String getDailyWorkout() {
        return "Cricket practice";
    }

    @Override
    public String getDailyFortune() {
        return "Cricket "+service.getFortune();
    }
}
