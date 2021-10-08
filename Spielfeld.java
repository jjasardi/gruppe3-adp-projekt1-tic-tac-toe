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
    private Feld a0;
    
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
    
    public boolean istFeldFrei(String feldId)
    {
        Feld aktuellesFeld = getFeld(feldId);
        return aktuellesFeld.istFrei();
    }

    public boolean istFeldValide(String feldId)
    {
        Feld aktuellesFeld = getFeld(feldId);
        if (aktuellesFeld == a0){
            return false;
        } else return true;
    }
    
    public void feldEingeben(String feldId, boolean aktuellerSpieler){
        Feld aktuellesFeld = getFeld(feldId);
        if (aktuellerSpieler==false){
            aktuellesFeld.setWert(1);
        } else {aktuellesFeld.setWert(2);
        }
    }
    
    public Feld getFeld(String feldAuswahl)
    {
        if (feldAuswahl == "x1"){
            return x1;
        } else if (feldAuswahl == "x2"){
            return x2;
        } else if (feldAuswahl == "x3"){
            return x3;
        } else if (feldAuswahl == "y1"){
            return y1;
        } else if (feldAuswahl == "y2"){
            return y2;
        } else if (feldAuswahl == "y3"){
            return y3;
        } else if (feldAuswahl == "z1"){
            return z1;
        } else if (feldAuswahl == "z2"){
            return z2;
        } else if (feldAuswahl == "z3"){
            return z3;
        } else return a0; 
        }
}

