/**
 * PATRON: Builder (builder concreto 3 - Plan VIP)
 *
 * Tercer builder concreto, equivalente a PostScriptConverter_ del profe.
 * El profe tenia 3 Converters (ASCII, PDF, PostScript).
 * Aqui hay 3 builders (Basico, Empresarial, Vip) para mantener la analogia completa.
 *
 * Plan VIP: duracion larga, todos los accesorios, descuento maximo garantizado.
 *
 * ANALOGIA CON EL PROFE:
 *   PostScriptConverter_  ->  ContratoVipBuilder
 */
public class ContratoVipBuilder extends ContratoBuilder {

    private String nombreCliente;
    private Vehiculo vehiculoAsignado;

    public ContratoVipBuilder(String nombreCliente, Vehiculo vehiculo) {
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
        contrato.setPlan("Plan VIP");
        contrato.setDuracionDias(90);
        // 90 dias > 30 dias -> descuento del 15% garantizado
        contrato.setDescuento(0.15);
    }

    @Override
    public void buildAccesorios() {
        // Plan VIP: todos los accesorios premium incluidos
        contrato.setGps(true);
        contrato.setSeguro(true);
        contrato.setCargadorPortatil(true);
    }
}
