public class PrintService {
    public void print(Gryffindor gryffindors) {
        System.out.println("Name: " + gryffindors.getName() +
                "; Magicpower: " + gryffindors.getMagicpower() +
                "; Transgression_distance: " + gryffindors.getTransgression_distance() +
                "; Nobility: " + gryffindors.getNobility() +
                "; Honor: " + gryffindors.getHonor() +
                "; Bravery: " + gryffindors.getBravery());
    }

    public void print(Hufflepuff hufflepuffs) {
        System.out.println("Name: " + hufflepuffs.getName() +
                "; Magicpower: " + hufflepuffs.getMagicpower() +
                "; Transgression_distance: " + hufflepuffs.getTransgression_distance() +
                "; Hardworking: " + hufflepuffs.getHardworking() +
                "; Proper: " + hufflepuffs.getProper() +
                "; Honest: " + hufflepuffs.getHonest());
    }

    public void print(Ravenclaw ravenclaws) {
        System.out.println("Name: " + ravenclaws.getName() +
                "; Magicpower: " + ravenclaws.getMagicpower() +
                "; Transgression_distance: " + ravenclaws.getTransgression_distance() +
                "; Smart: " + ravenclaws.getSmart() +
                "; Wise:" + ravenclaws.getWise() +
                "; Creative: " + ravenclaws.getCreative());
    }

    public void print(Slytherin slytherins) {
        System.out.println("Name: " + slytherins.getName() +
                "; Magicpower: " + slytherins.getMagicpower() +
                "; Transgression_distance: " + slytherins.getTransgression_distance() +
                "; Trick: " + slytherins.getTrick() +
                "; Determination:" + slytherins.getDetermination() +
                "; Ambition: " + slytherins.getAmbition() +
                "; Resourcefulness: " + slytherins.getResourcefulness() +
                "; Thirst for power: " + slytherins.getThirstforpower());
    }
}




