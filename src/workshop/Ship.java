package workshop;

public class Ship {
    /**
     * creamos la clase ac¿stracta de la ship donde vemos todos las variables que iremos a necesitar
     */
    private long id;
    private String country;
    private String name;
    private float weigth;
    private double heigth;
    private double maxSpeed;
    private double fuelCapacity;
    private String material;


    /**
     * creamos el tostring para pintar el estado de los objetos
     *
     * @return
     */
    @Override
    public String toString() {
        return "Nave [ " + "id = " + id +
                ", country = " + country +
                ", name = " + name +
                ", weigth = " + weigth +
                ", heigth = " + heigth +
                ", maxSpeed = " + maxSpeed +
                ", fuelCapacity = " + fuelCapacity +
                ", material = " + material + " ]";
    }

    /**
     * tenemos aqui un constructor basio como buenas practicas
     */
    public Ship() {


    }

    /**
     * aqui estamos contruyendo el contructor de la clase ship junto a sis variables,
     * que se crearon pára la creacion de los atributos de las naves
     *
     * @param id
     * @param country
     * @param name
     * @param weigth
     * @param heigth
     * @param maxSpeed
     * @param fuelCapacity
     * @param material
     */
    public Ship(long id, String country, String name, float weigth, double heigth, double maxSpeed, double fuelCapacity, String material) {
        this.id = id;
        this.country = country;
        this.name = name;
        this.weigth = weigth;
        this.heigth = heigth;
        this.maxSpeed = maxSpeed;
        this.fuelCapacity = fuelCapacity;
        this.material = material;
    }

    /**
     * de aqui en adelante estamos creando todos los set y get que se implementaron de as varibales que se usaran en la nave como atribtuos
     *
     * @return
     */
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
