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
    
    public int feldSetzen(String feldId)
    {
        if (spielFeld.istFeldFrei(feldId) == true && spielFeld.istFeldValide(feldId) == true){
           spielFeld.feldEingeben(feldId, aktuellerSpieler);
           spielerWechsel();
           return 0;  // Feld gesetzt
        } else if (spielFeld.istFeldFrei(feldId) == false){ 
            return 1; // Feld ist belegt
        } else if (spielFeld.istFeldValide(feldId) == false){
            return 2; // Feld existiert nicht
        } else return 3;
    } 
    
    public boolean eingabePruefen(String feldId){
        if (feldId == "x1" || feldId == "x2" || feldId == "x3" || feldId == "y1"
        || feldId == "y2" || feldId == "y3"
        || feldId == "z1" || feldId == "z2" || feldId == "z3"){
            return true;
        } else{
            // ausgabe.falscheEingabe(); Todo: Methode um Fehlermeldung auszugeben,
            // wenn man ein ung�ltiges Feld eingibt.
            return false;
        }
    }
}
