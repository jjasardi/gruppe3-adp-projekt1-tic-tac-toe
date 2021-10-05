
/**
 * Beschreiben Sie hier die Klasse Ausgabe.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Ausgabe
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Sprachumschaltung sprache;

    /**
     * Konstruktor für Objekte der Klasse Ausgabe
     */
    public Ausgabe()
    {   
       sprache = new Sprachumschaltung();
    }   

    
    public void spielfeldAusgeben(){
        if(sprache.gibSprache() == "DE") {
            System.out.println("Sprache: Deutsch");
        } else if (sprache.gibSprache() == "EN") {
            System.out.println("Language: English");
        }
    }
    
    public void spracheAendern() {
        sprache.wechsleSprache();
    }
}
