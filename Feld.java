/**
 * Die Klasse Feld bietet die Methoden zum bearbeiten der fundamentalen Spielelemente.
 * 
 * @author sadikdur, jasard, schieph1
 * @version 1
 */

public class Feld
{
    private int zustand;

    /**
     * Konstruktor setzt zustand auf 0.
     */
    public Feld()
    {
        zustand=0;
    }

    /**
     * Die Methode getzustand() holt den zustand für übergordnete Klassen.
     * @return zustand als int
     */
    public int getZustand()
    {
        return zustand;
    }

    /**
     * Die Methode setZustand() verändert den int zustand.
     * 
     * @param zustand Vorgesehen ist 0, 1 oder 2. Andere zustande werden mit übergeordneten Methoden ausgefiltert.
     */
    public void setZustand(int zustand)
    {
        this.zustand = zustand;
    }
}
