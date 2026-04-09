/**
 * PATRON: Factory Method (subclase concreta 3)
 *
 * CORRECCION: se agrego "public" a la clase.
 *
 * ANALOGIA CON EL PROFE:
 *   PostScriptConverter_  →  Camion
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
