package Lesson06.Animal;

public class Dog extends Animal {
    public Dog(String name,AnimalCounter counter) {
        super(counter, name, 500, 10);
        counter.increaseDog();
    }
}