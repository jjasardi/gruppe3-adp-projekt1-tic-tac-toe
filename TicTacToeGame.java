
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
    private Sprachen sprachen;
    
    public TicTacToeGame(){
        start();
    }
    
    private void start(){
        spielfeld = new Spielfeld();
        spiellogik = new Spiellogik(spielfeld);
        sprachen = new Sprachen();
        //gameloop start
        System.out.println(sprachen.getText(0));
        
    }
    
    public void feldtest(String feldId){
        if (spiellogik.feldSetzen(feldId)== 0){
            if (spiellogik.getActuellerSpieler() == false){ //wird später in andere methode verlegt
                System.out.println(sprachen.getText(1)); //wird später in andere methode verlegt
            }else System.out.println(sprachen.getText(2)); //wird später in andere methode verlegt
        } else if (spiellogik.feldSetzen(feldId)== 1){
            System.out.println(sprachen.getText(8));
        } else if (spiellogik.feldSetzen(feldId)== 2){
            System.out.println(sprachen.getText(7));
        } else System.out.println ("bla");
    }

    public void spielDarstellung()
    {
        spielfeld.spielDarstellung();
    }

    public void spracheWechseln(){
        sprachen.wechsleSprache();
    }
}
