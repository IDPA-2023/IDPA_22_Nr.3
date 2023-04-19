# Spezifikation
> Unser Projekt stellt einen Notenrechner für Schüler dar, worin man seine Noten einträgt und somit seinen Promotionsstand ermitteln kann.
Basierend auf dem KBW Notenrechner.

## Use Case
![usecase_notenrechner](https://user-images.githubusercontent.com/46267818/222086897-5c27f232-a7a4-4b2b-8fce-56d42a5fff9b.png)

Der Schüler kann seine **Noten eingeben**, seinen **Notenschnitt berechnen** und somit eine **Prognose erstellen** lassen. Weiter gibt es Features wie **Fächer hinzufügen** oder ein **Diagram**, welches die **Entwicklung des Schnitts über die Zeit anzeigt**. Wenn es sich um eine Web Applikation handelt wird ebenfalls eine **Authentifizierung** sichergestellt.

## Test
Nr | Input | Output | erfüllt
---| ---| ---| ---
1 | Es werden mehr als 2 neg. Noten eingetragen, weniger als einen 4er Schnitt und mehr als zwei Tiefpunkte erreicht. | Promotionsstand negativ (sonst positiv) | ✔️
2 | Noten werden eingetragen | Notenschnitt sowie Promotionsstand wird angegeben. | ✔️
3 | Noten werden mittels .csv Datei importiert | Noten werden automatisch eingetragen. (vgl. Test Nr 1) | ✔️
4 | Noten werden exportiert | Der Anwender erhält ein PDF/PNG mit den Noten, -schnitte und Promotionsentscheide. | ✔️
5 | Fach wird hinzugefügt | Es können Noten für das neu hinzugefügte Fach eingetragen werden und sie werden im Promotionsstand berücksichtigt. | ❌
6 | Entwicklung (Notenschnitt/Zeit) anzeigen | Ein Diagram wird gezeigt, das die Entwicklung des Schnitts über die Zeit anzeigt. | ✔️
7 | Bei Aufrufen des Programs wird eine Authentifizierung verlangt | Man kann sich nur mit gültigen Anmeldedaten authentifizieren oder evtl. neu registrieren. | ❌

Vermerkung zu Nummer 5 und 7: Aufgrund von Zeitdruck haben wir unsere Prioritäten auf die anderen (Haupt-)Funktionen gelegt.
