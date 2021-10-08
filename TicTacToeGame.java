
/**
 * Beschreiben Sie hier die Klasse TicTacToeGame.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class TicTacToeGame
{
    private Spiellogik spiellogik;
    
    public TicTacToeGame(){
        start();
    }
    
    private void start(){
        Spielfeld spielfeld = new Spielfeld();
        spiellogik = new Spiellogik(spielfeld);
        Ausgabe ausgabe = new Ausgabe();
        ausgabe.printWelcomeText();
    }
    
    public void feldSetzen(String feld){
        spiellogik.feldStezen(feld);
    }
}
