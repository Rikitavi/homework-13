package ru.mukhametzyanov.task2;

/**
 * @author Ruslan Mukhmetzyanov
 * 
 */
public class Mother {

    public static void main(String[] args) {
        Food food = new Food(false);
        Son son = new Son();

        try {
            System.out.println("Block try");
            son.eat(food);
        } catch (Exception e) {
            System.out.println("Block catch");
            e.getMessage();
        } finally {
            son.thankYou();
            son.kiss();
        }
    }
}


