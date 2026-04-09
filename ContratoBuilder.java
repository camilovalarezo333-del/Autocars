/**
 * PATRON: Builder (builder abstracto)
 *
 * Define los pasos de construccion del contrato.
 * Cada builder concreto implementa estos pasos a su manera.
 *
 * POR QUE BUILDER Y NO ABSTRACT FACTORY:
 * Abstract Factory garantiza coherencia entre familias de objetos
 * (ej: siempre plan + accesorio del mismo "tipo cliente").
 * Builder es mejor aqui porque:
 * 1. El contrato se construye PASO A PASO con validaciones en el medio
 * (el descuento del 15% se calcula dentro de buildPlan segun la duracion).
 * 2. La construccion tiene orden obligatorio: primero cliente, luego vehiculo,
 * luego plan (que puede depender del vehiculo), luego accesorios.
 * 3. Permite estados invalidos intermedios controlados, algo que Abstract
 * Factory no maneja bien porque crea objetos completos de una vez.
 *
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
