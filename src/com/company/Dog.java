package com.company;

public class Dog {
    private String name;
    private String breed;
    private byte age;
    private double ves;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if( !name.matches("[A-Za-z0-9]*"))
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (!breed.matches("[A-Za-z0-9]*")) {
        } else {
            this.breed = breed;
        }
    }
    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if(age < 0){
            System.err.println("Error ");
        } else {
            this.age = age;
        }

    }

    public double getVes() {
        return ves;
    }

    public void setVes(double ves) {
        if (ves<0) {
        }else {
        this.ves = ves;
    }}
}