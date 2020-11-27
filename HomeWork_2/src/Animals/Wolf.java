package Animals;

public class Wolf  extends  Carnivorous{

    @Override
    public String voice() {
        return "Ррррррр";
    }

    @Override
    public void run() {
        System.out.println("Волк умеет бегать по земле");
    }
}
