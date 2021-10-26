import java.util.Scanner;

public class recorrido {
public static void main(String[] args) {
    int [][]recorido =new int [3][3];
    Scanner teclado = new Scanner(System.in);
    int valor ;

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.println("Ingrese un número ");
            valor =teclado.nextInt();
            recorido [i][j] = valor ;

        }
    }
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.println("La posicion es "+i + j+" el valor es "+recorido[i][j]);

    
            
        }
        
    }


        
    
}
    
}
