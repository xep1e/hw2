public class comparisonbetweenthetwo {
    public void printMagicPower(hogwarts wizard1, hogwarts wizard2) {
        if (wizard1.getMagicpower() > wizard2.getMagicpower()) {
            System.out.println(wizard1.getName() + " has more magic power " + wizard2.getName());
        } else if (wizard2.getMagicpower() > wizard1.getMagicpower()) {
            System.out.println(wizard2.getName() + " has more magic power " + wizard1.getName());
        } else {
            System.out.println("Have the same level of magical power");
        }
    }
    public void printTransgression_distance(hogwarts wizard1, hogwarts wizard2) {
        if (wizard1.getTransgression_distance() > wizard2.getTransgression_distance()) {
            System.out.println(wizard1.getName() + " has more Transgression distance " + wizard2.getName());
        } else if (wizard2.getMagicpower() > wizard1.getMagicpower()) {
            System.out.println(wizard2.getName() + " has more Transgression distance " + wizard1.getName());
        } else {
            System.out.println("Have the same level of Transgression distance");
        }
    }
}

