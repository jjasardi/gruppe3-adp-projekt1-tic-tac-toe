
/**
 * Beschreiben Sie hier die Klasse Ausgabe.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Ausgabe
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Sprachen sprache;

    /**
     * Konstruktor für Objekte der Klasse Ausgabe
     */
    public Ausgabe(){
        sprache= new Sprachen();
    }  

    public void spracheWechseln(){
        sprache.wechsleSprache();
    }
}
