
/**
 * Beschreiben Sie hier die Klasse Feld.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Feld
{
    int x;
    int y;

    public Feld(int x,int y)
    {
        x=0;
        y=0;
        }


    public void feldSetzen(int feld)
    {
        if (spielerZug == false){
            feld = 1;
        }    else {
                feld = 2;
            }
         spielerZug=(!spielerZug);
    }
}
