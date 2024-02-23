import modelo.RevisionAlarma;
import modelo.TrabajoPintura;
import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        int tipoobra;

        try {
            //creo el objeto para crear una cuenta corriente
            do {

                //Try catch para evitar que el programa termine si hay un error
                System.out.println("Elige el tipo de obra" +
                        "\n1.- Pintura" +
                        "\n2.- Alarma");
                tipoobra = sc.nextInt();

                System.out.println("MENU DE OPCIONES:" +
                        "\n1.- Coste total de la obra" +
                        "\n2.- Detalles de la obra" +
                        "\n0.- Salir");

                System.out.println("Enter la opcion elegida: ");
                opcion = sc.nextInt();

                //Ejemplo de switch case en Java
                switch (tipoobra) {

                    case 1: //pintura
                        TrabajoPintura trabajoPintura1 = new TrabajoPintura("Daniel", LocalDate.now(), "Marcelo", 40,20);
                        if (opcion == 1) {
                            System.out.println("El coste total de la obra es: " + trabajoPintura1.costeTotal());
                        } else {
                            System.out.println("Detalle de servicio de obra : " + trabajoPintura1.detalleServicio());
                        }
                        break;
                    case 2: //alarma
                        RevisionAlarma revisionalarma1 = new RevisionAlarma("Danielalarma", LocalDate.now(), "Marcelito",5);
                        if (opcion == 1) {
                            System.out.println("El coste total de su revision de alarma es: "+ revisionalarma1.costeTotal());
                        } else {
                            System.out.println("Detalle de revision de alarmas :" + revisionalarma1.detalleServicio());
                        }
                        break;
                    case 0:
                        System.out.println("Adios!");
                        break;
                    default:
                        System.out.println("Número no reconocido");
                        break;
                }//switch
                System.out.println("\n"); //Mostrar un salto de línea en Java
            } while (opcion != 0);//while
            System.out.println("Hasta pronto");
        } //try
        catch (Exception e) {
            System.out.println("Uoop! Error!");
        }//catch
    }//main
}