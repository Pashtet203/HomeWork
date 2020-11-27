package Animals;

import food.Food;
import food.Grass;

public class Cow extends  Herbivore  {

    @Override
    public void run() {
        System.out.println("Корова может бегать по земле");
    }

    @Override
    public String voice() {
        return "Муууууу";
    }

}
