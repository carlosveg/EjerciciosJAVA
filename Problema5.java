import java.util.Scanner;

public class Problema5 {

    static String getCalif(int calif, int opcion) {
        String result = "";

        if (calif >= 90 && calif <= 100) result = opcion == 1 ? "A" : "Muy bien";
        if (calif >= 80 && calif < 90) result = opcion == 1 ? "B" : "Bien";
        if (calif >= 60 && calif < 80) result = opcion == 1 ? "C" : "Suficiente";
        if (calif >= 0 && calif < 60) result = opcion == 1 ? "F" : "No suficiente"; 

        return result;
    }
        

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int calif;
        int opcion;

        System.out.print("Introduce tu calificación: ");
        calif = sc.nextInt();

        System.out.print("Forma de ver la calificación: \n\t1.- Letra\n\t2.- Descripción\n");
        opcion = sc.nextInt();

        System.out.println(getCalif(calif, opcion));
    }
}
