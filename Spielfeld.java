public class Spielfeld
{
    private Feld x1;
    private Feld x2;
    private Feld x3;
    private Feld y1;
    private Feld y2;
    private Feld y3;
    private Feld z1;
    private Feld z2;
    private Feld z3;

    public Spielfeld(){
        x1= new Feld();
        x2= new Feld();
        x3= new Feld();
        y1= new Feld();
        y2= new Feld();
        y3= new Feld();
        z1= new Feld();
        z2= new Feld();
        z3= new Feld();
    }

    /**
     * Die Methode getWert() liefert den int eines Feldes.
     * 
     * @param   feldId    ist ein String der einem Feld mittels getFeld() zugewiesen wird.
     */

    public int getWert(String feldId)
    {
        Feld aktuellesFeld = getFeld(feldId);
        return aktuellesFeld.getWert();

    }

    /**
     * Die Methode istFeldFrei prüft ob ein Feld schon besetzt ist. 
     * 
     * @param   feldId    ist ein String der einem Feld mittels getFeld() zugewiesen wird.
     */

    public boolean istFeldFrei(String feldId)
    {
        Feld aktuellesFeld = getFeld(feldId);
        if (aktuellesFeld.getWert() == 0){
            return true;
        } else return false;
    }

    /**
     * Die Methode istFeldValide prüft ob der eingegebe String in getFeld() vorgesehen ist. 
     * 
     * @param   feldId    ist ein String der einem Feld mittels getFeld() zugewiesen wird.
     */

    public boolean istFeldValide(String feldId)
    {
        Feld aktuellesFeld = getFeld(feldId);
        if (aktuellesFeld == null){
            return false;
        } else return true;
    }

    /**
     * Die Methode feldEingeben ändert den Wert eines Feldes zu 1 für Spieler 1, oder zu 2 für Spieler 2.
     * 
     * @param   feldId    ist ein String der einem Feld mittels getFeld() zugewiesen wird.
     * @param   aktuellerSpieler false steht für Spieler 1, true für Spieler 2.
     */

    public void feldEingeben(String feldId, int aktuellerSpieler){
        Feld aktuellesFeld = getFeld(feldId);
        aktuellesFeld.setWert(aktuellerSpieler);
    }

    /**
     * Die Methode istFeldValide prüft ob der eingegebe String in getFeld() vorgesehen ist. 
     * 
     * @param   feldId    ist ein String der einem Feld mittels getFeld() zugewiesen wird.
     */

    public Feld getFeld(String feldId)
    {
        if (feldId == "x1"){
            return x1;
        } else if (feldId == "x2"){
            return x2;
        } else if (feldId == "x3"){
            return x3;
        } else if (feldId == "y1"){
            return y1;
        } else if (feldId == "y2"){
            return y2;
        } else if (feldId == "y3"){
            return y3;
        } else if (feldId == "z1"){
            return z1;
        } else if (feldId == "z2"){
            return z2;
        } else if (feldId == "z3"){
            return z3;
        } else return null; 
    }

    
    //Die Methode spielDarstellung() visualisiert das aktuelle Spielfeld.
    public void spielDarstellung()
    {
        System.out.println(x1.getWert() +" | "+ x2.getWert() +" | "+ x3.getWert());
        System.out.println("----------");
        System.out.println(y1.getWert() +" | "+ y2.getWert() +" | "+ y3.getWert());
        System.out.println("----------");
        System.out.println(z1.getWert() +" | "+ z2.getWert() +" | "+ z3.getWert());
        System.out.println(" ");
    }

    // Die Methode spielUnentschieden() prüft ob alle Felder mit nicht Nullen besetzt sind.
    public boolean spielUnentschieden(){
        if (x1.getWert() != 0 && x2.getWert() != 0 && x3.getWert() != 0 &&
        z1.getWert() != 0 && z2.getWert() != 0 && z3.getWert() != 0 &&
        y1.getWert() != 0 && y2.getWert() != 0 && y3.getWert() != 0){
            return true;
        }
        else return false;
    }

    public boolean spielGewonnen(){
        if (x1.getWert() != 0 && x1.getWert() == x2.getWert() && x2.getWert() == x3.getWert()){
            return true;
        }
        else if(z1.getWert() != 0 && z1.getWert() == z2.getWert() && z2.getWert() == z3.getWert()){
            return true;
        }
        else if(y1.getWert() != 0 && y1.getWert() == y2.getWert() && y2.getWert() == y3.getWert()){
            return true;
        }
        else if (x1.getWert() != 0 && x1.getWert() == z1.getWert() && z1.getWert() == y1.getWert()){
            return true;
        }
        else if(x2.getWert() != 0 && x2.getWert() == z2.getWert() && z2.getWert() == y2.getWert()){
            return true;
        }
        else if (x3.getWert() != 0 && x3.getWert() == z3.getWert() && z3.getWert() == y3.getWert()){
            return true;
        }
        else if (x1.getWert() != 0 && x1.getWert() == y2.getWert() && y2.getWert() == z3.getWert()){
            return true;
        }
        else if (x3.getWert() != 0 && x3.getWert() == y2.getWert() && y2.getWert() == z1.getWert()){
            return true;
        }
        else {
            return false;}
    }
}

