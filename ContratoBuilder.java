/**
 * PATRON: Builder (builder abstracto)
 */
public abstract class ContratoBuilder {

    protected Contrato contrato;

    public void crearContrato() {
        contrato = new Contrato();
    }

    public abstract void buildCliente();

    public abstract void buildVehiculo();

    public abstract void buildPlan();

    public abstract void buildAccesorios();

    public Contrato getContrato() {
        return contrato;
    }
}
