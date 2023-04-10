package org.example;

public class Sherif extends Cowboy{
    private int nbBrrigandsCoffrer;
    String adjectif = "honnêtes";
    public Sherif(String nom) {
        super(nom);
        this.nbBrrigandsCoffrer = 0;
    }
    public void rechercher(Brigand brigand){

        brigand.setRecompense(brigand.getRecompense()*2);
        parler(this);
        System.out.println("OYEZ OYEZ BRAVE GENS !! "+brigand.getRecompense()+"$ a qui arrêtera "+brigand.getNom()+" le brigand, mort ou vif !! ");

    }
    public void coffrer(HorsLaLoi horsLaLoi) {
        nbBrrigandsCoffrer++;
//        horsLaLoi.etat = "en prison";
        parler(this);
        System.out.println("Au nom de la loi, je vous arrête "+horsLaLoi.getNom()+"!");

    }
    @Override
    public void presenter(){
        super.presenter();
        Humain.parler(this);
        System.out.println("J'ai coffré "+ nbBrrigandsCoffrer +" brigands !");

    }
}
