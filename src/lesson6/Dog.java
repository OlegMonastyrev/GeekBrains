package lesson6;

public class Dog extends Animal{

    public static int RUN_DIST=1000;
    public static int SWIM_DIST=100;

    public Dog(int runDist, int swimDist) {
        super(runDist, swimDist);
    }

    public Dog() {
        this(RUN_DIST, SWIM_DIST);
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
        if (this.swimDist>=dist) {
            System.out.println("Собака проплыла:"+dist+"метров."+"Максимальная дистанция:"+swimDist+"метров.");
            return true;
        }
        System.out.println("Собака не проплыла дистанцию:"+dist+"метров."+"Максимальная дистанция:"+swimDist+"метров.");
        return false;
    }
}
