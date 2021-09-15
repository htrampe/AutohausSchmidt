public class Verkaeufer {
    
    String _vorname;
    String _nachname;
    int _persnummer;

    public Verkaeufer(String vorname, String nachname, int persnummer){
        this.setNachname(nachname);
        this.setVorname(vorname);
        this.setPersnummer(persnummer);
    }

    public void setNachname(String _nachname) {
        this._nachname = _nachname;
    }

    public void setPersnummer(int persnummer) {
        this._persnummer = persnummer;
    }

    public int getPersnummer() {
        return _persnummer;
    }

    public void setVorname(String _vorname) {
        this._vorname = _vorname;
    }

    public String getNachname() {
        return _nachname;
    }

    public String getVorname() {
        return _vorname;
    }
    
}
