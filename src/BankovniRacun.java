public class BankovniRacun {
    private String brojRacuna;
    private double stanje;

    public BankovniRacun(String brojRacuna, double stanje) {
        this.brojRacuna = brojRacuna;
        this.stanje = stanje;
    }

    public double getStanje() {
        return stanje;
    }

    public void setStanje(double stanje) {
        this.stanje = stanje;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public double uplati(double iznos){
        if(iznos <= 0){
            throw new IllegalArgumentException("Iznos ne moze biti 0 ili manji");
        }
        else {
            this.stanje = this.stanje + iznos;
            return this.stanje;
        }
    }

    public double isplati(double iznos){
        if(iznos > this.stanje){
            throw new NedovoljnoSredstavaException("Nedovoljno Sredstava");
        } else if (iznos <=0) {
            throw new IllegalArgumentException("Iznos ne moze biti 0 ili manji");
        } else {
            this.stanje = this.stanje - iznos;
            return this.stanje;
        }
    }
}
