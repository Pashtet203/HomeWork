package Animals;

import food.Food;
import food.Grass;
import food.Meat;

public abstract class Carnivorous extends Animals {

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Этим можно накормить данное животное");
        } else
            System.out.println("Хищник не есть траву");
    }
}
