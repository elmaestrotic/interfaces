package vampiro;

import segunda_generacion.Dracula;
import segunda_generacion.Mamifero;

public class Main {
    public static void main(String[] args) {
        Vampiro v = new Vampiro("Alexander",200);

        v.morder();
        v.chuparSangre();
        v.aguantarSol();

        Dracula v2= new Dracula("Oto",100);
        v2.aguantarSol();
        v2.volar();

        Mamifero.hacerChichi();

    }
}
