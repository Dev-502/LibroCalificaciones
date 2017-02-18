import java.util.Scanner;

/**
 * Created by lexo on 2/18/17.
 */
public class LibroCalificaciones {
    private String nombreDelCurso;

    public LibroCalificaciones(String nombre){
        nombreDelCurso = nombre;
    }
    public void establecerNombreDelCurso(String nombre){
        nombreDelCurso= nombre;
    }
    public String obtenerNombreDelCurso()
    {
        return nombreDelCurso;
    }
    public void mostrarMensaje(){
        System.out.printf("Bienvenido al libro de calificaciones para \n %s!\n\n",obtenerNombreDelCurso());
    }
    public void determinarPromedioClase(){
        Scanner entrada = new Scanner(System.in);
        int total;
        int contadorCalif;
        int calificacion;
        double promedio;

        total= 0;
        contadorCalif = 0;

        System.out.print("Escribaca calificacion o -1 para terminar: ");
        calificacion = entrada.nextInt();

        while(calificacion != -1){
            total = total+calificacion;
            contadorCalif = contadorCalif+1;

            System.out.print("Escriba califiacion o -1 para terminar");
            calificacion = entrada.nextInt();
        }

        if(contadorCalif !=0){
            promedio = (double) total/contadorCalif;
            System.out.printf("\n El total de las %d calificaciones intruducidas es %d\n",
                    contadorCalif,total
            );
            System.out.printf("El promedio de la clase es %.2f\n",promedio);


        }
        else {
            System.out.println("No se introdujeron calificaciones");
        }
    }
}


