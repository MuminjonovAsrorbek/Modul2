package OOP.Lesson3.Homework.HardHomework.Example1;

public abstract class Animal {
    static int totalAnimals;

    abstract void eat();
    abstract void sound();
    abstract void move();
    abstract void habitat();
    abstract void lifespan();

    public void showInfo(){
        System.out.println();
        totalAnimals++;
        eat();
        sound();;
        move();
        habitat();
        lifespan();
        System.out.println("All animals : " + totalAnimals);
    }
}
