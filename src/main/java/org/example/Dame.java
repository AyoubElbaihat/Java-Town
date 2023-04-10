package org.example;

public class Dame extends Humain implements VisagePale{
    String couleurRobe;
    String etat = "libre";
    public Dame(String nom){
        super(nom);
        setBoissonFavorite("Lait");
    }
    public void seFaireEnlever(HorsLaLoi horsLaLoi){
        Humain.parler(this);
        System.out.println("je suis enlevee par "+horsLaLoi.getNom());
        this.etat = "captive";

    }
    public void seFaireLiberer(Cowboy cowboy){
        Humain.parler(this);
        System.out.println("merci "+cowboy.getNom());

    }
    public void changerRobe(String couleurRobe){
        this.couleurRobe = couleurRobe;
        Humain.parler(this);
        System.out.println("Regardez ma nouvelle robe "+this.couleurRobe);
    }

    public String getEtat() {
        return etat;
    }

    @Override
    public String quelEstTonNom(){
        return "Miss "+super.getNom();
    }

    public void presenter(){
        super.presenter();
        Humain.parler(this);
        System.out.println("j'ai une belle robe "+this.couleurRobe+" !");
    }
    @Override
    public void scalp() {
        Humain.parler(this);
        System.out.println("Aie ma tête !");
    }
}
