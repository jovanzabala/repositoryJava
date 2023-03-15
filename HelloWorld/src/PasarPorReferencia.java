public class PasarPorReferencia {
    public static void main(String[] args) {
        
        int[] edad = {10, 11, 12};

        System.out.println("iniciamos el metodo main ");
        for (int i = 0; i < edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("antes del metodo test");
        test(edad);
        System.out.println("despues del metodo test");
        for (int i = 0; i < edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Finaliza el, metodo main con los datos del arreglo modificados! " );

    }

    public static void test(int[] edadArr){
        System.out.println("iniciamos el metodo test con i = " );
        for (int i = 0; i < edadArr.length; i++){
            edadArr[i] = edadArr[i] +20;
        }
        System.out.println("Finaliza el, metodo test con i = ");
    }
}
