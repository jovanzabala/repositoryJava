import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        //String[] nombres = new String[6];
        String[] nombres = {"Jovan","Royman","Pepe","Paco","Juan","Lolo","Macho","Lucho","Ramon"};
        int count = nombres.length;
        //for (int i = 0; i <= count-1; i++)
        for (int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase("jovan") ||
            nombres[i].equalsIgnoreCase("ramoN")){
                continue;
            }
            System.out.println(i + ".-" + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\": ");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres[i]);
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null,buscar + " fue encontrado! ");
        } else {
            JOptionPane.showMessageDialog(null,buscar + " no existe en el sistema!");

        }
    }
}
