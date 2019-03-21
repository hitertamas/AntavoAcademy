package com.company;

public class Ital {
    /**
     *
     */
    private int ar = 0;

    /**
     *
     */
    private float alkoholtartalom = 0;

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public float getAlkoholtartalom() {
        return alkoholtartalom;
    }

    public void setAlkoholtartalom(float alkoholtartalom) {
        this.alkoholtartalom = alkoholtartalom;
    }

    @Override
    public String toString() {
        return "Ital{" +
                "ar=" + ar +
                ", alkoholtartalom=" + alkoholtartalom +
                '}';
    }
}
