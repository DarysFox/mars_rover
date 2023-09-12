package com.example.demo;

public class MarsRover{
    private Long_id;
    private String name;
    @JsonProperty("landing_date")
    private String landingDate;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public getLandingDate(){
        return landingDate;
    }

    public void setLandingDate(String landingDate){
        this.landingDate = landingDate;
    }

}