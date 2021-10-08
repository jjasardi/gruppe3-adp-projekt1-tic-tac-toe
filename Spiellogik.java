public class Spiellogik
{
    private boolean aktuellerSpieler;
    private Spielfeld spielFeld;
    
    public Spiellogik(Spielfeld spielFeld)
    {
        aktuellerSpieler = false;
        this.spielFeld = spielFeld;
    }

    public void spielerWechsel()
    {
        aktuellerSpieler=(!aktuellerSpieler);
    }
    
    public boolean getActuellerSpieler()
    {
        return aktuellerSpieler;
    }
    
        public int feldSetzen(String feld)
    {
        
        if (aktuellerSpieler == false){
            return 1;
        } else {
                return 2;
        }
    } 
    
    public boolean eingabePruefen(String feldId){
        if (feldId == "x1" || feldId == "x2" || feldId == "x3" || feldId == "y1"
        || feldId == "y2" || feldId == "y3"
        || feldId == "z1" || feldId == "z2" || feldId == "z3"){
            return true;
        } else{
            // ausgabe.falscheEingabe(); Todo: Methode um Fehlermeldung auszugeben,
            // wenn man ein ungültiges Feld eingibt.
            return false;
        }
    }
}
