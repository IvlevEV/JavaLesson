package Lesson07;

public class Cat {
    private String name;
    private int appetite; //прожорлевость
    private int feed ; // вместительность жевота кота
    private boolean feedCompleted ; // флаг на сытость кота
    public Cat(String name, int appetite, int feed) {
        this.name = name;
        this.appetite = appetite;
        this.feed = feed;
        this.feedCompleted = false;
    }
    public void eat(Plate p) {
        p.decreaseFood(appetite);
        feed -= appetite;
        if (feed == 0 || feed < appetite )  {
            feedCompleted = true;
        }

        if (p.getFood() < appetite) feedCompleted = false;
        System.out.printf("Сытоыть кота %s в состоянии: %s %n", name,  feedCompleted);
    }

    public boolean isFeedCompleted() {
        return feedCompleted;
    }
}
