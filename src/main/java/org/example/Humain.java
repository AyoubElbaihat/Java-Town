package org.example;

public class Humain {
    private String nom;
    private String boissonFavorite = "eau";

    public Humain(String nom) {
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
    }

    public String getNom() {
        return nom;
    }
    public String quelEstTonNom(){return nom;}

    public String getBoissonFavorite() {
        return boissonFavorite;
    }
//
    static void parler(Humain humain){
        System.out.print("("+humain.getNom()+") - ");
    }
    public void presenter(){
        Humain.parler(this);
        System.out.println("Bonjour, "+this.getNom()+" ma boisson favorite "+this.getBoissonFavorite());
    }
    public void boire(){
        Humain.parler(this);
        System.out.println("Ah ! un bon verre de "+this.getBoissonFavorite()+" ! GLOUPS !");
    }

    public void setBoissonFavorite(String boissonFavorite) {
        this.boissonFavorite = boissonFavorite;
    }
}
