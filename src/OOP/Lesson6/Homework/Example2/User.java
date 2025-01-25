package OOP.Lesson6.Homework.Example2;

public class User {
    private String userName;
    private String userEmail;
    private int id;
    int count = 0;

    static {
        System.out.println("Statik blok ishlayabd. Rollar ......: ");
        System.out.println("ADMIN");
        System.out.println("USER");
    }

    {
        id = count++;
        System.out.println("Instance block ishlayabdi . Foydalanuvchi ID => " + id);
    }

    public User(String userName, String userEmail) {
        this.userName = userName;
        this.userEmail = userEmail;
        count++;
        System.out.println("Konstruktor ishlayabdi . Foydalanuvchi yaratildi => " + userName);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", id=" + id +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
