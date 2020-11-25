import Model.KotikClass;

public class Application {
    public static void main(String[] args) {
        KotikClass kot_1 = new KotikClass();
        KotikClass kot_2 = new KotikClass("Сёма",10,"мяяяяу",10);


        kot_1.setName("Поня");
        kot_1.setWeigth(12);
        kot_1.setMeow("мяя");
        kot_1.setEat(11);

         kot_1.liveAnotherDay();

        kot_1.CompareMeow(kot_2);
        System.out.println("Всего созданно " + kot_1.getAmountCat() +" котика(ов)");
    }
}
