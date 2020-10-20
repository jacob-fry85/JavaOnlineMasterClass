package com.darwinjacob;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("yaris") || validModel.equals("innova")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }

    }
    public String getModel(){
        return  model;
    }
}
