package org.example;

public class DameBrigand extends Dame implements HorsLaLoi{
    int recompense = 100;
    String etat = "libre";
    public DameBrigand(String nom) {
        super(nom);
    }

    @Override
    public void kidnapper(Dame dame) {
        Humain.parler(this);
        System.out.println("Ah ah ! "+dame.getNom()+", Je t'ai kidnappé");
    }

    @Override
    public void seFaireEmprisonner(Cowboy cowboy) {
        Humain.parler(this);
        System.out.println("Je suis vraiment désolée, "+cowboy.getNom()+" j'ai rien fait!");
        this.etat = "en prison ";
    }

    @Override
    public int getRecompense() {
        return recompense;
    }
}
