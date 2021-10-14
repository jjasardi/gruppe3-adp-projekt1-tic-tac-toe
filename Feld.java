/**
 * Die Klasse Feld bietet die Methoden zum bearbeiten der fundamentalen Spielelemente.
 * 
 * @author sadikdur 
 * @version 1
 */

public class Feld
{
    private int wert;

    public Feld()
    {
        wert=0;
    }

    public int getWert()
    {
        return wert;
    }

    /**
     * 
     * 
     * @param   wert    
     */

    public void setWert(int wert)
    {
        this.wert = wert;
    }
}
