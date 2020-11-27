import Animals.*;
import food.*;


public class Zoo {
    public static void main(String[] args) {
        Vegetables vegetables = new Vegetables();
        PieceOfMeat pieceOfMeat = new PieceOfMeat();
        Cow cow = new Cow();
        Gouse gouse = new Gouse();
        Crucian crucian = new Crucian();
        Duck duck = new Duck();
        Shark shark = new Shark();
        Wolf wolf = new Wolf();

        Worker bill = new Worker();
        bill.feed(cow,vegetables);
        bill.getVoice(crucian);

        Animals[] pond = new Animals[] {gouse,crucian,duck,shark};
        for (int i = 0; i< pond.length; i++)
            pond[i].swim();
    }
}
