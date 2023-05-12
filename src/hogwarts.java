public class hogwarts {
    private int Magicpower, transgression_distance;
    private String name;
    public hogwarts(int Magicpower, int transgression_distance,  String name) {
        this.Magicpower = Magicpower;
        this.transgression_distance = transgression_distance;
        this.name=name;

    }

    public void setMagicpower(int magicpower) {
        Magicpower = magicpower;
    }

    public int getMagicpower() {
        return Magicpower;
    }

    public void setTransgression_distance(int transgression_distance) {
        this.transgression_distance = transgression_distance;
    }

    public int getTransgression_distance() {
        return transgression_distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}