
/**
 * Beschreiben Sie hier die Klasse TicTacToeGame.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class TicTacToeGame
{
    private Spiellogik spielLogik;
    private Spielfeld spielFeld;
    private Sprachen sprache;

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
}
