/**
 * PATRON: Factory Method (subclase concreta 1)
 *
 * ANALOGIA CON EL PROFE:
 *   ASCIIConverter_  →  Auto
 *   Extiende Vehiculo e implementa mostrarInfo() a su manera.
 */
public class Auto extends Vehiculo {

    public Auto(String placa, int autonomia) {
        super(placa, autonomia);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Auto electrico  | Placa: " + placa + " | Autonomia: " + autonomia + " km");
    }
}
