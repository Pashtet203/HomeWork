package Animals;

public class Duck  extends Carnivorous{

    @Override
    public void fly() {
        System.out.println("Утка умеет летать");
    }

    @Override
    public void run() {
        System.out.println("Утка может бегать по земле");
    }

    @Override
    public void swim() {
        System.out.println("Утка умеет плавать");
    }

    @Override
    public String voice() {
        return "Кря кря";
    }
}
