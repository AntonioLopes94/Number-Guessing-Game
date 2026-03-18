import static java.lang.Integer.parseInt;

void main() {
  Spiellogik spiel = new Spiellogik();
  int menue = spiel.parseGueltigeZahl(IO.readln("""
          
          Du musst die geheime Zahl erraten. Du hast dafür einige 
          Versuche und bei jedem Versuch sage ich dir, ob deine Zahl 
          größer oder kleiner als die geheime Zahl ist.
           
          Wähle zuerst einen Schwierigkeitsgrad:
          | 1. Leicht -- 2. Mittel -- 3. Schwer -- 4. Unmöglich |
          """), 4);
    switch (menue) {
      case 1:
        IO.println("Du hast den leichten Schwierigkeitsgrad gewählt.");
        spiel.spielLogik(10,50);
        break;
      case 2:
        IO.println("Du hast den mittleren Schwierigkeitsgrad gewählt.");
        spiel.spielLogik(10,100);
        break;
      case 3:
        IO.println("Du hast den schweren Schwierigkeitsgrad gewählt.");
        spiel.spielLogik(5,100);
        break;
      case 4:
        IO.println("Du hast den unmöglichen Schwierigkeitsgrad gewählt.");
        spiel.spielLogik(1,100);
        break;
      default:
        IO.println("Ungültige Option");
    }
}
