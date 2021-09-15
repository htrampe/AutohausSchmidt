public class Kunde {
    String _vorname;
    String _nachname;

    public Kunde(String vorname, String nachname){
        this.setNachname(nachname);
        this.setVorname(vorname);
    }

    public void setNachname(String _nachname) {
        this._nachname = _nachname;
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
