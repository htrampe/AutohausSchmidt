public class App {

    static Auto[] _autos;
    static Kunde[] _kunden;

    static Verkauf[] _verkaeufe;

    public static void main(String[] args) throws Exception {
        //Initialisieren von _autos
        _autos = new Auto[8];

        _verkaeufe = new Verkauf[8];

        _autos[0] = new Auto("VW", "Polo");
        _autos[1] = new Auto("Toyota", "Corolla");
        _autos[2] = new Auto("VW", "Touran");

        Menu menu = new Menu();
        menu.startMenu();
    }

    
    
    public static void addAuto(Object auto){
        int i = 0;
        for(Auto a : getAllAutos()){
            if(a == null){
                _autos[i] = (Auto) auto;
                break;
            }
            i = i + 1;

            if(i > 7){
                System.out.println("Kein Platz mehr auf dem Hof vom Schmidt...");
            }
        }
    }   

    public static void addObject(Object ele, Object[] array){
        int i = 0;
        for(Object array_ele : array){
            if(array_ele == null){
                array[i] = ele;
                break;
            }
            else{
                i++;
            }
        }
    }
    
    
    
    public static Auto[] getAllAutos(){
        return _autos;
    }

    public static Kunde[] getAllKunden(){
        return _kunden;
    }
}