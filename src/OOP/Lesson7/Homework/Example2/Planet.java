package OOP.Lesson7.Homework.Example2;

public enum Planet {
    MERCURY("MERKURIY" , 3.303e+23),
    VENUS("VENERA" , 4.869e+24),
    EARTH("YER" , 5.976e+24),
    MARS("MARS" , 6.421e+23),
    JUPITER("YUPITER" , 1.9e+27),
    SATURN("SATURUN" , 5.688e+26),
    URANUS("URAN" , 8.686e+25),
    NEPTUNE("NEPTUN" , 1.024e+26);

    private String nameUz;
    private double weight;

    Planet(String nameUz, double weight) {
        this.nameUz = nameUz;
        this.weight = weight;
    }

    public void setNameUz(String nameUz) {
        this.nameUz = nameUz;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    static Planet findByName(String name){
        for(Planet planet : Planet.values()){
            if(planet.nameUz.equalsIgnoreCase(name)){
                return planet;
            }
        }
        return null;
    }
}
