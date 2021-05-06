package lesson6;

public abstract class Animal {

    protected String name;
    protected int runDist;
    protected int swimDist;

    public Animal(int runDist, int swimDist) {
        this.name=name;
        this.runDist=runDist;
        this.swimDist=swimDist;
    }

    public Animal(int runDist) {
    }

    public abstract boolean run(int dist);
    public abstract boolean swim(int dist);

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return this.getClass().getName()+"пробежал:"+runDist+"и проплыл:"+swimDist;
    }
}
