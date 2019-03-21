package com.company;

import com.company.Ital;
import com.company.Kocsmaros;

public class Ember {
    private String nev;

    private int kor;

    private boolean ferfi;

    private int penz;

    private float reszegseg = 0;

    private boolean kocsmaban = false;

    public Ember(String nev, int kor, boolean ferfi) {
        this.nev = nev;
        this.kor = kor;
        this.ferfi = ferfi;
    }

    public Ember(String nev, int kor, boolean ferfi, int penz) {
        this.nev = nev;
        this.kor = kor;
        this.ferfi = ferfi;
        this.penz = penz;
    }

    public void iszik(Kocsmaros kocsmaros) {
        if (this.kocsmaban) {
            this.penz -= 1;
            this.reszegseg += 1;
            kocsmaros.koszosPoharatKap();
            kocsmaros.setPenz(kocsmaros.getPenz() + 1);
            System.out.println(this.nev + " ivott szeszt");
        } else {
            System.out.println(this.nev + " nincs a kocsmában");
        }

        if (this.reszegseg >= 40) {
            this.alszik();
        }
    }

    public void iszik(Kocsmaros kocsmaros, Ital ital) {
        if (this.kocsmaban) {
            this.penz -= ital.getAr();
            this.reszegseg += ital.getAlkoholtartalom();
            kocsmaros.koszosPoharatKap();
            kocsmaros.setPenz(kocsmaros.getPenz() + ital.getAr());
            System.out.println(this.nev + " ivott szeszt");
        } else {
            System.out.println(this.nev + " nincs a kocsmában");
        }

        if (this.reszegseg >= 40) {
            this.alszik();
        }
    }

    public void alszik() {
        this.reszegseg = 0;
        System.out.println(this.nev + " elaludt");
    }

    public void hazamegy() {
        this.kocsmaban = false;
        System.out.println(this.nev + " hazament");
    }

    public void jon() {
        this.kocsmaban = true;
        System.out.println(this.nev + " a kocsmaba ert");
    }
}
