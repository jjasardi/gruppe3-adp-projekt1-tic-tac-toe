public class Spielfeld
{
    private boolean spielerZug;
    
    public Spielfeld(){
        x1=new Feld(0,0);
    }
   
    public void setFeld(){
        
    }
    
    public void feldSetzen(int feld)
    {   
        if (spielerZug == false){
            feld= 1;
        }    else {
                feld= 2;
            }
         spielerZug=(!spielerZug);
        }
        
        public void main() {   
        System.out.println(x1+", "+x2+", "+x3);
        System.out.println(y1+", "+y2+", "+y3);
        System.out.println(z1+", "+z2+", "+z3);
        System.out.println("_________________");
    }    
}

