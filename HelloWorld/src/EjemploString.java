public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");

        boolean esIgual = curso == curso2;//se esta comparando el objeto no el valor
        System.out.println("curso == curso2 = " + esIgual);//Para comparar por Valor el boolean es falso

        //Debemos usar el método equal para comparar valores
        esIgual = curso.equals(curso2); // Si usamos el método equalsIgnoreCase ignora mayusculas y minusculas pero no caracteres especiales
        System.out.println("curso.equals(curso2) = " + esIgual);

        String curso3 = "Programación Java";
        esIgual = curso == curso3; //aqui solo asigna la referencia pero en distinta variable Rara vez se comparan las instancias casi siempre usamos equals
        System.out.println("curso == curso3 = " + esIgual);
    }
}
