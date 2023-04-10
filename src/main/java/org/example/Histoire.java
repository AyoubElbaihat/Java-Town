package org.example;

public class Histoire {
        public static void main(String[] args) {
            Humain humain = new Humain("Ayoub");
            Dame dame = new Dame("miss");
            Cowboy cowboy = new Cowboy("Cowboy");
            Cowboy clint = new Sherif("Clint");
            Brigand brigand = new Brigand("Bob");
            Barman barman = new Barman("lolo","dodo");
            Ripoux ripoux = new Ripoux("RiRo");
            dame.changerRobe("red");
            brigand.kidnapper(dame);
            dame.seFaireEnlever(brigand);
            System.out.println(dame.getNom());
            System.out.println(cowboy.getNom());
            System.out.println(brigand.getNom());
            brigand.presenter();
            dame.presenter();
            cowboy.presenter();
            barman.presenter();
//            Cowboy clint = new Sherif("Clint");
            clint.presenter();

            ripoux.kidnapper(dame);
            ripoux.seFaireEmprisonner(cowboy);
            DameBrigand dameBrigand = new DameBrigand("Calamity Jane");
            dameBrigand.scalp();
            ripoux.scalp();
            brigand.scalp();
            clint.scalp();
            cowboy.scalp();
            dame.scalp();

























        }

}

