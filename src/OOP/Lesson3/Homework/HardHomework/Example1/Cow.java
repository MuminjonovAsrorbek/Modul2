package OOP.Lesson3.Homework.HardHomework.Example1;

public class Cow extends Animal{
    @Override
    void eat() {
        System.out.println("The cow grazes on grass.");
    }

    @Override
    void sound() {
        System.out.println("The cow says moo.");
    }

    @Override
    void move() {
        System.out.println("The cow moves slowly in the field.");
    }

    @Override
    void habitat() {
        System.out.println("The cow lives on farms or grasslands.");
    }

    @Override
    void lifespan() {
        System.out.println("Cows can live for over 20 years but on commercial farms the age at slaughter varies considerably.");
    }

    public void uniqueAbility(){
        System.out.println("Cows are highly sensitive, social, and unique animals who remember people who have been unkind to them. Another fascinating fact, cows have such brilliant eyesight that they can nearly see everything around them without moving their heads!");
    }
}
