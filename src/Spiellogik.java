import static java.lang.Integer.parseInt;

public class Spiellogik {
    int versuche = 1;

    void spielLogik(int maxVersuche, int maxZahl){
        int zufallszahl = zufallszahlImBereich(maxZahl);

        int eingabe = parseGueltigeZahl(
                IO.readln("Gib eine Zahl zwischen 1 und " +
                        maxZahl + " ein, von der du glaubst, dass sie die geheime Zahl ist. " +
                        "\nDu hast "+ maxVersuche +" Versuche. \nViel Glück!\n"),
                maxZahl
        );
        while(versuche < maxVersuche){
            if(eingabe == -1){
             IO.println("Ungültiger Wert. Gib nur Zahlen zwischen 1 und "+ maxZahl + " ein.");
            }else if(eingabe == zufallszahl){
                IO.println("Glückwunsch! Du hast die Herausforderung in "+ versuche +" Versuchen geschafft.");
                break;
            }else if(eingabe > zufallszahl){
                IO.println("Deine Zahl ist größer als die geheime Zahl.");
                versuche++;
            }else {
                IO.println("Deine Zahl ist kleiner als die geheime Zahl.");
                versuche++;
            }
            eingabe = parseGueltigeZahl(IO.readln("\nVersuche es noch einmal. Du hast noch " +
                    ((maxVersuche+1)- versuche)+" Versuche.\n"),
                    maxZahl);

        }
        if(versuche == maxVersuche){
            IO.println("Dieses Mal hat es leider nicht geklappt. Die Zahl war: " + zufallszahl +
                    "\nStarte das Spiel erneut für einen neuen Versuch!");
        }
    }

    int parseGueltigeZahl(String eingabe, int max){
        try{
            var zahl = parseInt(eingabe);
            if(zahl >= 1 && zahl <= max){
                return zahl;
            }else{
            return -1;
            }
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    int zufallszahlImBereich(int max){
        return (int) (Math.random() * max + 1);
    }
}

