
/**
 * Beschreiben Sie hier die Klasse TicTacToeGame.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class TicTacToeGame
{
    private Spiellogik spiellogik;
    private Spielfeld spielfeld;
    
    public TicTacToeGame(){
        start();
    }
    
    private void start(){
        spielfeld = new Spielfeld();
        spiellogik = new Spiellogik(spielfeld);
        spielDarstellung();
        
    }
    
    public void feldtest(String feldId){
        spiellogik.feldSetzen(feldId);
    }

    public void spielDarstellung()
    {
        spielfeld.spielDarstellung();
    }
}
