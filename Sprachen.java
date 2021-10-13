import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Sprachen.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Sprachen
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String sprache;
    private ArrayList<String> deText;
    private ArrayList<String> enText;

    /**
     * Konstruktor für Objekte der Klasse Sprachen
     */
    public Sprachen()
    {
        sprache = "DE"; // Standard auf Deutsch
        deText = new ArrayList<>();
        enText = new ArrayList<>();
        setArrayLists();        
    }

    public void wechsleSprache(){
        if(sprache == "DE") {
            sprache = "EN";
        } else {
            sprache = "DE";
        }
        System.out.println(getText(6));
    }

    public String getText(int textIndex){
        String text = null;
        if (sprache == "DE"){
            text = deText.get(textIndex);
        } else if (sprache == "EN"){
            text = enText.get(textIndex);
        }

        return text;
    }

    private void setArrayLists(){
        deText.add(0, "Willkommen beim Spiel Tic-Tac-Toe von der Gruppe 3. \n" +
            "Sie können jederzeit die Sprache auf Englisch ändern mit: 'wechsleSprache.'\n" +
            "\n" +
            "Einleitung: \n" +
            "\n" +
            "x1 | x2 | x3 \n" +
            "---------- \n" +
            "y1 | y2 | y3 \n" +
            "---------- \n" +
            "z1 | z2 | z3 \n" +
            "\n" +
            "Sind die Koordinaten für die Eingabe wo sie ihren 'Stein' setzen wollen." +
            "\n" +
            "Spieler 1 setzt eine 1 in Spielfeld, \n" +
            "Spieler 2 setzt eine 2. \n" +
            "\n" +
            "Viel Spass beim Spielen!");
        deText.add(1, "Spieler 1 ist am Zug.");
        deText.add(2, "Spieler 2 ist am Zug.");
        deText.add(3, "Spieler 1 hat gewonnen, Gratulation!");
        deText.add(4, "Spieler 2 hat gewonnen, Gratulation!");
        deText.add(5, "Unentschieden!");
        deText.add(6, "Sie haben erfolgreich die Sprache auf Deutsch gewechselt.");
        deText.add(7, "Das ist keine gültige Eingabe für die Koordinaten.");
        deText.add(8, "Feld ist schon besetzt wählen Sie ein anderes.");

        enText.add(0, "Welcome to the game tic-tac-toe from group 3. \n" +
            "You can change the language to German at any time with: 'wechsleSprache.'\n" +
            "\n" +
            "Introduction: \n" +
            "\n" +
            "x1 | x2 | x3 \n" +
            "---------- \n" +
            "y1 | y2 | y3 \n" +
            "---------- \n" +
            "z1 | z2 | z3 \n" +
            "\n" +
            "Are the coordinates for the input where you want to put your 'stone'" +
            "\n" +
            "Player 1 places a 1 on the field, \n" +
            "Player 2 places a 2. \n" +
            "\n" +
            "Have fun playing!");
        enText.add(1, "It is player 1's turn.");
        enText.add(2, "It is player 2's turn.");
        enText.add(3, "Player 1 won, congratulations!");
        enText.add(4, "Player 2 won, congratulations!");
        enText.add(5, "Draw!");
        enText.add(6, "You have successfully changed the language to English.");
        enText.add(7, "This is not a valid entry for the coordinates.");
        enText.add(8, "Field is already occupied select another one.");
    }
}
