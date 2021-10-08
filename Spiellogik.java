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
    
    
}
