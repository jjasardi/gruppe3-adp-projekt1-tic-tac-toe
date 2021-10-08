
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
        
    }
    
    public void feldtest(String feldId){
        spiellogik.feldSetzen(feldId);
    }
}
