import java.util.Scanner;

public class vectores1 {

public static void main(String[] args) {
    
    int N,notas,comparador=0;
    int total =0;
    double promedio;
    Scanner curso = new Scanner(System.in);

    System.out.println("Ingrese la cantidad de alumnos");
    N=curso.nextInt();

    int [] almunos = new int[N];

    for (int i = 0; i < almunos.length; i++) {
    
        System.out.println("Ingrese la nota del alumnos");
        notas=curso.nextInt();
        
        total=notas+total;

        
        if (comparador<notas) { //compara las notas , si el comparador es menor a notas 
            comparador = notas;
            
        }

        
    }
    promedio=total/N;
    System.out.println("El promedio de los alumnos es de "+promedio);
    System.out.println("La nota mas alta es de "+comparador);
    System.out.println(almunos[N]);
    
    
}
    
}
