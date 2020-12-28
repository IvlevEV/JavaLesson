package Lesson06.Animal;

public abstract class Animal {
    private AnimalCounter counter;
    private String name;
    private int maxRun;
    private int maxSwim;

    public Animal(AnimalCounter counter,String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.counter = counter;
        counter.increaseAnimal();
    }

   public AnimalCounter getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public void run(int distance) {
        if (distance > maxRun) {
            System.out.printf("%s не спсобен пробежать дистанцию %s метров.%n", name, distance);
            return;
        }
        System.out.printf("%s пробежал дистанцию %s метров.%n", name, distance);
    }

    public void swim(int distance) {
        if (distance > maxSwim) {
            System.out.printf("%s не способен проплыть дистанцию %s метров.%n", name, distance);
            return;
        }
        System.out.printf("%s проплыл дистанцию %s метров.%n", name, distance);
    }
}
