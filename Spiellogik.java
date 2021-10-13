public class Spiellogik
{
    private boolean aktuellerSpieler;
    private Spielfeld spielFeld;
    private Sprachen sprache;

    public Spiellogik(Spielfeld spielFeld)
    {
        aktuellerSpieler = false;
        sprache = new Sprachen();
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
    public void feldSetzen(String feldId) // To Do: Code Verbessern, mit nur if, else if, else 
    {
        if (spielFeld.istFeldValide(feldId) == true && spielFeld.istFeldFrei(feldId) == true){
            spielFeld.feldEingeben(feldId, aktuellerSpieler);
            spielerWechsel();
        } else if (spielFeld.istFeldFrei(feldId) == false){ 
            System.out.println(sprache.getText(8));
        } else if (spielFeld.istFeldValide(feldId) == false){
            System.out.println(sprache.getText(7));
        }
    }

    public boolean spielUnentschieden(){
        System.out.println(sprache.getText(5));
        return spielFeld.spielUnentschieden();
    }

    public boolean spielGewonnen(){
        if (aktuellerSpieler == false){
            System.out.println(sprache.getText(3));
        }
        if (aktuellerSpieler == true){
            System.out.println(sprache.getText(4));
        }
        return spielFeld.spielGewonnen();
    }
}
