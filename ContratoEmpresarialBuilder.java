/**
 * PATRON: Builder (builder concreto 2 - Plan Empresarial)
 */
public class ContratoEmpresarialBuilder extends ContratoBuilder {

    private String nombreCliente;
    private Vehiculo vehiculoAsignado;

    public ContratoEmpresarialBuilder(String nombreCliente, Vehiculo vehiculo) {
        this.nombreCliente = nombreCliente;
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
        contrato.setPlan("Plan Empresarial");
        contrato.setDuracionDias(45);
        // REGLA DEL PDF: si duracion > 30 dias -> descuento del 15%
        if (contrato.getDuracionDias() > 30) {
            contrato.setDescuento(0.15);
        } else {
            contrato.setDescuento(0);
        }
    }

    @Override
    public void buildAccesorios() {
        // Plan empresarial: todos los accesorios incluidos
        contrato.setGps(true);
        contrato.setSeguro(true);
        contrato.setCargadorPortatil(true);
    }
}
