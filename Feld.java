

public class Feld
{
    int x1;
    int x2;
    int x3;
    int y1;
    int y2;
    int y3;
    int z1;
    int z2;
    int z3;
    boolean spielerZug;
    
    public Feld()
    {
        }


    public void x1()
    {
        if (spielerZug == false){
            x1 = 1;
        }    else {
                x1 = 2;
            }
         spielerZug=(!spielerZug);
    }
}
