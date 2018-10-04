package ru.mukhametzyanov.task2;

public class Son {

    public void eat(Food food) {
        System.out.println("I go eat");
        if (!food.isDelicious()) {
            throw new RuntimeException("Tasteless food");
        }
    }

    public void thankYou() {
        System.out.println("Thank you");
    }

    public void kiss() {
        System.out.println("Kiss");
    }
}
