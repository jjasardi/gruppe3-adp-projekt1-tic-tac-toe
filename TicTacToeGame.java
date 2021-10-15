
/**
 * In der Klasse TicTacToeGame wird gespielt. Hier sind 3 Methoden um ein Spiel
 * zu simulieren.
 * 
 * @author sadikdur, jasard, schieph1
 * @version 1
 */

public class TicTacToeGame {
    private Spiellogik spielLogik;
    private Spielfeld spielFeld;
    private Sprachen sprache;

    /**
     * Leerer Konstruktor.
     */
    public TicTacToeGame() {
    }

    /**
     * Die Methode erstellt 3 neue Objekte und gibt zwei Ausgaben
     * (Willkomensnachricht und welcher Spieler am Zug ist) aus
     */
    private void start() {
        spielFeld = new Spielfeld();
        sprache = new Sprachen();
        spielLogik = new Spiellogik(spielFeld, sprache);
        System.out.println(sprache.getText(0));
        System.out.println(sprache.getText(1));
    }

    /**
     * Fuehrt eine bestimmte Anzahl von Spielzuegen aus und wechselt die Sprache.
     */
    public void spielUnentschieden() {
        start();
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
     * Fuehrt eine bestimmte Anzahl von Spielzuegen aus und wechselt die Sprache.
     */
    public void spieler1Gewinnt() {
        start();
        spielLogik.feldSetzen("y2");
        spielLogik.feldSetzen("x3");
        spielLogik.feldSetzen("x15");
        spielLogik.feldSetzen("x1");
        spielLogik.feldSetzen("x1");
        sprache.wechsleSprache();
        spielLogik.feldSetzen("z3");
        spielLogik.feldSetzen("y3");
        spielLogik.feldSetzen("z1");
        spielLogik.feldSetzen("y1");
    }

    /**
     * Fuehrt eine bestimmte Anzahl von Spielzuegen aus und wechselt die Sprache.
     */
    public void spieler2Gewinnt() {
        start();
        spielLogik.feldSetzen("y2");
        sprache.wechsleSprache();
        spielLogik.feldSetzen("");
        spielLogik.feldSetzen("x1");
        spielLogik.feldSetzen("y1");
        spielLogik.feldSetzen("y3");
        sprache.wechsleSprache();
        spielLogik.feldSetzen("z1");
        spielLogik.feldSetzen("a45");
        spielLogik.feldSetzen("y3");
        spielLogik.feldSetzen("x3");
        spielLogik.feldSetzen("z2");
        spielLogik.feldSetzen("x2");
        //Zusaetliche Eingaben zur Demonstration der Logik nach Spielbeendung       
        spielLogik.feldSetzen("z3");
        spielLogik.feldSetzen("y3");
        spielLogik.feldSetzen("y3");
        spielLogik.feldSetzen("y3");
        spielLogik.feldSetzen("z3");
    }
}
