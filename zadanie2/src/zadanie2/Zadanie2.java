
package zadanie2;
import zadanie2.NewClass;
public class Zadanie2 {


    public static void main(String[] args) {
        
        int[] tablica = {3, 4, 5, 4, 20, 300};
        
        NewClass drugi = new NewClass(tablica);
        System.out.println(drugi.min());
        
    }
    
}
