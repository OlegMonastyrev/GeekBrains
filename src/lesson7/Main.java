package lesson7;

import java.awt.event.WindowFocusListener;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cat[] cats= {
                new Cat("Garfield", 10),
                new Cat("Leopold", 5),
                new Cat("Simba", 6),
                new Cat("Kitty", 3),
        };

        Plate plate=new Plate(23);

        printInfo(cats, plate);
        haveEat(cats,plate);
        printInfo(cats,plate);

        addFood(plate);
        plate.info();

        haveEat(cats,plate);
        printInfo(cats,plate);

    }

    private static void addFood(Plate plate) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите количество добавляемой еды");
        int countFood=scanner.nextInt();
        plate.addFood(countFood);
    }
    private static void printInfo(Cat[] cats, Plate plate) {
        plate.info();
        printInfo(cats);
    }
    private static void haveEat(Cat[] cats, Plate plate) {
        for (int i=0;i<cats.length;i++) {
            boolean result=cat.eat(plate);
            System.out.println("Кот "+cat.getName()+" покушал?");
            System.out.println("Ответ"+result);
        }
        System.out.println();
    }
    private static void printInfo(Cat... cats) {
        for (int i=0;i<cats.length;i++) {
            System.out.println("Кот "+cat.getName()+" с аппетитом:"+cat.getAppetite()+"покушал?");
            System.out.println("Ответ:"+!cat.isSatiety);
        }
    }
}
