package workshop;

import java.util.Scanner;

/**
 * esta sera la clase principal o como lo conocemos el main donde tendremos el control total del programa
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    static boolean activ = false;
    static int selection = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Este es el taller de las naves");

        SpaceShipServices service = new SpaceShipServices();

        /**
         * aqui tendremos el menu que le permitira al usuario elegir el tipo de naves que desea crear
         * @return
         */
        do {
            System.out.println("--------------------------------------------------------------");
            System.out.println("---- POR FAVOR NO USAR ESPACIOS NI CARACTERES ESPECIALES ---- ");
            System.out.println("--------------------------------------------------------------");
            System.out.println("\n1.  Crear nave  Lanzadera");
            System.out.println("2.  Crear nave no tripulada o robotica");
            System.out.println("3.  Crear nave especial tripulada");
            System.out.println("4.  Salir");
            System.out.print("\n Ingrese una opcion = ");
            selection = sc.nextInt();
            System.out.println(" ");
            /**
             * por este lado tenemos el siclo do while donde nos permitira entrar en un bucle donde crearemos las naves
             */
            switch (selection) {

                case 1:
                    service.makeShuttleShip();
                    break;
                case 2:
                    service.makeUnmannedOrRoboticShips();
                    break;
                case 3:
                    service.makeMannedSpaceShip();
                    break;
                case 4:
                    service.close();
                    activ = false;
                    break;
                default:
                    System.out.println(" ¡¡¡ La opcion ingresada es incorrecta intenta de nuevo! ¡¡¡");
                    activ = true;
                    break;

            }

        } while (activ == true);
    }
}
