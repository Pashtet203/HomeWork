package Animals;

public class Shark  extends  Carnivorous {
    @Override
    public void swim() {
        System.out.println("Акула умеет плавать");
    }

    @Override
    public String voice() {
        return "Акула не имеет органов воспроизведения звуков";
    }
}

