import conicas2.circunferencia_grupo2;
import conicas2.Elipse;
import conicas2.hiperbole;
import conicas2.Parabola_Equipo2;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        circunferencia_grupo2 circulo = new circunferencia_grupo2(2, 3);
        Elipse curva_plana = new Elipse(1, 2);
        hiperbole hiper = new hiperbole(2.1, 3.3);
        Parabola_Equipo2 parabola = new Parabola_Equipo2(5, 6, 1, 2, 3);

        System.out.println("Bienvenido/a");
        System.out.println("A continuacion se le presentara una lista de opciones");
        System.out.println("para calcular el perimetro y el area de objetos");
        System.out.println("Las figuras son:");
        System.out.println("1) Circunferencia");
        System.out.println("2) Elpise");
        System.out.println("3) Hiperbole");
        System.out.println("4) Parabola");
        System.out.println("0) Salir del sistema");
        do {
            do {
                System.out.println("Ingrese la opcion a la que desea ingresar: ");
                opcion = entrada.nextInt();
                if (opcion < 0 || opcion > 4) {
                    System.out.println("Opcion incorrecta");
                    System.out.println("Ingrese nuevamente una opcion");}}
            while (opcion < 0 || opcion > 4);
            if (opcion == 1) {
                System.out.println("Ha seleccionado la opcion 1");
                System.out.println("Esta es el area del circulo");
                System.out.println(circulo.area_cir());
                System.out.println("Este es el perimetro del circulo");
                System.out.println(circulo.angulo_inscrito_cir());
                System.out.println("Recuerde que para salir del sistema la opcion es 0");}
            else if (opcion == 2) {
                System.out.println("Ha seleccionado la opcion 2");
                System.out.println("Esta es el area del elipse");
                System.out.println(curva_plana.area_elipse());
                System.out.println("Este es el perimetro del elipse");
                System.out.println(curva_plana.perimetro_elipse());
                System.out.println("Recuerde que para salir del sistema la opcion es 0");}
            else if (opcion == 3) {
                System.out.println("Ha seleccionado la opcion 3");
                hiper.variables();
                System.out.println("Recuerde que para salir del sistema la opcion es 0");}
            else if (opcion == 4) {
                System.out.println("Ha seleccionado la opcion 4");
                System.out.println("Esta es el area de la parabola");
                parabola.Parabola_Equipo2_ImpVer();
                System.out.println("Recuerde que para salir del sistema la opcion es 0");}}
        while(opcion != 0);}}