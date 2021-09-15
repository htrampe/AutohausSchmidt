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
        String choice = getScanner().nextLine();
        System.out.println("Deine Auswahl ist: " + choice);

        if(choice.equals("1")){
            System.out.println("Verkauf noch nicht implementiert...");
        }
        else if(choice.equals("2")){
            System.out.println("Neuer Kunde noch nicht implementiert...");
        }
        else if(choice.equals("3")){
            createAutoMenu();
        }
        else if(choice.equals("4")){
            System.out.println("Neuer Verkäufer noch nicht implementiert...");
        }
        else {
            System.out.println("Bitte nur 1,2,3,4 eingeben!");
        }
        startMenu();
    }

    
    public void createAutoMenu(){
        System.out.println("Bitte Daten des neuen Autos eingeben:");
        System.out.print("Marke: ");
        String marke = this.getScanner().nextLine();
        System.out.print("Modell: ");
        String modell = this.getScanner().nextLine();
        Auto a1 = new Auto(marke, modell);
        startMenu();
    }

    public void setScanner(Scanner _scanner) {
        this._scanner = _scanner;
    }

    public Scanner getScanner() {
        return _scanner;
    }
    
}
