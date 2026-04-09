/**
 * PATRON: Factory Method (subclase concreta 2)
 *
 * CORRECCION: se agrego "public" a la clase.
 * Sin "public", Java no puede usarla desde otro archivo .java.
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
