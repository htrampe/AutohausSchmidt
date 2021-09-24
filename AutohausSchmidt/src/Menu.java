import java.util.Scanner;

public class Menu {

    Scanner _scanner;

    public Menu(){
        setScanner(new Scanner(System.in));
    }

    public void startMenu(){
        System.out.println("Bitte wähle aus:");
        System.out.println("(1) Neuer Verkauf");
        System.out.println("(2) Neuer Kunde");
        System.out.println("(3) Neues Auto");
        System.out.println("(4) Neuer Verkäufer");
        System.out.println("(5) Zeige alle Autos");
        System.out.println("(6) Zeige alle Kunden");
        System.out.println("(7) Zeige alle Verkäufer");
        String choice = getScanner().nextLine();
        System.out.println("Deine Auswahl ist: " + choice);

        if(choice.equals("1")){
            createVerkaeufeMenu();
        }
        else if(choice.equals("2")){
            createKundeMenu();
        }
        else if(choice.equals("3")){
            createAutoMenu();
        }
        else if(choice.equals("4")){
            System.out.println("Neuer Verkäufer noch nicht implementiert...");
        }
        else if(choice.equals("5")){
            showAutos();
        }
        else if(choice.equals("6")){
            showKunden();
        }
        else if(choice.equals("7")){
            showVerkaeufer();
        }
        else {
            System.out.println("Bitte nur 1,2,3,4,5,6 eingeben!");
        }
        startMenu();
    }

    public void showAutos(){
        for(Auto auto : App.getAllAutos()) {
            if(auto != null){
                System.out.println(auto.getMarke() + " " + auto.getModell());
            }
        }
    }

    public void showKunden(){
        for(Kunde kunde : App.getAllKunden()) {
            if(kunde != null){
                System.out.println();
            }
        }
    }

    public void showVerkaeufer(){
        for(Kunde kunde : App.getAllKunden()) {
            if(kunde != null){
                System.out.println();
            }
        }
    }

    public void createVerkaeufeMenu(){
        int i = 0;
        System.out.println("Bitte wählen Sie ein Auto aus:");
        for(Auto auto : App.getAllAutos()){
            if(auto != null){
                System.out.println(i + " - " + auto.getMarke() + " " + auto.getModell());
                i++;
            }
        }
        String car_choice = getScanner().next();
        int car_index = Integer.valueOf(car_choice);

        System.out.println(App.getAllAutos()[car_index]);

        // Verkauf v = new Verkauf(App.getAllAutos()[car_index]);
        // Hausaufgabe: Das alles auf Verkäufer und Kunde übertragen, einen Verkauf final erstellen und einen Menüpunkt erstellen, um alle Verkäufe auszugeben :) ! Achtung: Bei Verkauf muss auch ein Int umgewandelt werden, damit wir einen Preis speichern können!
    }





    
    public void createAutoMenu(){
        System.out.println("Bitte Daten des neuen Autos eingeben:");
        System.out.print("Marke: ");
        String marke = this.getScanner().nextLine();
        System.out.print("Modell: ");
        String modell = this.getScanner().nextLine();
        
        App.addAuto(new Auto(marke, modell));
        
        System.out.println(App.getAllAutos());

        startMenu();
    }

    public void createKundeMenu(){
        System.out.println("Bitte Daten des neuen Kunden eingeben:");
        System.out.print("Vorname: ");
        String vorname = this.getScanner().nextLine();
        System.out.print("Nachname: ");
        String nachname = this.getScanner().nextLine();
        Kunde k = new Kunde(vorname, nachname);

        System.out.println("Der neue Kunde heißt " + k.getVorname() + " " + k.getNachname());

        startMenu();
    }

    public void setScanner(Scanner _scanner) {
        this._scanner = _scanner;
    }

    public Scanner getScanner() {
        return _scanner;
    }
    
}
