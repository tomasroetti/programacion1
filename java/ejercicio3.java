import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[]args){
        int total,precio1,precio2,precio3,peso1,peso2,peso3,cant1,cant2,cant3;
        double porcentaje;
        Scanner balanza = new Scanner(System.in);

        System.out.println("Ingrese el peso en Kg");
        peso1=balanza.nextInt();
        
        System.out.println("Ingrese cantidad en kg");
        cant1=balanza.nextInt();

        precio1=cant1*peso1;

        System.out.println("Ingrese del segundo producto el peso en Kg");
        peso2=balanza.nextInt();
        
        System.out.println("Ingrese cantidad en kg");
        cant2=balanza.nextInt();

        precio2=cant2*peso2;

        System.out.println("Ingrese el peso del tecer producto en Kg");
        peso3=balanza.nextInt();
        
        System.out.println("Ingrese cantidad en kg");
        cant3=balanza.nextInt();

        precio3=cant3*peso3;

        System.out.println("El monto del primer producto es de "+precio1+" $");
        System.out.println("El monto del segundo  producto es de "+precio2+" $");
        System.out.println("El monto del tercer producto es de "+precio3+" $");

        total=precio1+precio2+precio3;
        System.out.println("El precio total es de "+total+" $");

        if (total>100) {
            porcentaje=total-(total*0.10);
            System.out.println("Se hizo un descuento de 10% el valor a pagar es de "+porcentaje+" $");

            
        }


    
        
    }
    
}
