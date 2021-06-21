package vampiro;

public class Vampiro {
    private String nombre;
    private int edad;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }




    public void morder() {
        System.out.println("Lleve lo suyo..");
    }


      public void chuparSangre() {
        System.out.println("Que sangre tan rinca..");
    }

    protected void aguantarSol() {
        System.out.println("No asara pa'..");
    }

    public Vampiro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
