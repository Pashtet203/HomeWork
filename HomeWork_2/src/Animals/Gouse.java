package Animals;

public class Gouse extends  Herbivore {
    @Override
    public void fly() {
        System.out.println("Гусь умеет летать");
    }

    @Override
    public void run() {
        System.out.println("Гусь может бегать по земле");
    }

    @Override
    public void swim() {
        System.out.println("Гусь умеет плавать");
    }

    @Override
    public String voice() {
        return "шшшш, уаауаа";
    }

}
