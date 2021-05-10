package lesson7;

public class Cat {

    private final String name;
    private final int appetite;
    private final boolean satiety;

    public Cat(String name, int appetite) {
        this.name=name;
        this.appetite=appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean eat(Plate plate) { ///метод подсмотрел
        String validateMessage=checkFood(plate);
        if (validateMessage!=null) {
            System.out.println(validateMessage);
            return false;
        }
        eating(plate);
        satiety=true;
        return true;
    }

    public String checkFood(Plate plate) {
        if (!plate.enoughFood(appetite)) {
            return "Еды в тарелке недостаточно";
        }
        if (satiety) {
            return "Кот сыт";
        }
        return null;
    }

    private void eating(Plate plate) {
        plate.minusFood(appetite);
    }

}
