package org.example;

public class Brigand extends Humain implements HorsLaLoi , VisagePale{
    String look = "méchant";
    int nbDamesEnlevees;
    int recompense = 100;
    String etat = "libre";

    public Brigand(String nom) {
        super(nom);
        setBoissonFavorite("Tord-Boyaux");
    }

    public int getRecompense() {
        return recompense;
    }
    public void kidnapper(Dame dame){
        Humain.parler(this);
        System.out.println("Ah ah ! "+dame.getNom()+", tu es mienne désormais");
    }
    public void seFaireEmprisonner(Cowboy cowboy){
        Humain.parler(this);
        System.out.println("Damned, je suis fait ! "+cowboy.getNom()+", tu m’as eu !");
        this.etat = "en prison ";
    }

    public String getEtat() {
        return etat;
    }
    @Override
    public String quelEstTonNom(){
        return super.getNom()+" le "+this.look;
    }
    public void presenter(){
        super.presenter();
        Humain.parler(this);
        System.out.println("J’ai l’air "+this.getLook()+" et j’ai déjà kidnappé "+this.getNbDamesEnlevees()+" dames !");
        Humain.parler(this);
        System.out.println("Ma tête est mise à prix à "+this.getRecompense()+"$");
    }

    public String getLook() {
        return look;
    }

    public int getNbDamesEnlevees() {
        return nbDamesEnlevees;
    }

    public void setRecompense(int recompense) {
        this.recompense = recompense;
    }


    @Override
    public void scalp() {
        Humain.parler(this);
        System.out.println("Aie ma tête !");
    }
}
