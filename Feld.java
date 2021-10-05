

public class Feld
{
    int wert;
    boolean spielerZug;
    
    public Feld(int wert)
    {
        wert=0;
    }


    public void feldSetzen()
    {
        if (spielerZug == false){
            wert = 1;
        }    else {
                wert = 2;
            }
         spielerZug=(!spielerZug);
    } 
}
