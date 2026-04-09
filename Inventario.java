/**
 * Inventario de vehiculos usando un ARRAY DE OBJETOS.
 *
 * El PDF pide explicitamente: "array de objetos, no lista dinamica".
 * Por eso se usa Vehiculo[] en vez de ArrayList<Vehiculo>.
 *
 * Operaciones implementadas:
 * - agregar(Vehiculo v)
 * - buscarPorPlaca(String placa)
 * - ordenarPorAutonomia() <- ordenamiento burbuja
 * - mostrarTodos()
 */
public class Inventario {

    private Vehiculo[] vehiculos;
    private int contador;

    public Inventario(int capacidad) {
        vehiculos = new Vehiculo[capacidad];
        contador = 0;
    }

    public void agregar(Vehiculo v) {
        if (contador < vehiculos.length) {
            vehiculos[contador] = v;
            contador++;
        } else {
            System.out.println("Inventario lleno. No se pudo agregar: " + v.getPlaca());
        }
    }

    public Vehiculo buscarPorPlaca(String placa) {
        for (int i = 0; i < contador; i++) {
            if (vehiculos[i].getPlaca().equalsIgnoreCase(placa)) {
                return vehiculos[i];
            }
        }
        return null;
    }

    public void ordenarPorAutonomia() {
        for (int i = 0; i < contador - 1; i++) {
            for (int j = 0; j < contador - 1 - i; j++) {
                if (vehiculos[j].getAutonomia() > vehiculos[j + 1].getAutonomia()) {
                    Vehiculo temp = vehiculos[j];
                    vehiculos[j] = vehiculos[j + 1];
                    vehiculos[j + 1] = temp;
                }
            }
        }
    }

    public void mostrarTodos() {
        System.out.println("=== Inventario AutoCar (" + contador + " vehiculos) ===");
        for (int i = 0; i < contador; i++) {
            vehiculos[i].mostrarInfo();
        }
        System.out.println("=================================================");
    }
}
