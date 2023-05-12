public class Slytherin  extends hogwarts{
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstforpower;

    public Slytherin (int Magicpower, int transgression_distance,String name,int trick,int determination,int ambition,int resourcefulness,int thirstforpower) {
        super(Magicpower,transgression_distance,name);
        this.setTrick(trick);
        this.setDetermination(determination);
        this.setAmbition(ambition);
        this.setResourcefulness(resourcefulness);
        this.setThirstforpower(thirstforpower);
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstforpower() {
        return thirstforpower;
    }

    public void setThirstforpower(int thirstforpower) {
        this.thirstforpower = thirstforpower;
    }
}
