import Animals.Animals;
import food.Food;

public class Worker<Voice> {
    public void feed(Animals animal, Food food)
    {
        animal.eat(food);
    }
    public void getVoice(Animals animal)
    {
        if(animal.voice() != null)
        {
            System.out.println(animal.voice());
        }
        else
            System.out.println("Данное живаотное не произносит звуков");
    }
}
