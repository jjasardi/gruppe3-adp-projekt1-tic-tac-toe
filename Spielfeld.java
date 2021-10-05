public class Spielfeld
{
    private boolean spielerZug;
    private Feld x1;
    private Feld x2;
    private Feld x3;
    private Feld y1;
    private Feld y2;
    private Feld y3;
    private Feld z1;
    private Feld z2;
    private Feld z3;
    
    public Spielfeld(){
        spielerZug=false;
        x1=new Feld();
        x3=new Feld(0,2);
        y1=new Feld(1,0);
        y2=new Feld(1,1);
        y3=new Feld(1,2);
        z1=new Feld(2,0);
        z2=new Feld(2,1);
        z3=new Feld(2,2);
    }
   
    public void setFeld(){
        
    }
    
    public void getFeld(){
    
    }
    
    public void feldSetzen(int feldGesetzt)
    {   
        if (spielerZug == false){
            feldGesetzt= 1;
        }    else {
                feldGesetzt= 2;
            }
         spielerZug=(!spielerZug);
        }
    
    public void druck() {   
        System.out.println(x1+", "+x2+", "+x3);
        System.out.println(y1+", "+y2+", "+y3);
        System.out.println(z1+", "+z2+", "+z3);
        System.out.println(spielerZug+"_________________");
    }    
}

