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
        x1= new Feld(0);
        x2= new Feld(0);
        }
   
    public void x1(){
        x1.feldSetzen();
        spielerZug=(!spielerZug);
    }
    
    public void getFeld(){
    
    }
        
    public void druck() {   
        System.out.println(x1+", "+x2+", "+x3);
        System.out.println(y1+", "+y2+", "+y3);
        System.out.println(z1+", "+z2+", "+z3);
        System.out.println(spielerZug+"_________________");
    }    
}

