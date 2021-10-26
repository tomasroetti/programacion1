import java.util.Scanner;


public class guiaejer2 {
    public static void  main(String[] args) {
        int contador=1;
        int auto,mejorauto;
        double mejorvuelta,vuelta;
        Scanner carrera = new Scanner(System.in);

        System.out.println( "Ingrese el tiempo de la vuelta en segundos");
            vuelta=carrera.nextDouble();

            System.out.println("Ingrese el número del auto");
            auto=carrera.nextInt();

            mejorauto=auto;
            mejorvuelta=vuelta;
        
        while (contador<4) {
            System.out.println( "Ingrese el tiempo de la vuelta en segundos");
            vuelta=carrera.nextDouble();

            System.out.println("Ingrese el número del auto");
            auto=carrera.nextInt();

            if (vuelta<mejorvuelta) {
                mejorvuelta=vuelta;
                mejorauto=auto;
                
            }
            contador=contador+1;




        }
        System.out.println("La mejor vuelta es "+mejorvuelta);
        System.out.println("El mejor auto es "+mejorauto);

    




        
    }
    
}
