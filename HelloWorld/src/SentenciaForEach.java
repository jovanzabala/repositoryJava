public class SentenciaForEach {
    public static void main(String[] args) {

        int[] numeros = {1,3,5,7,9,11,13,15,17,19};
        for (int num: numeros
             ) {
            System.out.println("num = " + num);
        }
        String[] nombres = {"Jovan","Royman","Pepe","Paco","Juan","Lolo","Macho","Lucho","Ramon"};

        for (String nombre : nombres
             ) {
            System.out.println("nombre = " + nombre);
        }
    }
}
