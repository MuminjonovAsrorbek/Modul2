package OOP.Lesson1.Homework.Example1;

public class Phone {
    private String model;
    private String nomi;
    private int yil;
    private String spu;
    private int camera;

    public Phone(String model , String nomi , int yil , String spu){
        this.model = model;
        this.nomi = nomi;
        this.yil = yil;
        this.spu = spu;
    }
    public Phone(){

    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNomi() {
        return nomi;
    }

    public void setNomi(String nomi) {
        this.nomi = nomi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public String getSpu() {
        return spu;
    }

    public void setSpu(String spu) {
        this.spu = spu;
    }
}
