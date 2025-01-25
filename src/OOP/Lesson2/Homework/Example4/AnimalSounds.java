package OOP.Lesson2.Homework.Example4;

import java.util.Arrays;

public class AnimalSounds {
    private String name;
    private int age;
    private String sound;
    String[] allName;
    int[] allAge;
    String[] allSound;


    public AnimalSounds(String name, int age ,String sound) {
        this.name = name;
        this.age = age;
        this.allName = new String[]{name};
        this.allAge = new int[]{age};
        this.sound = sound;
        this.allSound = new String[]{sound};
    }

    public void makeSound(){
        for(int i = 0; i < allSound.length; i++){
            System.out.println(allName[i] + " " + allAge[i] + " " + allSound[i]);
        }

    }

    public void makeSound(String sound){
        int index =isHave(sound);
        if(index != -1){
            System.out.println(allName[index] + " " + allAge[index] + " " + allSound[index]);
        }
        else System.out.println("No data");
    }

    public int isHave(String sound){
        for(int i = 0; i < allSound.length; i++){
            if(allSound[i].equals(sound)) return i;
        }
        return -1;
    }

    public void add(String name, int age , String sound){
        String[] names = new String[allName.length + 1];
        int[] ages = new int[allAge.length + 1];
        String[] sounds = new String[allSound.length + 1];
        int j = 0;
        for(int i = 0; i < allName.length; i++){
            names[j] = allName[i];
            ages[j] = allAge[i];
            sounds[j++] = allSound[i];
        }
        names[j] = name;
        ages[j] = age;
        sounds[j] = sound;
        allName = names;
        allAge = ages;
        allSound = sounds;
        System.out.println("Added");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
