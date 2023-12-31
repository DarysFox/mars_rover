package com.example.demo;

public class MarsCamera {
    private Long id;
    private String name;
    @JsonProperty("rover_id")
    private Long roverId;
    private String fullName;

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

    public Long getRoverId(){
        return roverId;
    }

    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

}
