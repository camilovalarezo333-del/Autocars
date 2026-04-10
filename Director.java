/**
 * PATRON: Builder (Director)
 */
public class Director {

    public Contrato construir(ContratoBuilder builder) {
        builder.crearContrato(); // inicializar (equivale a new Converter_)
        builder.buildCliente(); // paso 1
        builder.buildVehiculo(); // paso 2
        builder.buildPlan(); // paso 3 (aqui se valida duracion > 30 dias)
        builder.buildAccesorios(); // paso 4
        return builder.getContrato(); // retornar producto terminado
    }
}
