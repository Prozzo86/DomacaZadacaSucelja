/*

Definicija interface Knjiga s metodama:
getNaslov(): vraća naslov knjige
getAutor(): vraća autora knjige
getGodinaIzdavanja(): vraća godinu izdavanja knjige
getBrojStranica(): vraća broj stranica knjige
getStanje(): vraća stanje knjige (npr. "Dostupno" ili "Posuđeno")
posudi(): označava knjigu kao posuđenu
vrati(): označava knjigu kao dostupnu
Implementacija klase Roman i Strip koje implementiraju interface Knjiga

Zahtjevi:
Upotrijebite interface Knjiga za definiranje zajedničkih metoda
Implementirajte klase Roman i Strip koje će sadržavati privatne varijable za naslov, autora, godinu izdavanja, broj stranica i stanje knjige
Provjerite valjanost unosa godine izdavanja (trebala bi biti između 1900 i trenutne godine)
Provjerite valjanost unosa broja stranica (trebao bi biti pozitivan broj)
Implementirajte metode posudi() i vrati() tako da ažuriraju stanje knjige
Unutar main klase ne morate nista raditi, bitno je da su sve ove metode napisane u klasama i interfaceu.
DODATNO: napraviti abstract klasu knjiga i implementirati u zadatak prema pravilima onako kako smo radili na predavanju.


*/

public class Main {
    public static void main(String[] args) {
        Roman roman = new Roman("Rat i mir", "Lav Tolstoj", 1869, 1225);
        Strip strip = new Strip("Spider-Man", "Stan Lee", 1962, 32);

        System.out.println("Roman naslov: " + roman.getNaslov() + ", Stanje: " + roman.getStanje());
        roman.posudi();
        System.out.println("Roman naslov nakon posudbe: " + roman.getNaslov() + ", Stanje: " + roman.getStanje());

        System.out.println("Strip naslov: " + strip.getNaslov() + ", Stanje: " + strip.getStanje());
        strip.vrati();
    }
}