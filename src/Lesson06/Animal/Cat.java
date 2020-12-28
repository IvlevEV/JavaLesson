package Lesson06.Animal;

public class Cat extends Animal{
    public Cat(String name, AnimalCounter counter) {
        super(counter, name, 200, 0);
        counter.increaseCat();
    }

        @Override
        public void swim(int distance) {
            System.out.printf("%s не плвает,навеное может может но не признаеться.%n", getName());
        }
}
