/**
 * PATRON: Factory Method
 */
public class VehiculoFactory {

    public static Vehiculo crear(String tipo, String placa, int autonomia) {
        switch (tipo.toLowerCase()) {
            case "auto":
                return new Auto(placa, autonomia);
            case "van":
                return new Van(placa, autonomia);
            case "camion":
                return new Camion(placa, autonomia);
            default:
                System.out.println("Tipo de vehiculo desconocido: " + tipo);
                return null;
        }
    }
}
