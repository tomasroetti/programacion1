import java.util.Scanner;


public class ejercicio1 {
    public static void  main(String[]args) {
        Integer laburo=0 ;
        double dinero,jubilacion,bono,obra,total=0;
        Scanner trabajo = new Scanner(System.in);

        System.out.println("Ingresar tu el número de tu categoria");
        System.out.println("1-repositor");
        System.out.println("2-cajero");
        System.out.println("3-supervior");
        laburo=trabajo.nextInt();

        switch (laburo) {
            case 1:
                System.out.println("repositor");
                dinero=32335;
                jubilacion=dinero*0.08;
                obra=dinero*0.03;
                bono=dinero*0.08;
                total=dinero+(bono-(obra+jubilacion));
                System.out.println("El descuento por jubilación es de "+jubilacion+" $");
                System.out.println("El descuento de la obra social es de 3% equivale "+obra+" $");
                System.out.println("El aumento del bono del 8% es de "+bono+" $");
                System.out.println("El valor neto del sueldo es de "+dinero+" $");
                System.out.println("El sueldo total es de "+total+" $");

                

                
                break;
            case 2:
                System.out.println("cajero");
                dinero=38630.89;
                jubilacion=dinero*0.08;
                obra=dinero*0.03;
                total=dinero-(jubilacion+obra);
                System.out.println("El descuento por jubilación es de "+jubilacion+" $");
                System.out.println("El descuento de la obra social es de 3% equivale "+obra+" $");
                System.out.println("El valor neto del sueldo es de "+dinero+" $");
                System.out.println("El sueldo total es de "+total+" $");

                break;
            case 3:
                System.out.println("Supervisor");
                dinero=45560.20;
                jubilacion=dinero*0.08;
                obra=dinero*0.03;
                total=dinero-(jubilacion+obra);
                System.out.println("El descuento por jubilación es de "+jubilacion+" $");
                System.out.println("El descuento de la obra social es de 3% equivale "+obra+" $");
                System.out.println("El valor neto del sueldo es de "+dinero+" $");
                System.out.println("El sueldo total es de "+total+" $");
                break;
            default: 
                System.out.println("Ingreso no válido");
                break;


                
        
            
            
        }

        
    }
    
}
