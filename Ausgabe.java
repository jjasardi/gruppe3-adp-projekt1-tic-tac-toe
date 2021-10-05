
/**
 * Beschreiben Sie hier die Klasse Ausgabe.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Ausgabe
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String sprache;
    

    /**
     * Konstruktor für Objekte der Klasse Ausgabe
     */
    public Ausgabe(Sprachumschaltung sprache)
    {   
       this.sprache = sprache.gibSprache();
    }   

    
    public void spielfeldAusgeben(){
        if(sprache == "DE") {
            System.out.println("Sprache: Deutsch");
        } else if (sprache == "EN") {
            System.out.println("Language: English");
        }
    }
    public void spielerZug(){}

}
