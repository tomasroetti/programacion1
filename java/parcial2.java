import java.util.Scanner;

public class parcial2 {
    public static void main(String[] args) {
        int candidatos,contador,pepe,julian,carlos,ganador;
        String pepito,juliancito,carlitos,nombreganador;
        Scanner escrutinio = new Scanner(System.in);

        pepito="Pepe";
        juliancito="Julian";
        carlitos="Carlos";

        pepe=0;
        julian=0;
        carlos=0;

        contador=0;
        while (contador<4) {
            System.out.println("Ingrese el Número del candidato que sea votar");
            System.out.println("1-Pepe");
            System.out.println("2-Julian");
            System.out.println("3-Carlos");
            candidatos=escrutinio.nextInt();

            switch (candidatos) {
                case 1:
                    pepe=pepe+1;
                    
                    break;
                case 2:
                    julian=julian+1;

                    break;
                case 3:
                    carlos=carlos+1;
            
                default:
                    System.out.println("Voto en blanco");
                    break;
            }
            contador=contador+1;
        }
        System.out.println("Cantidad de votos de Pepe "+pepe);
        System.out.println("Cantidad de votos a Julian "+julian);
        System.out.println("Cantidad de votos a Carlos "+carlos);

        if (pepe>julian) {
            ganador=pepe;
            nombreganador=pepito;
            
        }else{
            ganador=julian;
            nombreganador=juliancito;




        }   
        if (ganador<carlos) {
            ganador=carlos;
            nombreganador=carlitos;
            
        }
        
        
        
        System.out.println("El ganador es "+nombreganador+"  con "+ganador+" votos");
        


    
    }
    
}
