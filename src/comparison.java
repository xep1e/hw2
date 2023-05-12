public class comparison {

    public void print(Gryffindor g1, Gryffindor g2) {
        int sum1 = g1.getNobility() + g1.getNobility();
        int sum2 = g2.getNobility() + g2.getNobility();
        if (sum1 > sum2) {
            System.out.println(g1.getName() + " Better Gryffindor that " + g2.getName());
        } else if (sum2 > sum1) {
            System.out.println(g2.getName() + " Better Gryffindor that " + g1.getName());
        } else {
            System.out.println("equal in strength");
        }
    }

    public void print(Hufflepuff h1, Hufflepuff h2) {
        int sum1 = h1.getHardworking()+ h1.getHonest()+h1.getProper();
        int sum2 = h2.getHardworking()+ h2.getHonest()+h2.getProper();
        if (sum1 > sum2) {
            System.out.println(h1.getName() + " Better Hufflepuff that " + h2.getName());
        } else if (sum2 > sum1) {
            System.out.println(h1.getName() + " Better Hufflepuff that " + h2.getName());
        } else {
            System.out.println("equal in strength");
        }

    }

    public void print(Ravenclaw r1, Ravenclaw r2) {
        int sum1 = r1.getCreative()+r1.getWise()+r1.getSmart();
        int sum2 = r2.getCreative()+r2.getWise()+r2.getSmart();

        if (sum1 > sum2) {
            System.out.println(r1.getName() + " Better Ravenclaw thar " + r2.getName());
        } else if (sum2 > sum1) {
            System.out.println(r2.getName() + " Better Ravenclaw thar " + r1.getName());
        } else {
            System.out.println("equal in strength");
        }
    }
    public void print(Slytherin s1, Slytherin s2) {
        int sum1 = s1.getAmbition()+s1.getThirstforpower()+s1.getResourcefulness()+s1.getTrick()+s1.getDetermination();
        int sum2 = s2.getAmbition()+s2.getThirstforpower()+s2.getResourcefulness()+s2.getTrick()+s2.getDetermination();
        if (sum1 > sum2) {
            System.out.println(s1.getName() + " Better Slytherin thar " + s2.getName());
        } else if (sum2 > sum1) {
            System.out.println(s2.getName() + " Better Slytherin thar " + s1.getName());
        } else {
            System.out.println("equal in strength");
        }
    }
}
