public class Hufflepuff extends hogwarts{
    private int hardworking,proper,honest;

    public Hufflepuff (int Magicpower, int transgression_distance,String name,int hardworking,int proper,int honest) {
        super(Magicpower,transgression_distance,name);
        this.hardworking = hardworking;
        this.proper = proper;
        this.honest = honest;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public int getHonest() {
        return honest;
    }

    public void setProper(int proper) {
        this.proper = proper;
    }

    public int getProper() {
        return proper;
    }
}
