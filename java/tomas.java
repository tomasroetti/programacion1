import java.util.Scanner;

public class tomas {

public static void main(String[]args) {
    int tomas,julio=0;
    Scanner compartivo = new Scanner(System.in);

    System.out.println("Ingrese un número");
    tomas=compartivo.nextInt();

    System.out.println("Ingrese un número");
    julio=compartivo.nextInt();


    if (tomas<julio) {
        System.out.println("Valor correcto");
        
    }
    else
    {
        System.out.println("Valor incorrecto");

    }

    
}






}
