public class Eingabe
{
    private boolean spielerZug;

    public Eingabe()
    {
        spielerZug = false;
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