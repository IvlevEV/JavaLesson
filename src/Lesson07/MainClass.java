package Lesson07;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 32,100);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        plate.info();
        plate.addFood(10);
        plate.info();


        Cat[] masCats = new Cat[3];
        masCats[0] = new Cat("Томас",12,10);
        masCats[1] = new Cat("Бегемот",340,60);
        masCats[2] = new Cat("Филипп Маркович",5,5);
        for (int i = 0; i < masCats.length; i++) {
            masCats[i].eat(plate);
            plate.info();
        }
    }

}
