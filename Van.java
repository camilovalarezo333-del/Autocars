/**
 * PATRON: Factory Method (subclase concreta 2)
 */
public class Van extends Vehiculo {

    public Van(String placa, int autonomia) {
        super(placa, autonomia);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Van hibrida     | Placa: " + placa + " | Autonomia: " + autonomia + " km");
    }
}
