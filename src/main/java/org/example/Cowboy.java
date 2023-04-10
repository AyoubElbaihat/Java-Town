package org.example;

public class Cowboy extends Humain implements VisagePale{
    int popularite = 0;
    String adjectif = "vaillant";

    public Cowboy(String nom) {
        super(nom);
        setBoissonFavorite("Whisky");
    }

    public void liberer(Dame dame){
        dame.etat = "libre";
        popularite++;
    }
    public void exclamer(){
        Humain.parler(this);
        System.out.println("Prend ça, rascal !");
    }
    public void tirer(Brigand brigand){
        Humain.parler(this);
        System.out.println("le "+this.adjectif+" "+this.getNom()+" tire sur "+brigand.look+". PAN !");
    }
    @Override
    public void presenter(){
        super.presenter();
        Humain.parler(this);
        System.out.println("les autres disent de moi que je suis "+this.adjectif+" et j’ai déjà une popularité "+this.popularite+" !");
    }
    @Override
    public void scalp() {
        Humain.parler(this);
        System.out.println("Aie ma tête !");
    }
}
