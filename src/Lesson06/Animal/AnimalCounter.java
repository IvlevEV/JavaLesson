package Lesson06.Animal;

public class AnimalCounter {
    private int animalCounter;
    private int catCounter;
    private int dogCounter;

    public void increaseAnimal() {
        animalCounter++;
    }

    public void increaseCat() {
        catCounter++;
    }

    public void increaseDog() {
        dogCounter++;
    }

    public int getAnimalCounter() {
        return animalCounter;
    }

    public int getCatCounter() {
        return catCounter;
    }

    public int getDogCounter() {
        return dogCounter;
    }
}


//Да сделал с подсказки с урока. Сперва вобше думал в сторону protected что бы из пакета не вылазить.