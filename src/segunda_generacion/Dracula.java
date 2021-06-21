package segunda_generacion;

import vampiro.Vampiro;

import java.sql.SQLOutput;

public class Dracula extends Vampiro implements Murcielago, Constantes {
    private int talla;

    public Dracula(String nombre, int edad) {
        super(nombre, edad);
    }

    void hipnotizar() {
        System.out.println("Venga q' no es pa' eso..");
    }

    public static void main(String[] args) {
        Dracula obj1 = new Dracula("Vladimie", 200);
        obj1.setNombre("Vladimir");
        obj1.setEdad(600);
        obj1.morder();
        obj1.chuparSangre();
        obj1.aguantarSol();
        obj1.hipnotizar();
        obj1.comerfutas();

        Vampiro obj2 = new Vampiro("Otto", 144);
        //obj2.setNombre("Otto");
        obj2.morder();
        obj2.chuparSangre();
        //obj2.aguantarSol();
      if (DIA){
          System.out.println(ERROR);
      }


    }//end main

    /*public Dracula(String nombre, int edad, int talla) {
        super(nombre, edad);
        this.talla = talla;
    }*/

        @Override
        public void volar () {
            System.out.println("Volando con ecolocalización.."
                    + "Mero lujo pa'..");
        }

        @Override
        public void domirEnUnPalo () {
            //no lo usaré
        }


    @Override
    public void amamantar() {

    }
}


