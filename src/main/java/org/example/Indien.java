package org.example;

public class Indien extends Humain{
    private int nbPlumes;
    private String totem = "Coyote";

    public Indien(String nom) {
        super(nom);
        setBoissonFavorite("Jus de racine");
    }
    static void parler(Indien indien, String text){
        System.out.println("("+indien.getNom()+") - "+text+"  Ugh !");
    }
    public void scalp() {
        System.out.println("Aie ma tête !");
        nbPlumes++;
    }

    @Override
    public void presenter() {
        super.presenter();
        parler(this,"Je suis un indien. J'ai " + nbPlumes + " plumes");
    }

    @Override
    public void boire() {
        super.boire();
        parler(this,"je boire "+getBoissonFavorite());
    }
}
