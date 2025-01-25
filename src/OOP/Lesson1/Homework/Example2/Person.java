package OOP.Lesson1.Homework.Example2;

import java.util.Arrays;

public class Person {
    protected String nomi;
    protected String phone;
    protected String password;
    private String[] numberArray;
    private String[] passwordArray;

    public Person(String nomi, String phone, String password) {
        this.nomi = nomi;
        this.phone = phone;
        this.password = password;
        this.numberArray = new String[]{phone};
        this.passwordArray = new String[]{password};
    }

    public Person() {
    }

    public void changePassword(String phone , String oldPassword , String newPassword){
        int index = findIndex(phone);
        if(index != -1){
            if(passwordArray[index].equals(oldPassword)){
                passwordArray[index] = newPassword;
                System.out.println("Parolingiz o'zgartirildi !");
            }
            else System.out.println("Siz kiritgan parol xato !");
        }
        else {
            System.out.println("Siz kiritgan raqam ro'yxatdan o'tmagan !");
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "numberArray=" + Arrays.toString(numberArray) +
                ", passwordArray=" + Arrays.toString(passwordArray) +
                '}';
    }

    void showInfo(){
        System.out.println(Arrays.toString(numberArray) + " " + Arrays.toString(passwordArray));
    }

    int findIndex(String phone){
        for(int i = 0; i < numberArray.length; i++){
            if(numberArray[i].equals(phone)) return i;
        }
        return -1;
    }
    void add(){
        String[] arrNum = new String[numberArray.length + 1];
        String[] arrPass = new String[passwordArray.length + 1];
        int j = 0;
        for (String s : numberArray) {
            arrNum[j++] = s;
        }
        arrNum[j] = this.phone;
        this.numberArray = arrNum;
        j = 0;
        for(String s : passwordArray){
            arrPass[j++] = s;
        }
        arrPass[j] = this.password;
        this.passwordArray = arrPass;
    }

    public String getNomi() {
        return nomi;
    }

    public void setNomi(String nomi) {
        this.nomi = nomi;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
