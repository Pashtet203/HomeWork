package Animals;


import food.Food;

public abstract class Animals implements  Fly,Run,Swim,Voice {


    @Override
    public void fly() {

    }

    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }

    @Override
    public String voice() {
        return null;
    }

    public void eat(Food food)
    {}
}
