public class Gryffindor extends hogwarts{
    private int nobility,honor,bravery;


    public Gryffindor (int Magicpower, int transgression_distance, String name,int nobility,int honor,int bravery){
        super(Magicpower,transgression_distance,name);
        this.nobility=nobility;
        this.honor=honor;
        this.bravery=bravery;

    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getBravery() {
        return bravery;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getHonor() {
        return honor;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getNobility() {
        return nobility;
    }
}
