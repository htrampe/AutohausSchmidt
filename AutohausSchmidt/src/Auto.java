public class Auto {
    String _marke;
    int _preis;
    String _modell;
    int _baujahr;

    public Auto(String marke, String modell){
        this.setMarke(marke);
        this.setModell(modell);
    }

    public Auto(String marke){
        this.setMarke(marke);
    }

    public void setBaujahr(int _baujahr) {
        this._baujahr = _baujahr;
    }

    public void setMarke(String _marke) {
        this._marke = _marke;
    }

    public void setModell(String _modell) {
        this._modell = _modell;
    }

    public void setPreis(int _preis) {
        this._preis = _preis;
    }

    public int getBaujahr() {
        return _baujahr;
    }

    public String getMarke() {
        return _marke;
    }
    public String getModell() {
        return _modell;
    }
    public int getPreis() {
        return _preis;
    }
}
