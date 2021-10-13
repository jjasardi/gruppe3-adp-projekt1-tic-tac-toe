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
    
    /*
    Mit feldSetzen wird überprüft ob der angegebene String zu einem Feld passt und ob das Feld schon belegt ist.
    Wenn beide Bedingungen gegeben sind, wird das Feld, abhängig vom aktuellenSpieler, auf 1 oder 2 gesetzt.
    Anschliessend wird der Zug an den zweiten Spieler übergeben.
    Sind die jeweiligen Bedingungen nicht gegeben, ergibt es eine entsprechende Fehlermeldung.
    */
    public int feldSetzen(String feldId)
    {
        if (spielFeld.istFeldValide(feldId) == true && spielFeld.istFeldFrei(feldId) == true){
           spielFeld.feldEingeben(feldId, aktuellerSpieler);
           spielerWechsel();
           return 0;  // Feld gesetzt
        } else if (spielFeld.istFeldFrei(feldId) == false){ 
            return 1; // Feld ist belegt
        } else if (spielFeld.istFeldValide(feldId) == false){
            return 2; // Feld existiert nicht
        } else return 3;
    }
    
    public boolean spielUnentschieden(){
        return spielFeld.spielUnentschieden();
    }
    
    public boolean spielGewonnen(){
        return spielFeld.spielGewonnen();
    }
}
