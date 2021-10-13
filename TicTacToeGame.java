
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
    private Sprachen sprachen;

    public TicTacToeGame(){
        start();
    }

    private void start(){
        spielFeld = new Spielfeld();
        spielLogik = new Spiellogik(spielFeld);
        sprachen = new Sprachen();

        System.out.println(sprachen.getText(0));
        //gameloop start
        while(!spielLogik.spielUnentschieden() && !spielLogik.spielGewonnen()){
            spracheWechseln();
            spielDarstellung();
            spielLogik.feldSetzen("x1");
        }
    }

    public void feldtest(String feldId){
        // if (spiellogik.feldSetzen(feldId)== 0){
        // if (spiellogik.getActuellerSpieler() == false){ //wird später in andere methode verlegt
        // System.out.println(sprachen.getText(1)); //wird später in andere methode verlegt
        // }else System.out.println(sprachen.getText(2)); //wird später in andere methode verlegt
        // } else if (spiellogik.feldSetzen(feldId)== 1){
        // System.out.println(sprachen.getText(8));
        // } else if (spiellogik.feldSetzen(feldId)== 2){
        // System.out.println(sprachen.getText(7));
        // } else System.out.println ("bla");
    }

    public void spielDarstellung()
    {
        spielFeld.spielDarstellung();
    }

    public void spracheWechseln(){
        sprachen.wechsleSprache();
    }
}
