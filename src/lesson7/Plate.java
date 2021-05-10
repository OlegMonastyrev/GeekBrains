package lesson7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food=food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food=food;
    }

    public void info() {
        System.out.println("Блюдо:"+food);
    }

    public void addFood(int countFood) {
        this.food+=countFood;
    }

    public void minusFood(int appetite) {
        this.food-=appetite;
    }

    public boolean enoughFood(int countFood) {
        return getFood()>=countFood;
    }


}
