package org.example;

public class Barman extends Humain{
    String nomBar;
    public Barman(String nom) {
        super(nom);
        this.nomBar = "Chez "+nom;
    }
    public Barman(String nom, String nomBar) {
        super(nom);
        this.nomBar = nomBar;
    }

    static void parler(Barman barman, String text){
        System.out.println("("+barman.getNom()+") - "+text+" CoCo");
    }
    public void presenter(){
        super.presenter();
        Barman.parler(this,"Je vous servirai votre boisson préférée dans mon bar :"+this.nomBar);
    }

}
