public class SentenciaFor {
    public static void main(String[] args) {
        /*int i = 0 ;
        for ( ; ;){
            if (i >= 5){
                break;
            }
            System.out.println("i = " + i);
            i++;
        }*/
        for (int i = 0; i<=15; i++){
            System.out.println("i = " + i);
        }

        for (int i = 10; i>=0; i--){
            System.out.println("i = " + i);
        }

        for (int i = 1, j = 10; i<j; i++,j--){
            System.out.println(i + " - " + j);
        }

        for (int i = 0; i<=15; i++){
            //if (!(i % 2 != 0)) Se puede escribir de los 2 modos
            if (i % 2 != 0){
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
