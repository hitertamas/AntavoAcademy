package com.company;

public class Kocsmaros {
    private static int koszosPoharak = 0;

    private int penz;

    public static int getKoszosPoharak() {
        return koszosPoharak;
    }

    public static void setKoszosPoharak(int koszosPoharak) {
        Kocsmaros.koszosPoharak = koszosPoharak;
    }

    public int getPenz() {
        return penz;
    }

    public void setPenz(int penz) {
        this.penz = penz;
    }

    public Kocsmaros() {
        this.penz = 0;
    }

    public Kocsmaros(int penz) {
        this.penz = penz;
    }

    public void koszosPoharatKap() {
        koszosPoharak += 1;
    }

    public void elmos() {
        if (koszosPoharak > 0) {
            koszosPoharak -= 1;
            System.out.println("A kocsmáros elmosott egy poharat");
        } else {
            System.out.println("Nincs mit elmosnia a kocsmárosnak");
        }
    }
}
