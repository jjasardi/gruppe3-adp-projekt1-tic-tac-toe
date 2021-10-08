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
    
    public boolean get()
    {
        return aktuellerSpieler;
    }
    
    public void feldEingeben(String feld, boolean spieler){
        if (feld == "x1" ){
            x1.feldSetzen();
        }
        else if (feld == "x1" ){
                x1.feldSetzen();
        }
        else if (feld == "x2" ){
                x2.feldSetzen();
        }
        else if (feld == "x3" ){
                x3.feldSetzen();
        }
        else if (feld == "y1" ){
                y1.feldSetzen();
        }
        else if (feld == "y2" ){
                y2.feldSetzen();
        }
        else if (feld == "y3" ){
                y3.feldSetzen();
        }
        else if (feld == "z1" ){
                z1.feldSetzen();
        }
        else if (feld == "z2" ){
                z2.feldSetzen();
        }
        else if (feld == "z3" ){
                z3.feldSetzen();
        }
    }
    
        public void feldSetzen(boolean spieler)
    {
        if (spieler == false){
            wert = 1;
        }    else {
                wert = 2;
            }
    } 
}
