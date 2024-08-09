package javaapplication1;

/**
 *
 * @author Robo
 */
public class JavaApplication1 {

    public static void main(String[] args) {
        Monitor abc = new Monitor();
        abc.szerokosc = 124;
        
        System.out.println(abc.szerokosc);
        abc.Wlacz();
    }
    
}

class Monitor
{
    int szerokosc;
    int wysokosc;
    
    void Wlacz()
    {
    System.out.println("mały");
    }
    
}
