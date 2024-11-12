abstract class KnjigaImpl implements Knjiga {
    private String naslov;
    private String autor;
    private int godinaIzdavanja;
    private int brojStranica;
    private String stanje;

    public KnjigaImpl(String naslov, String autor, int godinaIzdavanja, int brojStranica) {
        if (godinaIzdavanja >= 1900 && godinaIzdavanja <= 2024) {
            this.godinaIzdavanja = godinaIzdavanja;
        } else {
            this.godinaIzdavanja = 1900; // Postavi na minimalnu dozvoljenu godinu ako unos nije ispravan
        }

        // Broj stranica mora biti pozitivan broj
        if (brojStranica > 0) {
            this.brojStranica = brojStranica;
        } else {
            this.brojStranica = 1; // Postavi na minimalan broj stranica ako unos nije ispravan
        }

        this.naslov = naslov;
        this.autor = autor;
        this.stanje = "Dostupno";
    }

    @Override
    public String getNaslov() {
        return naslov;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public int getGodinaIzdavanja() {
        return godinaIzdavanja;
    }

    @Override
    public int getBrojStranica() {
        return brojStranica;
    }

    @Override
    public String getStanje() {
        return stanje;
    }

    @Override
    public void posudi() {
        if (stanje.equals("Dostupno")) {
            stanje = "Posuđeno";
        } else {
            System.out.println("Knjiga je već posuđena.");
        }
    }

    @Override
    public void vrati() {
        if (stanje.equals("Posuđeno")) {
            stanje = "Dostupno";
        } else {
            System.out.println("Knjiga je već dostupna.");
        }
    }
}