package segunda_generacion;

public interface Murcielago extends Mamifero {

    void volar();

   void domirEnUnPalo();

   default void comerfutas(){
        System.out.println("mmm deli..");
    }
}
