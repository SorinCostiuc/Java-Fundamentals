package com.sda.java_fundamentals.exercitii.pizza_store;

public class Order {
    private long id;
    private float totalPrice;
    private Pizza[] selectedPizzas = new Pizza[]{};

    private String[] pizzaTypes = new String[]{};
    private int[] pizzaTypeCounter = new int[]{};

    public long getId() {
        return id;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public Pizza[] getSelectedPizzas() {
        return selectedPizzas;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void addPizzaToOrder(Pizza pizza) {
        this.totalPrice += pizza.getPrice();
        selectedPizzas = Utils.appendToArray(selectedPizzas, pizza);


        //pizzaType             - [Diavola, Margherita, QF]
        //pizzaTypeCounter      - [2, 3, 1]
        int index = indexOfSelectedPizza(pizza.getName());
        if (index >= 0) {
            pizzaTypeCounter[index] = pizzaTypeCounter[index] + 1;
        } else {
            pizzaTypes = Utils.appendToArray(pizzaTypes, pizza.getName());
            pizzaTypeCounter = Utils.appendToArray(pizzaTypeCounter, 1);
        }

    }


    private int indexOfSelectedPizza(String pizzaName) {
        for (int i = 0; i < pizzaTypes.length; i++) {
            if (pizzaTypes[i].equals(pizzaName)) {
                //inseamna ca a mai luat acest tip de pizza in comanda curenta
                return i;
            }
        }

        return -1;
    }

    public void printAllOrderedPizzas() {
        for (int index = 0; index < pizzaTypes.length; index++) {
            System.out.println(pizzaTypes[index] + " - " + pizzaTypeCounter[index]);
        }
    }

}
