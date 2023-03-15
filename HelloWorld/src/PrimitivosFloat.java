public class PrimitivosFloat {
    public static void main(String[] args) {
        float realFloat = 1.5e-10f;//2120.0f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a = " + Float.BYTES);
        System.out.println("float corresponde en bites a = " + Float.SIZE);
        System.out.println("maximo valor para float = " + Float.MAX_VALUE);
        System.out.println("minimo valor para float = " + Float.MIN_VALUE);


        double realDouble = 1.7976931348623157E308;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a = " + Double.BYTES);
        System.out.println("double corresponde en bites a = " + Double.SIZE);
        System.out.println("maximo valor para double = " + Double.MAX_VALUE);
        System.out.println("minimo valor para double = " + Double.MIN_VALUE);

        var varFlotante = 3.1416;
        System.out.println("varFlotante = " + varFlotante);
    }
}
