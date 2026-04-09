/**
 * PATRON: Builder (builder concreto 1 - Plan Basico / cliente particular)
 *
 * CORRECCION: se agrego "public" a la clase.
 * CORRECCION: usa setters de Contrato en vez de acceso directo a campos.
 *
 * ANALOGIA CON EL PROFE:
 *   ASCIIConverter_  ->  ContratoBasicoBuilder
 *   Mismo esquema, implementa los pasos para un plan basico.
 */
public class ContratoBasicoBuilder extends ContratoBuilder {

    private String nombreCliente;
    private Vehiculo vehiculoAsignado;

    public ContratoBasicoBuilder(String nombreCliente, Vehiculo vehiculo) {
        this.nombreCliente    = nombreCliente;
        this.vehiculoAsignado = vehiculo;
    }

    @Override
    public void buildCliente() {
        contrato.setCliente(nombreCliente);
    }

    @Override
    public void buildVehiculo() {
        contrato.setVehiculo(vehiculoAsignado);
    }

    @Override
    public void buildPlan() {
        contrato.setPlan("Plan Basico");
        contrato.setDuracionDias(7);
        // Duracion de 7 dias: no supera 30 -> sin descuento
        contrato.setDescuento(0);
    }

    @Override
    public void buildAccesorios() {
        // Plan basico: solo GPS incluido
        contrato.setGps(true);
        contrato.setSeguro(false);
        contrato.setCargadorPortatil(false);
    }
}
