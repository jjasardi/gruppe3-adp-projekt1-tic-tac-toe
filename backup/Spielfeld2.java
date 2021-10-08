public class Spielfeld
{
    private boolean spielerZug;
    private int x1;
    private int x2;
    private int x3;
    private int y1;
    private int y2;
    private int y3;
    private int z1;
    private int z2;
    private int z3;
    
    public Spielfeld(){
        spielerZug=false;
        x1=0;
        x2=0;
        x3=0;
        y1=0;
        y2=0;
        y3=0;
        z1=0;
        z2=0;
        z3=0;
    }
    
    public void feldSetzen(String welchesFeld)
    {   
        if(welchesFeld == "x1") {
            if (spielerZug == false) {
                x1= 1;
            } else {
                x1= 2;
            }
        } else if (welchesFeld == "x2") {
            if (spielerZug == false) {
                x2= 1;
            } else {
                x2= 2;
            }
        } else if (welchesFeld == "x3") {
            if (spielerZug == false) {
                x3= 1;
            } else {
                x3= 2;
            }
        } else if (welchesFeld == "y1") {
            if (spielerZug == false) {
                y1= 1;
            } else {
                y1= 2;
            }
        } else if (welchesFeld == "y2") {
            if (spielerZug == false) {
                y2= 1;
            } else {
                y2= 2;
            }
        } else if (welchesFeld == "y3") {
            if (spielerZug == false) {
                y3= 1;
            } else {
                y3= 2;
            }
        } else if (welchesFeld == "z1") {
            if (spielerZug == false) {
                z1= 1;
            } else {
                z1= 2;
            }
        } else if (welchesFeld == "z2") {
            if (spielerZug == false) {
                z2= 1;
            } else {
                z2= 2;
            }
        } else if (welchesFeld == "z3") {
            if (spielerZug == false) {
                z3= 1;
            } else {
                z3= 2;
            }
        } 
       spielerZug=(!spielerZug);
    }
    
    public void druck() {   
        System.out.println(x1+", "+x2+", "+x3);
        System.out.println(y1+", "+y2+", "+y3);
        System.out.println(z1+", "+z2+", "+z3);
        System.out.println("_________________");
    }    
}