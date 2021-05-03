package lesson5;

public class TestCat {

    public static void main(String[] args) {
        Cat cat1=new Cat();
        cat1.name="Barsik";
        cat1.color="Black";
        cat1.age=2;

        Cat cat2=new Cat();
        cat2.name="Markiz";
        cat2.color="White";
        cat2.age=6;

        System.out.println(cat1.name);
        System.out.println(cat2.name);
        cat2.meow();
    }
}
