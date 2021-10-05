
/**
 * Beschreiben Sie hier die Klasse Sprachumschaltung.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Sprachumschaltung
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String sprache;

    /**
     * Konstruktor für Objekte der Klasse Sprachumschaltung
     */
    public Sprachumschaltung()
    {
        sprache = "DE";
    }

    public String gibSprache(){
        return sprache;
    }
    
    public void wechsleSprache(){
        if(sprache == "DE") {
            sprache = "EN";
        } else {
            sprache = "DE";
        }
    }
}
