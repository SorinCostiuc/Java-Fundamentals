package com.sda.java_fundamentals.exercitii.pizza_store;

public class Pizza {
    private String name;
    private String crust;
    private String[] ingredients;
    private float price;

    //constructorul default
//    public Pizza() {
//    }

//    public Pizza(String name, String crust) {
//        this.name = name;
//        this.crust = crust;
//    }

    public Pizza(String name, String crust, String[] ingredients, float price) {
        this.name = name;
        this.crust = crust;
        this.ingredients = ingredients;
        this.price = price;
    }



    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getCrust() {
        return crust;
    }

//    public void setCrust(String crust) {
//        this.crust = crust;
//    }

    public String[] getIngredients() {
        return ingredients;
    }

//    public void setIngredients(String[] ingredients) {
//        this.ingredients = ingredients;
//    }

    public float getPrice() {
        return price;
    }

//    public void setPrice(float price) {
//        this.price = price;
//    }
}
