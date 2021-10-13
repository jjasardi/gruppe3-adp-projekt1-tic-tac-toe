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

    public void setWert(int wert)
    {
        this.wert = wert;
    }

    public boolean istFrei()
    {
        if (wert == 0){
            return true;
        } else return false;
    }
}
