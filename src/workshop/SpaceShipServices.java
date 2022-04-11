package workshop;


import java.util.Scanner;

/**
 * aqui estaremos creando todos los servicios y funcionalidades que tendran las naves
 */
public class SpaceShipServices implements IShipServices {
    /**
     * creamos el scaner para poder solicitar los datos al usuario de como desea crear las naves
     */
    Scanner sc = new Scanner(System.in);
    int selection = 0;
    boolean close = false;
    double aux = 0;


    /**
     * de aqui en adelante estaremos creando los 3 tipos de naves con sus
     * respectivos atributos
     */
    @Override
    public void makeShuttleShip() {
        MakeShuttleShip ship1 = new MakeShuttleShip();
        System.out.println("por favor ingrese el nombre de la nave ");
        ship1.setName(sc.next());

        System.out.println("por favor ingrese el codigo de la nave ");
        ship1.setId(sc.nextInt());

        System.out.println("ingrese la ciudad de origen");
        ship1.setCountry(sc.next());

        System.out.println("ingrese el peso de la nave en toneladas");
        ship1.setWeigth(sc.nextInt());

        System.out.println("ingrese la altura de la nave en metros");
        ship1.setHeigth(sc.nextInt());

        System.out.println("ingrese la maxima velocidad de la nave");
        ship1.setMaxSpeed(sc.nextInt());

        System.out.println("ingrese la maxima capacidad de la nave");
        ship1.setFuelCapacity(sc.nextInt());

        System.out.println("ingrese el tipo de material de la nave");
        ship1.setMaterial(sc.next());

        System.out.println(ship1);

        System.out.println("nave 1");


    }

    @Override
    public void makeUnmannedOrRoboticShips() {

        MakeUnmannedOrRoboticShips ship2 = new MakeUnmannedOrRoboticShips();

        System.out.println("por favor ingrese el nombre de la nave ");
        ship2.setName(sc.next());

        System.out.println("por favor ingrese el codigo de la nave ");
        ship2.setId(sc.nextInt());

        System.out.println("ingrese la ciudad de origen");
        ship2.setCountry(sc.next());

        System.out.println("ingrese el peso de la nave en toneladas");
        ship2.setWeigth(sc.nextInt());

        System.out.println("ingrese la altura de la nave en metros");
        ship2.setHeigth(sc.nextInt());

        System.out.println("ingrese la maxima velocidad de la nave");
        ship2.setMaxSpeed(sc.nextInt());

        System.out.println("ingrese la maxima capacidad de la nave");
        ship2.setFuelCapacity(sc.nextInt());

        System.out.println("ingrese el tipo de material de la nave");
        ship2.setMaterial(sc.next());

        System.out.println(ship2);
        System.out.println("nave 2");


    }

    @Override
    public void makeMannedSpaceShip() {

        MakeMannedSpaceShip ship3 = new MakeMannedSpaceShip();

        System.out.println("por favor ingrese el nombre de la nave ");
        ship3.setName(sc.next());

        System.out.println("por favor ingrese el codigo de la nave ");
        ship3.setId(sc.nextInt());

        System.out.println("ingrese la ciudad de origen");
        ship3.setCountry(sc.next());

        System.out.println("ingrese el peso de la nave en toneladas");
        ship3.setWeigth(sc.nextInt());

        System.out.println("ingrese la altura de la nave en metros");
        ship3.setHeigth(sc.nextInt());

        System.out.println("ingrese la maxima velocidad de la nave");
        ship3.setMaxSpeed(sc.nextInt());

        System.out.println("ingrese el tipo de material de la nave");
        ship3.setMaterial(sc.next());

        System.out.println(ship3);

        System.out.println("nave 3");


    }

    public void close() {

        System.out.println("Programa finalizado");
    }
}
