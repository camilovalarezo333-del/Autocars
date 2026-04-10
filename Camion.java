/**
 * PATRON: Factory Method (subclase concreta 3)
 */
public class Camion extends Vehiculo {

    public Camion(String placa, int autonomia) {
        super(placa, autonomia);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Camion ligero   | Placa: " + placa + " | Autonomia: " + autonomia + " km");
    }
}
