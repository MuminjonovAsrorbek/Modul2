//package OOP.Lesson3.Homework.Example4;
//
//public class Phone {
//    private String phoneName;
//    private int capacity;
//    private int ramCapacity;
//    private String appName;
//    String[] allApp = new String[]{};
//
//    public Phone(String phoneName, int capacity, int ramCapacity) {
//        this.phoneName = phoneName;
//        this.capacity = capacity;
//        this.ramCapacity = ramCapacity;
//    }
//
//    public Phone(String appName) {
//        this.allApp = new String[]{appName};
//    }
//
//    void addApp(String name){
//        if(!isHave(name)){
//            String[] newApps = new String[allApp.length + 1];
//            for(int i = 0; i < )
//        }
//    }
//
//    public boolean isHave(String name){
//        for(int i = 0; i < allApp.length; i++){
//            if(allApp[i].equals(name)) return true;
//        }
//        return false;
//    }
//
//    public String getPhoneName() {
//        return phoneName;
//    }
//
//    public void setPhoneName(String phoneName) {
//        this.phoneName = phoneName;
//    }
//
//    public int getCapacity() {
//        return capacity;
//    }
//
//    public void setCapacity(int capacity) {
//        this.capacity = capacity;
//    }
//
//    public int getRamCapacity() {
//        return ramCapacity;
//    }
//
//    public void setRamCapacity(int ramCapacity) {
//        this.ramCapacity = ramCapacity;
//    }
//
//    public String getAppName() {
//        return appName;
//    }
//
//    public void setAppName(String appName) {
//        this.appName = appName;
//    }
//}
