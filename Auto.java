/**
 * PATRON: Factory Method (subclase concreta 1)
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
