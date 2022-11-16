import java.lang.constant.Constable;
import java.util.Scanner;

public class proyecto_futuro {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        String nombre;
        int modulos;
        int pocashoras = 0;
        int muchashoras = 0;

        System.out.print("Introduce tu nombre y apellido:");
        nombre = sc.nextLine();
        System.out.print("Módulos matriculados:");
       modulos = sc.nextInt();

        System.out.println("Introduce dos cantidades de horas de estudio:");
        int N = sc.nextInt();
        int numeromenor=0;
        int numeromayor=0;

        for (int i = 0; i < N ; i++){
            int tmp= sc.nextInt();
            if (i==0) {
                numeromenor=tmp;
                numeromayor=tmp;
            }else if (tmp<numeromenor) {
                numeromenor=tmp;
            }if (tmp>numeromayor) {
                numeromayor=tmp;
            }
        }
        System.out.println("Número menor:" + numeromenor);
        System.out.println("Número mayor:" + numeromayor);

    }
}



