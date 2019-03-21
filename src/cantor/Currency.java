package cantor;

public class Currency {
    private double pln;
    private double usd;
    private double gbp;
    private double eur;
    private double jpy;
    private double czk;
    private double rub;

    public Currency(double amount) {
        this.pln = amount;
        this.usd = amount;
        this.gbp = amount;
        this.eur = amount;
        this.jpy = amount;
        this.czk = amount;
        this.rub = amount;
    }

    public  double getSum(){
        return pln + usd + gbp + eur + jpy + czk + rub;
    }

    public double getPln() {
        return pln;
    }

    public void setPln(double pln) {
        this.pln = pln;
    }

    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }

    public double getGbp() {
        return gbp;
    }

    public void setGbp(double gbp) {
        this.gbp = gbp;
    }

    public double getEur() {
        return eur;
    }

    public void setEur(double eur) {
        this.eur = eur;
    }

    public double getJpy() {
        return jpy;
    }

    public void setJpy(double jpy) {
        this.jpy = jpy;
    }

    public double getCzk() {
        return czk;
    }

    public void setCzk(double czk) {
        this.czk = czk;
    }

    public double getRub() {
        return rub;
    }

    public void setRub(double rub) {
        this.rub = rub;
    }
}
