class Persona{
    private String nombre;
    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public String leerNombre(){
        return this.nombre;
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.modificarNombre("Abel");

        System.out.println("iniciamos el metodo main ");

        System.out.println("persona. = " + persona.leerNombre());
        System.out.println("despues del metodo test");

        test(persona);
        System.out.println("persona.Nombre = " + persona.leerNombre());

        System.out.println("Finaliza el, metodo main con los datos del arreglo modificados! " );

    }

    public static void test(Persona persona){
        System.out.println("iniciamos el metodo test  " );
        persona.modificarNombre("Pepe");
        System.out.println("Finaliza el, metodo test  ");
    }
}
