/**
 * PATRON: Factory Method (clase base / producto abstracto)
 *
 * Clase base abstracta para todos los vehiculos de AutoCar.
 *
 * ANALOGIA CON EL PROFE:
 *   Converter_  →  Vehiculo
 *   Ambas son la clase padre que los subtipos concretos extienden.
 *   Converter_ define makeLine/makeParagraph/makeTable como metodos sobreescribibles.
 *   Vehiculo define mostrarInfo() como metodo abstracto.
 */
public abstract class Vehiculo {

    protected String placa;
    protected int autonomia; // km por carga

    public Vehiculo(String placa, int autonomia) {
        this.placa = placa;
        this.autonomia = autonomia;
    }

    public abstract void mostrarInfo();

    public String getPlaca() {
        return placa;
    }

    public int getAutonomia() {
        return autonomia;
    }
}
