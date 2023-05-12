public class Ravenclaw  extends hogwarts{
    private int smart;
    private int wise;
    private int creative;

    public Ravenclaw(int Magicpower, int transgression_distance,String name,int smart,int wise,int creative){
        super(Magicpower,transgression_distance,name);
        this.setSmart(smart);
        this.setWise(wise);
        this.setCreative(creative);
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
}
