package com.bindstone.vcharts;

public class Rgba {
    int cr;
    int cg;
    int cb;
    double ca;

    public Rgba() {
    }

    public Rgba(int cr, int cg, int cb, double ca) {
        this.cr = cr;
        this.cg = cg;
        this.cb = cb;
        this.ca = ca;
    }

    public int getCr() {
        return cr;
    }

    public void setCr(int cr) {
        this.cr = cr;
    }

    public int getCg() {
        return cg;
    }

    public void setCg(int cg) {
        this.cg = cg;
    }

    public int getCb() {
        return cb;
    }

    public void setCb(int cb) {
        this.cb = cb;
    }

    public double getCa() {
        return ca;
    }

    public void setCa(double ca) {
        this.ca = ca;
    }

    public String value() {
        return("rgba("+cr+", "+cg+", "+cb+", "+ca+")");
    }
}
