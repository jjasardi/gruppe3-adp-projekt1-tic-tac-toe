/**
 * Die Klasse Feld bietet die Methoden zum bearbeiten der fundamentalen Spielelemente.
 * 
 * @author sadikdur, jasard, schieph1
 * @version 1
 */

public class Feld
{
    private int wert;

    /**
     * Konstruktor setzt wert auf 0.
     */
    public Feld()
    {
        wert=0;
    }

    /**
     * Die Methode getWert() holt den wert für übergordnete Klassen.
     * @return wert als int
     */
    public int getWert()
    {
        return wert;
    }

    /**
     * Die Methode setWert() verändert den int wert.
     * 
     * @param wert Vorgesehen ist 0, 1 oder 2. Andere Werte werden mit übergeordneten Methoden ausgefiltert.
     */
    public void setWert(int wert)
    {
        this.wert = wert;
    }
}
