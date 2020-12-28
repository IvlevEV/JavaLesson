package Lesson06;

import Lesson06.Animal.Cat;
import Lesson06.Animal.Dog;
import Lesson06.Animal.AnimalCounter;

public class Main {
    public static void main(String[] args){

        AnimalCounter counter = new AnimalCounter();

        Cat kosha = new Cat("Муся",counter);
        Cat kot = new Cat("Вася",counter);
        Cat small_cat = new Cat("Пушок",counter);
        Dog bob = new Dog("Бобик",counter);
        Dog squirrel = new Dog("Белка",counter);



        kosha.run(150);
        kosha.swim(200);
        small_cat.run(30);
        small_cat.swim(2);
        kot.run(550);
        kot.swim(0);
        bob.run(150);
        bob.swim(200);
        squirrel.run(550);
        squirrel.swim(6);


        System.out.println("Созданных котов: " + kosha.getCounter().getCatCounter());
        System.out.println("Созданных собак: " + bob.getCounter().getDogCounter());
        System.out.println("Всего животных: " + kosha.getCounter().getAnimalCounter());
    }

}
