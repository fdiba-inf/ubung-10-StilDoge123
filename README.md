# Übung 10
Quellcode der Vorlesung: https://github.com/fdiba-inf/vorlesung
## Repl.it öffnen
Bevor Sie die Taste _"Work in Repl.it"_ klicken, öffnen Sie https://repl.it/auth/github/get, um sicherzustellen, dass Sie in repl.it angemeldet sind.
## Aufgabe 0. Figur
Betrachten Sie die abstrakte Klasse _Figure_ im Paket _exercise10_. 
Die Klassen _Rectangle_ und _Ellipse_ im Paket _exercise10_ sollen Unterklassen dieser Klasse (Oberklasse) sein. 
Die abstrakte Klasse definiert die Behandlung von geometrischen Objekten. 
Sie beinhaltet die gemeinsamen Attribute und Methoden der Unterklassen.
Wenn eine Methode als abstract definiert ist, soll jede Unterklasse diese Methode implementieren.

Betrachten Sie die Schnittstelle (Interface) _ClickListener_ im Paket _exercise10_. 
Dort werden Methoden definiert (_containsClick(...)_), die z.B. bei der Bearbeitung von geometrischen Objekten in einer Desktop-Applikation verwendet werden können. 
Die abstrakte Klasse _Figure_ implementiert die neue Schnittstelle und soll eine Implementation der vererbten Methode enthalten, 
aber weil sie abstrakt ist, wird diese Anforderung zu ihrer Unterklassen übertragen.

Betrachten Sie die Klasse _Rectangle_. Sie is schon eine Unterklasse der _Figure_ Oberklasse.
## Aufgabe 1. Ellipse
Ändern Sie die Klasse _Ellipse_. Sie soll auch eine Unterklasse der Oberklasse _Figure_ sein.
* Definieren Sie die Klassen als Unterklassen der _Figure_ Oberklasse (_extends_).
* Löschen Sie die Attribute. Sie werden von der Oberklasse vererbt.
* In jedem Konstruktor soll der Konstruktor der Oberklasse aufgerufen werden (_super(...)_).
* Löschen Sie die Methoden _isValid()_, _initialize()_ und _toString()_. Sie werden von der Oberklasse vererbt.
* Die Methode _equal(...)_ soll schon einen Parameter vom Typ _Figure_ bekommen.
* Annotieren Sie alle überschriebene Methoden mit der _@Override_ Annotation.

Erwartete Ausgabe der Klasse _EllipseDemo_:
``` 
Start point: 
Enter x: 1
Enter y: 2
Enter side 1: 3
Enter side 2: 4
1. Ellipse: (0.0, 0.0)-[1.0, 1.0], Circle, P=6.283185307179586, A=3.141592653589793
2. Ellipse: (2.0, 3.0)-[5.0, 6.0], Ellipse, P=34.628955940751425, A=94.24777960769379
3. Ellipse: (2.0, 3.0)-[5.0, 6.0], Ellipse, P=34.628955940751425, A=94.24777960769379
4. Ellipse: (1.0, 2.0)-[3.0, 4.0], Ellipse, P=22.103491790916742, A=37.69911184307752
2. equals 1.: false
2. equals 3.: true
``` 
## Aufgabe 2. Bearbeitung von Klick Ereignisse
Implementieren sie die Methode _containsClick(...)_ in der Unterklassen. Sie soll überprüfen, ob die Koordinaten eines Punktes _(x, y)_ sich im Rahmen eines Objekts befinden:
* _Rectangle_ - Ein Klickpunkt _(x, y)_ befindet sich in einem Rechteck, wenn _x_ im Bereich _[Anfangspunkt x, Anfangspunkt x + Breite]_ ist und _y_ im Bereich _[Anfangspunkt y, Anfangspunkt y + Höhe]_ ist.
* _Ellipse_ - Ein Klickpunkt _(x, y)_ befindet sich in einer Ellipse mit einem Center _(xce, yce)_, wenn:

<img src="https://github.com/fdiba-inf/vorlesung/blob/main/images/exercise10/ellipse-click.png" width="250">

Erwartete Ausgabe der Klasse _ClickDemo_:
``` 
Start point: 
Enter x: 1
Enter y: 1
Enter side 1: 4
Enter side 2: 5
Start point: 
Enter x: 1
Enter y: 1
Enter side 1: 2
Enter side 2: 3
Enter x: 2
Enter y: 2
ClickListener 0 contains click point: true
ClickListener 1 contains click point: true
``` 
## Achtung! Achtung! Achtung!
Wenn Sie alle Aufgaben gemacht haben, sollen Sie die Lösungen in _GitHub_ hochladen. 
Wenn "Version Control" nicht verfügbar ist, geben Sie die folgenden Befehle in die Konsole ein:
``` 
git pull
git add .
git commit -m "Some message"
git push
``` 
