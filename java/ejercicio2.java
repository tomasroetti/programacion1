import java.util.Scanner;



public class ejercicio2 {

public static void main(String[]args) {

    int cantidad=0;
    Scanner producto = new Scanner(System.in);
    

    System.out.println("Ingrese la cantidad de productos que desea comprar");
    cantidad=producto.nextInt();

    if (cantidad<5) {
        System.out.println("No se permiten compras menores a 5 productos");
        
    }
        else if (cantidad >=5  && cantidad <=15) {
        System.out.println("El envio saldria 200$");

        
        }
        else{
            System.out.println("El envio es gratis ");



        } 
    


    
}
    
}
