public class Verkauf {
    
    Auto _auto;
    Kunde _kunde;
    int _preis;
    Verkaeufer _verkaeufer;

    public Verkauf(Auto auto, Verkaeufer verkaeufer, Kunde kunde){
        this.setAuto(auto);
        this.setVerkaeufer(verkaeufer);
        this.setKunde(kunde);
    }

    public int getPreis() {
        return _preis;
    }
    public Auto getAuto() {
        return _auto;
    }
    public Kunde getKunde() {
        return _kunde;
    }
    public Verkaeufer getVerkaeufer() {
        return _verkaeufer;
    }
    public void setPreis(int _preis) {
        this._preis = _preis;
    }
    public void setAuto(Auto _auto) {
        this._auto = _auto;
    }
    public void setKunde(Kunde _kunde) {
        this._kunde = _kunde;
    }
    public void setVerkaeufer(Verkaeufer _verkaeufer) {
        this._verkaeufer = _verkaeufer;
    }

}
