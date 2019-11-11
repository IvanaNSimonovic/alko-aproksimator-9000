Aproksimator alkohola
Gosti kafane “Začarani Krug” vole da uživaju u dobrom druženju i zaborave na svoje brige. Nažalost, to često povlači i da zaborave koliko je opasno i kažnjivo voziti u pijanom stanju. Napravite program koji će podsetiti nama drage goste i naterati ih da dobro porazmisle pre sedanja za volan.

Formula za račun:
BAC: Blood Alcohol Content = Alcohol(ml) / (BodyMass(g) * r)
r - korektivni faktor pola (M: 0.68, Ž: 0.55)

Program najpre traži unos težine i pola gosta jer su ti podaci neophodni za sračunavanje formule. Nakon toga traži listu popijenog pića.
Pošto broj popijenog pića nije poznat unapred, program pruža opciju unosa specijalnog terminalnog broja -1 za izlaz iz režima upisa.
Takođe, pruža mogućnost korisniku da ukoliko je popio neko piće koje nije u tabeli unese specijalni id broj 0 i potom unese podatke o
sadrzaju alkohola i količini. Ukoliko je korisnik pogrešio pri unosu ispisati mu grešku: Greška, željeni id nije u bazi
podataka. Pokušajte ponovo , i omogućiti mu da ponovo unese kod. Na kraju, ispisati korisniku njegov BAC i propratne informacije
shodno broju. Ukoliko ima kažnjiv iznos, napišite korisniku: Uzmite autobus!

Izgled ispisa programa (obojen tekst u zagradi predstavlja tip kornisckog unosa, tekst u uglastoj zagradi opcioni unos):
Dobrodošli u alko aproksimator 9000!
Unesite vašu težinu (kg): (double)
Unesite vaš pol (M:0/Ž:1): (int)
Šta ste i koliko popili (id_pica kolicina_u_ml):
(int)[(double)](double) ...

Primer unosa: Nastavak ispisa:

75.6
0
1 100
0 5.7 500
3 500
-1

(75.6kg, muškarac, rakija 100ml, nepoznato 5.7% 500ml, pivo
500ml)

----------------------------------
BAC: 1.98 - Teška alkoholisanost
----------------------------------
Kazna: 100.000-120.000din
Kazneni poeni: 14
Zabrana vožnje: 8 meseci
----------------------------------
Uzmite autobus!

Primer unosa: Nastavak ispisa:

73.2
1
4 120
2 40
-1

(73.2kg, žena, vino 120ml, vinjak 40ml)

----------------------------------
BAC: 0.73 - Srednja alkoholisanost
----------------------------------
Kazna: 10.000-20.000din
Kazneni poeni: 6
Zabrana vožnje: 3 meseca
----------------------------------
Uzmite autobus!

Sugestije:
Obratiti pažnju na jedinice. BAC u formuli zahteve grame za BodyMass, a tablica promila izneta je u mg/ml (pomnozite sa 1000).
Modifikacija za radoznale:
Ova formula ne uključuje dodatne faktore poput proteklog vremena. Istražiti kako bi izgledala potpunija implementacija.
