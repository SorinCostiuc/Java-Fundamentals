package com.sda.java_fundamentals.exercitii.pizza_store;

import java.util.Scanner;

public class Main {
    //avem un magain de pizza
    //avem 3 tipuri de pizza in acest magazin, fiecare cu costul ei
    //vrem sa calculam cat costa totalul cand un client cumpara una sau mai multe pizza

    //Magazin
    //Pizza

    public static void main(String[] args) {
//        Pizza quatroFormaggiPizza = new Pizza("Quatro Formaggi", "Italian");
//        quatroFormaggiPizza.setIngredients(new String[]{"ciuperci", "branza", "alta branza"});
//        quatroFormaggiPizza.setPrice(30.5f);
        Pizza quatroFormaggiPizza = new Pizza("Quatro Formaggi", "Italian",
                new String[]{"ciuperci", "branza", "alta branza"}, 30.5f);
//
//        Pizza diavolaPizza = new Pizza();
//        diavolaPizza.setName("Diavola");
//        diavolaPizza.setCrust("Soft");
//        diavolaPizza.setIngredients(new String[]{"ciuperci", "jalepeno", "ciorizo"});
//        diavolaPizza.setPrice(28.5f);
        String[] diavolaIngredients = new String[]{"ciuperci", "jalepeno", "ciorizo"};
        Pizza diavolaPizza = new Pizza("Diavola", "Soft", diavolaIngredients, 28.5f);


//        Pizza margheritaPizza = new Pizza();
//        margheritaPizza.setName("Margherita");
//        margheritaPizza.setCrust("Soft");
//        margheritaPizza.setIngredients(new String[]{"branza", "sos", "ciuperci"});
//        margheritaPizza.setPrice(26.5f);
        String[] margheritaIngredients = new String[]{"branza", "sos", "ciuperci"};
        Pizza margheritaPizza = new Pizza("Margherita", "Soft", margheritaIngredients, 26.5f);

        String[] napoletanPizzaArr = new String[]{"branza", "sos", "branza"};
        Pizza napoletanPizza = new Pizza("Pizza Napoli", "Soft", napoletanPizzaArr, 44.5f);


        PizzaShop pizzaShop = new PizzaShop();
        pizzaShop.setName("Pizza Shop");
//        pizzaShop.setMenu(new String[] {"Quatro Fordasdamaggi", "Diavola", "Margherita"});
        pizzaShop.setPizzas(new Pizza[]{diavolaPizza, margheritaPizza, quatroFormaggiPizza, napoletanPizza});

        runShop(pizzaShop);
    }

    public static void runShop(PizzaShop pizzaShop) {
        //afisam toate optiunile de pizza
        String[] pizzaNames = pizzaShop.getPizzaNames();
        for (String s : pizzaNames) {
            System.out.println(s);
        }

        Scanner scanner = new Scanner(System.in);
        String pizzaNameChosen = "";
        Order order = new Order();

        while (!pizzaNameChosen.equals("enough")) {
            System.out.println("What pizza do you want? [Write 'enough' to buy what you selected]");
            pizzaNameChosen = scanner.nextLine();
            if (pizzaShop.isPizzaNameCorrect(pizzaNameChosen)) {
                //vedem ce pizza a ales
                Pizza pizza = pizzaShop.getPizzaForSpecifiedName(pizzaNameChosen);
                order.addPizzaToOrder(pizza);
                //printam si ce pizza a comandat pana acum
                System.out.println("Your current total is: " + order.getTotalPrice());
                order.printAllOrderedPizzas();
            } else if (pizzaNameChosen.equals("enough")) {
                System.out.println("Your total price is: " + order.getTotalPrice());
                order.printAllOrderedPizzas();
            } else {
                System.out.println("We don't have the pizza you chose");
            }
        }
    }
}
