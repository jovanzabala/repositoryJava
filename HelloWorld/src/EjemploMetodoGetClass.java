import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        String texto = "Hola que tal!";

        Class strClass = texto.getClass();

        System.out.println("strClass.gatName() = " + strClass.getName());
        System.out.println("strClass.gatName() = " + strClass.getSimpleName());
        System.out.println("strClass.gatName() = " + strClass.getPackageName());
        System.out.println("strClass.gatName() = " + strClass);
        
        for (Method metodo: strClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }
        Integer num =34;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass());
        System.out.println("intClass.getSuperclass().getSuperclass() = " + objClass);

        for (Method metodo: objClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }

    }
}
