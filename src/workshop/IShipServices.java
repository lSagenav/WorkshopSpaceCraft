package workshop;

public interface IShipServices {

    /**
     * Crear una Nave lanzadera.
     */
    public void makeShuttleShip();

    /**
     * Crear una Nave no tripuladas o roboticas.
     */
    public void makeUnmannedOrRoboticShips();

    /**
     * Crear una Nave Lanzadera grande y ejecuta métodos de la ship.
     */
    public void makeMannedSpaceShip();

}
