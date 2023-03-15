import java.util.Scanner;

public class operadorTernario {
    public static void main(String[] args) {
        //variable = condicion? si es verdadero : si es falso;
        String variable = 7 == 70/10 ? "es verdadero" : "es falso";
        System.out.println(variable);

        String  estado = "";
        double promedio = 3.6;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la nota de matematica entre 2.0 - 7.0");
        matematicas = s.nextDouble();
        System.out.println("Ingrese la nota de ciencias entre 2.0 - 7.0");
        ciencias = s.nextDouble();
        System.out.println("Ingrese la nota de historia entre 2.0 - 7.0");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.00 ? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado);

        /*if (promedio <= 5.49){
            estado = "Aprobado";
        } else {
            estado ="Rechazado";
        }
        System.out.println(estado);*/
    }
}
