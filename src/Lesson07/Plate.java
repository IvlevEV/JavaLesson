package Lesson07;

import static java.lang.Math.*;

public class Plate {
    private int food;


    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        if ((food - n ) > 0){
            food -= n;}
        else System.out.println("Недостаточно еды в тарелке");
    }
    public void info() {
        System.out.println("Еды в тарелке: " + food);
    }
    public void addFood(int n){
        n = abs(n);
        food +=n;
        System.out.println("Еды в тарелке прибавтилось на: " + n);
    }

    public int getFood() {
        return food;
    }
}
