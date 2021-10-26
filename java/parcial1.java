import java.util.Scanner;

public class parcial1 {
    public static void main(String[] args) {
        int partido ,ganado,perdido,empatado;
        int team,contador,total;
        String equipo ;
        Scanner futbol = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de equipos");
        team=futbol.nextInt();

        contador=1;

        while (contador<=team) {
            
            partido=0;
            ganado=0;
            empatado=0;
            total=0;
        
            System.out.print("Ingrese el nombre del equipo :");
            equipo =futbol.next();

            System.out.println("Ingrese la cantidad de partidos jugados");
            partido=futbol.nextInt();

            System.out.println("Ingrese la cantidad de partidos ganados");
            ganado =futbol.nextInt();

            System.out.println("Ingrese la cantidad de partidos perdidos");
            perdido=futbol.nextInt();

            System.out.println("Ingrese la cantidad de partidos empatados");
            empatado=futbol.nextInt();

            
            ganado=ganado*3;
            perdido=perdido*0;
            total=perdido+empatado+ganado;

            System.out.println(equipo);
            System.out.println("Puntos por victoria "+ganado);
            System.out.println("Puntos por empate "+empatado);
            System.out.println("La cantidad de puntos obtenidos en "+partido+" es de "+total);

            contador=contador+1;






        }

    }
}
    
