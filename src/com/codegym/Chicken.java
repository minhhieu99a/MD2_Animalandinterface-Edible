package com.codegym;

public class Chicken extends  Animal implements Edible{
    public String makeSound(){
        return "cluck-cluck";
    }
    public String howtoEat(){
        return "could be fried";
    }
}
