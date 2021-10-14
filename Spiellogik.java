public class Spiellogik
{
    private int aktuellerSpieler;
    private Spielfeld spielFeld;
    private Sprachen sprache;
    private boolean spielBeendet;

    public Spiellogik(Spielfeld spielFeld, Sprachen sprache)
    {
        aktuellerSpieler = 1;
        this.sprache = sprache;
        this.spielFeld = spielFeld;
        spielBeendet = false;
    }

    public void spielerWechsel()
    {
        if (aktuellerSpieler == 1){
            aktuellerSpieler = 2;
            System.out.println(sprache.getText(2));
        }
        else {
            aktuellerSpieler = 1;
            System.out.println(sprache.getText(1));
        }
    }

    /*
    Mit feldSetzen wird überprüft ob der angegebene String zu einem Feld passt und ob das Feld schon belegt ist.
    Wenn beide Bedingungen gegeben sind, wird das Feld, abhängig vom aktuellenSpieler, auf 1 oder 2 gesetzt.
    Anschliessend wird der Zug an den zweiten Spieler übergeben.
    Sind die jeweiligen Bedingungen nicht gegeben, ergibt es eine entsprechende Fehlermeldung.
     */
    public void feldSetzen(String feldId) // To Do: Code Verbessern, mit nur if, else if, else 
    {
        if(spielFeld.istFeldFrei(feldId) == false){ 
            System.out.println(sprache.getText(8));
        }
        else if (spielFeld.istFeldValide(feldId) == false){
            System.out.println(sprache.getText(7));
        }
        else{
            spielFeld.feldEingeben(feldId, aktuellerSpieler);
            spielFeld.spielDarstellung();
            if(spielGewonnen()){
                if (aktuellerSpieler == 1){
                    System.out.println(sprache.getText(3));
                }
                else{
                    System.out.println(sprache.getText(4));
                }
                spielBeendet = true;
            }
            else if (spielUnentschieden()){
                System.out.println(sprache.getText(5));
                spielBeendet = true;
            }
            if (!spielBeendet){
                spielerWechsel();
            }
        }
    }

    public boolean spielUnentschieden(){
        return spielFeld.spielUnentschieden();
    }

    public boolean spielGewonnen(){
        return spielFeld.spielGewonnen();
    }
}
