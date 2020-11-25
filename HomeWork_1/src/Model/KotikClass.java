package Model;

import java.util.Scanner;

public class KotikClass {
    private static int amountCat = 0;
    private int eat = 0;
    private String meow;
    private String name;
    private int weigth;

    public int getAmountCat()
    {
        return  amountCat;
    }

    public  void SetKotik(String name, int weigth, String meow,int eat)
    {
        this.name = name;
        this.weigth = weigth;
        this.meow = meow;
        this.eat = eat;
    }

    public void setEat(int eat) {
        this.eat = eat;

    }
    public int getEat() {
        return eat;
    }

    public void setName (String name)
    {
      this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setWeigth (int weigth)
    {
        this.weigth = weigth;
    }
    public int getWeigth() {
        return weigth;
    }

    public void setMeow (String meow)
    {
        this.meow = meow;
    }
    public String getMeow() {
        return meow;
    }

    public KotikClass(String name, int weigth, String meow,int eat)
    {
        amountCat++;
        setName(name);
        setWeigth(weigth);
        setMeow(meow);
        setEat(eat);
    }
    public KotikClass ()
    { amountCat++;}

    public boolean Play()
    {
        if (this.eat > 0)
        {
            System.out.println("Котик играет");
            return  true;
        }
        System.out.println("Котик хочет кушать");
        return false;

    }
    public boolean Sleep()
    {
        if (this.eat > 0)
        {
            System.out.println("Котик спит");
            return  true;
        }

        return false;
    }
    public boolean Walking()
    {
        if (this.eat > 0)
        {
            System.out.println("Котик гуялет");
            return  true;
        }
        return false;
    }
    public boolean WashUp()
    {
        if (this.eat > 0)
        {
            System.out.println("Котик умывается");
            return  true;
        }
        return false;
    }
    public boolean chaseMouse()
    {
        if (this.eat > 0)
        {
            System.out.println("Котик гоняет мышь");
            return  true;
        }
        return false;
    }

    public void Eat(int satiety)
    {
        this.eat += satiety;
        System.out.println("Текущее количество едениц сытости коткиа" +  getEat());
    }
    public void Eat(int satiety,String food)
    {
        if (satiety > 0 && satiety <11)
        {
            this.eat += satiety;
            System.out.println("Котик скушал " + food +  " и восстановил " + satiety + " едениц сытости");
        }
        else
        {
            System.out.println("Не верно указанные значения, потворите ввод");
        }
    }
    public void Eat()
    {
        Scanner scanner = new Scanner(System.in);
        Eat(scanner.nextInt(),scanner.next());
    }

    public void  liveAnotherDay()
    {
        for (int i = 0; i<24; i++)
        {
            int n = (int)(Math.random() * 5 + 1);
            switch (n)
            {
                case 1:
                    if(Play())
                    {
                        this.eat -= (int)(Math.random() * 3 + 1);
                        break;
                    }
                    else
                    {
                        System.out.println("Текущие количество едениц сытости кота " + getEat());
                        System.out.println("Введите количество едениц сытости от 1 до 10 , и еду которой будете кормить кота, или просто еденицы сытости");
                        Eat();
                        break;
                    }
                case 2:
                    if(Sleep())
                    {
                        this.eat -= (int)(Math.random() * 3 + 1);
                        break;
                    }
                    else
                    {
                        System.out.println("Текущие количество едениц сытости кота " + getEat());
                        System.out.println("Введите количество едениц сытости от 1 до 10 , и еду которой будете кормить кота, или просто еденицы сытости");
                        Eat();
                        break;
                    }
                case 3:
                    if(Walking())
                    {
                        this.eat -= (int)(Math.random() * 3 + 1);
                        break;
                    }
                    else
                    {
                        System.out.println("Текущие количество едениц сытости кота " + getEat());
                        System.out.println("Введите количество едениц сытости от 1 до 10 , и еду которой будете кормить кота, или просто еденицы сытости");
                        Eat();
                        break;
                    }
                case 4:
                    if(WashUp())
                    {
                        this.eat -= (int)(Math.random() * 3 + 1);
                        break;
                    }
                    else
                    {
                        System.out.println("Текущие количество едениц сытости кота " + getEat());
                        System.out.println("Введите количество едениц сытости от 1 до 10 , и еду которой будете кормить кота, или просто еденицы сытости");
                        Eat();
                        break;
                    }
                case 5:
                    if(chaseMouse())
                    {
                        this.eat -= (int)(Math.random() * 3 + 1);
                        break;
                    }
                    else
                    {
                        System.out.println("Текущие количество едениц сытости кота " + getEat());
                        System.out.println("Введите количество едениц сытости от 1 до 10 , и еду которой будете кормить кота, или просто еденицы сытости");
                        Eat();
                        break;
                    }
                case 6:
                    this.eat -= (int)(Math.random() * 4 + 1);
                    break;
                default: break;
            }

        }


    }

    public void  CompareMeow(KotikClass kot)
    {
        if (this.getMeow().contains(kot.getMeow()))
            System.out.println("Мяукание одинаково");
        else
            System.out.println("Мяукание разное ");
    }
}
