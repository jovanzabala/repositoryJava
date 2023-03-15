public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
      String a = "a";
      String b = "b";
      String c = a;

      StringBuilder sb = new StringBuilder(a);
      long inicio = System.currentTimeMillis();

      for (int i = 0; i < 5000; i++){
         c = c.concat(a).concat(b).concat("\n"); //500 => 2ms, 5000 =>26ms, 100000 =>5070ms
//         c += a + b + "\n"; //500 => 21ms , 5000 => 31ms, 100000 =>1975ms
//          sb.append(a).append(b).append("\n");// 500 => 0ms, 1000 =>0ms, 5000 =>1ms, 100000 =>8ms
      }
      //Podemos decir que el metodo StringBuilder es mucho mas eficiente que el metodo concat y +

      long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
//        System.out.println("sb = " + sb.toString());
    }
}
