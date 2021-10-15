/**
 * In der Klasse Spiellogik wird geprueft ob Operationen regelkonform sind.
 * Hier wird der Spielerzug gewechselt und entschieden ob das Spiel zu Ende ist. 
 * 
 * @author sadikdur, jasard, schieph1
 * @version 1
 */

public class Spiellogik
{
    private int aktuellerSpieler;
    private Spielfeld spielFeld;
    private Sprachen sprache;
    private boolean spielBeendet;

    /**
     * Der Konstruktor definiert die Standardwerte.
     * @param spielFeld ist der Parameter der dem Objekt SpielFeld in TicTacToeGame zugewiesen ist.
     * @param sprache ist der Parameter der dem Objekt sprache in TicTacToeGame zugewiesen ist.
     */
    public Spiellogik(Spielfeld spielFeld, Sprachen sprache)
    {
        aktuellerSpieler = 1;
        this.sprache = sprache;
        this.spielFeld = spielFeld;
        spielBeendet = false;
    }

    /**
     * Diese Methode wechselt zwischen Spieler 1 und 2 und gibt eine entsprechende Aussage.
     */
    private void spielerWechsel()
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

    /**
     * Die Methode feldsetzen prueft zuerst ob eine Eingabe regelkonform ist.
     * Anschliessend verändert sie den Wert eines Feldes und stellt das Spiel dar.
     * Daraufhin prueft die Methode ob das Spiel zu ende ist und macht entsprechende Aussagen.
     * 
     * @param feldId ist ein String der einem Feld mittels getFeld() aus der Klasse Spielfeld zugewiesen wird.
     */
    public void feldSetzen(String feldId)
    {
        if(spielFeld.istFeldFrei(feldId) == false){ 
            System.out.println(sprache.getText(8));
        }
        else if (spielFeld.istFeldValide(feldId) == false){
            System.out.println(sprache.getText(7));
        }
        else{
            if (spielBeendet == false) {
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
    }

    /**
     * Ueberprueft ob ein Spiel unentschieden ist.
     */
    public boolean spielUnentschieden(){
        return spielFeld.spielUnentschieden();
    }

    /**
     * Ueberprueft ob ein Spiel gewonnne ist.
     */
    public boolean spielGewonnen(){
        return spielFeld.spielGewonnen();
    }
}
