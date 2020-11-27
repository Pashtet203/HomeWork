package Animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animals {
    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println("Этим можно накормить данное животное");
        } else
            System.out.println("Травоядное не ест мясо");
    }
}
