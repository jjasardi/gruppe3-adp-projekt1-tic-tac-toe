
/**
 * In der Klasse TicTacToeGame wird gespielt.
 * Hier sind x Methoden um ein Spiel zu simulieren.
 * 
 * @author sadikdur, jasard, schieph1
 * @version 1
 */

public class TicTacToeGame
{
    private Spiellogik spielLogik;
    private Spielfeld spielFeld;
    private Sprachen sprache;

    /**
     * Stellt das Spielfeld auf
     */
    public TicTacToeGame(){
        start();
    }

    private void start(){
        spielFeld = new Spielfeld();
        sprache = new Sprachen();
        spielLogik = new Spiellogik(spielFeld, sprache);
        System.out.println(sprache.getText(0));
        System.out.println(sprache.getText(1));
    }
    
    /**
     * Führt eine bestimmte Anzahl von Spielzügen aus und
     * wechselt die Sprache.
     */
    public void spielUnentschieden()
    {
        spielLogik.feldSetzen("x1");
        spielLogik.feldSetzen("y2");
        sprache.wechsleSprache();
        spielLogik.feldSetzen("z1");
        spielLogik.feldSetzen("z1");
        spielLogik.feldSetzen("y1");
        spielLogik.feldSetzen("y3");
        spielLogik.feldSetzen("x2");
        sprache.wechsleSprache();
        spielLogik.feldSetzen("x2");
        spielLogik.feldSetzen("z2");
        spielLogik.feldSetzen("z3");
        spielLogik.feldSetzen("x3");
    }

    /**
     * Führt eine bestimmte Anzahl von Spielzügen aus und
     * wechselt die Sprache.
     */
    public void spielGewonnen1()
    {
        spielLogik.feldSetzen("y2");
        spielLogik.feldSetzen("x3");
        spielLogik.feldSetzen("x15");
        spielLogik.feldSetzen("x1");
        spielLogik.feldSetzen("x1");
        sprache.wechsleSprache();
        spielLogik.feldSetzen("z3");
        spielLogik.feldSetzen("y1");
        spielLogik.feldSetzen("y3");
    }
}
