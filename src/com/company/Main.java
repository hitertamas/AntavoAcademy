package com.company;

public class Main {
    public static void main(String[] args) {
        Kocsmaros julcsa = new Kocsmaros();
        Kocsmaros bela = new Kocsmaros(100);

        Ember tamas = new Ember("Tamas", 24, true);
        Ember roli = new Ember("Roli", 23, true);
        Ember lany = new Ember("Lany", 18, false);

        Ital kevert = new Ital();
        kevert.setAr(180);
        kevert.setAlkoholtartalom(5);

        Ital kola = new Ital();
        kola.setAr(300);

        // Kezdődjön a buli
        tamas.jon();
        tamas.iszik(bela);
        tamas.iszik(bela, kevert);
        tamas.iszik(bela, kola);
        tamas.iszik(bela, kevert);
        tamas.alszik();
        tamas.hazamegy();

        roli.jon();
        roli.iszik(julcsa, kola);
        roli.iszik(julcsa, kola);
        roli.iszik(julcsa, kola);
        roli.iszik(julcsa, kola);
        roli.hazamegy();

        lany.jon();
        lany.iszik(bela, kevert);
        lany.hazamegy();

        // Vege a bulinak
        while (Kocsmaros.getKoszosPoharak() > 0) {
            bela.elmos();
        }
    }
}
