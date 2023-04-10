package org.example;

public class Ripoux extends Sherif implements HorsLaLoi{
    private int recompense;
    String etat = "libre";
    public Ripoux(String nom) {
        super(nom);
    }

    @Override
    public void kidnapper(Dame dame) {
        Humain.parler(this);
        System.out.println("Le ripoux " + this.getNom() + " Ah ah ! "+dame.getNom()+", tu es mienne désormais");
    }

    @Override
    public void seFaireEmprisonner(Cowboy cowboy) {
        Humain.parler(this);
        System.out.println("Le ripoux " + this.getNom() + " Damned, je suis fait ! "+cowboy.getNom()+", tu m’as eu !");
        this.etat = "en prison ";
    }

    @Override
    public int getRecompense() {
        return recompense;
    }

    @Override
    public String getEtat() {
        return null;
    }
}
