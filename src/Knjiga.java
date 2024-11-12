public interface Knjiga {
    String getNaslov();
    String getAutor();
    int getGodinaIzdavanja();
    int getBrojStranica();
    String getStanje();
    void posudi();
    void vrati();
}
