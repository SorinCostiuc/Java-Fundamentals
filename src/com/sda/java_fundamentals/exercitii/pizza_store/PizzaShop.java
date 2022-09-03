package com.sda.java_fundamentals.exercitii.pizza_store;

public class PizzaShop {
    private String name;
    private Pizza[] pizzas;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPizzaNames() {
        String[] pizzaNames = new String[pizzas.length];
        for (int i = 0; i < pizzas.length; i++) {
            pizzaNames[i] = pizzas[i].getName();
        }

        return pizzaNames;
    }


    public Pizza[] getPizzas() {
        return pizzas;
    }

    public float getPriceForSpecifiedPizza(String pizzaName) {
        for (int i = 0; i < pizzas.length; i++) {
            if (pizzaName.equals(pizzas[i].getName())) { //pizzaName = margherita
                return pizzas[i].getPrice();
            }
        }

        return 0;
    }

    public Pizza getPizzaForSpecifiedName(String pizzaName) {
        for (int i = 0; i < pizzas.length; i++) {
            if (pizzaName.equals(pizzas[i].getName())) {
                return pizzas[i];
            }

        }

        return null;
    }

    public boolean isPizzaNameCorrect(String pizzaName) {
        int i = 0;
        while (i < pizzas.length) {
            if (pizzaName.equals(pizzas[i].getName())) {
                return true;
            }
            i++;
        }

        return false;
    }

    //scoatem o pizza
    public void removePizza() {

    }

    //adauga o pizza
    public void adddPizza() {
    }


    public void setPizzas(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }
}

