public class main {
    public static void main(String[] args){
        PrintService printService=new PrintService();
        comparison sravnenie=new comparison();
        comparisonbetweenthetwo Comparison=new comparisonbetweenthetwo();

        Gryffindor HarryPotter=new Gryffindor(98,70,"Harry",100,70,98);
        Gryffindor HermioneGranger=new Gryffindor(80,90,"Hermione Granger",50,98,70);
        Gryffindor RonWeasley=new Gryffindor(79,60,"Ron Weasley",100,100,96);

        Hufflepuff ZachariahSmith=new Hufflepuff(69,49,"Zachariah Smith",54,87,60);
        Hufflepuff CedricDiggory=new Hufflepuff(70,80,"Cedric Diggory",70,60,60);
        Hufflepuff JustinFinchFletchley=new Hufflepuff(79,65,"Justin Finch-Fletchley",60,95,100);

        Ravenclaw ZhouChang=new Ravenclaw(54,40,"Zhou Chang",60,50,68);
        Ravenclaw PadmaPatil=new Ravenclaw(50,76,"Padma Patil",80,50,65);
        Ravenclaw MarcusBelby=new Ravenclaw(65,46,"Marcus Belby",43,41,54);

        Slytherin DracoMalfoy=new Slytherin(96,69,"Draco Malfoy",98,60,90,60,100);
        Slytherin GrahamMontague=new Slytherin(70,50,"Graham Montague",48,50,40,30,40);
        Slytherin GregoryGoyle=new Slytherin(65,31,"Gregory Goyle",30,40,38,50,30);

        printService.print(HarryPotter);
        printService.print(HermioneGranger);
        printService.print(RonWeasley);

        printService.print(ZachariahSmith);
        printService.print(CedricDiggory);
        printService.print(JustinFinchFletchley);

        printService.print(ZhouChang);
        printService.print(PadmaPatil);
        printService.print(MarcusBelby);

        printService.print(DracoMalfoy);
        printService.print(GrahamMontague);
        printService.print(GregoryGoyle);

        sravnenie.print(HarryPotter,HermioneGranger);
        Comparison.printMagicPower(HarryPotter,DracoMalfoy);
        Comparison.printTransgression_distance(HermioneGranger,ZhouChang);


    }
}
