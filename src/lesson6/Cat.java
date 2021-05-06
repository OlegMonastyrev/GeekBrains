package lesson6;

public class Cat extends Animal {

    public static final int RUN_DIST=500;
    public static final int SWIM_DIST=100;

    public Cat(int runDist) {
        super(runDist);
    }

    public Cat() {
        this(RUN_DIST);
    }

    public boolean run(int dist) {
        if (this.runDist>=dist) {
            System.out.println("Собака пробежала:"+dist+"метров."+"Максимальная дистанция:"+runDist+"метров.");
            return true;
        }
        System.out.println("Собака не пробежала дистанцию:"+dist+"метров."+"Максимальная дистанция:"+runDist+"метров.");
        return false;
    }

    public boolean swim(int dist) {
        System.out.println("Коты не умеют плавать");
        return false;
    }


}
