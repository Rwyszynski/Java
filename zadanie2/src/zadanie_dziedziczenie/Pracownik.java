
package zadanie_dziedziczenie;

public class Pracownik extends Osoba
{
    protected String stanowisko;
    protected String nazwaFirmy;
    
    Pracownik(String imie, String nazwisko, String stanowisko, String nazwaFirmy){
    super(imie, nazwisko);
    this.stanowisko = stanowisko;
    this.nazwaFirmy = nazwaFirmy;
    }
    
    @Override
    void przedstawSie(){
        System.out.println("Jestem" + imie + nazwisko + "i pracuje w firmie" + nazwaFirmy + "na stanowisku" + stanowisko);
    }
}
