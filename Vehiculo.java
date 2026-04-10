/**
 * PATRON: Factory Method (clase base / producto abstracto)
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
