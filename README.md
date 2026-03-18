# Zahlenspiel / Number Guessing Game

Ein einfaches CLI-Spiel in Java, bei dem der Spieler eine geheime Zahl erraten muss.

Dieses Projekt wurde als Übung basierend auf dem Challenge **Number Guessing Game** von roadmap.sh erstellt.

## Über das Projekt

Das Programm wählt zufällig eine geheime Zahl aus und der Spieler muss versuchen, sie innerhalb einer begrenzten Anzahl von Versuchen zu erraten.

Je nach gewähltem Schwierigkeitsgrad hat der Spieler unterschiedlich viele Versuche. Nach jeder Eingabe gibt das Spiel einen Hinweis, ob die eingegebene Zahl **größer** oder **kleiner** als die geheime Zahl ist.

## Funktionen

- Konsolenbasiertes Spiel
- Zufällige Generierung einer geheimen Zahl
- Mehrere Schwierigkeitsgrade
- Eingabevalidierung
- Hinweise nach jedem Versuch
- Gewinn- und Verlustbedingung

## Schwierigkeitsgrade

Das Spiel enthält aktuell vier Schwierigkeitsgrade:

- **Leicht** → 10 Versuche, Zahlenbereich von 1 bis 50
- **Mittel** → 10 Versuche, Zahlenbereich von 1 bis 100
- **Schwer** → 5 Versuche, Zahlenbereich von 1 bis 100
- **Unmöglich** → 1 Versuch, Zahlenbereich von 1 bis 100

## Projektstruktur

```text
.
├── Main.java
└── Spiellogik.java


https://roadmap.sh/projects/number-guessing-game
