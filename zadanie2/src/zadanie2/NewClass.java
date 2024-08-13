
package zadanie2;


public class NewClass {
    
    private int[] tablica;
    
    NewClass(int[] podajTablice){

        tablica = podajTablice;  
    }
    
    public int suma(){
        int suma = 0;
        for(int i = 0; i < tablica.length; i++)
        {
            suma += tablica[i];
        }
        return suma;
    }
    
    public double srednia(){
        int suma = 0;
        double sr = 0;
        int dlugosc = tablica.length;
        for(int i = 0; i < dlugosc ;i++){
            suma += tablica[i];
        }
        sr = suma / dlugosc;
        return sr;
    }
    
    public int min() {
        int liczba = Integer.MAX_VALUE;
        for(int i=0; i < tablica.length ;i++){
            if(i < liczba){
            liczba = i;
                    }
        }
        return liczba;
    }
}
    


    

