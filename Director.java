/**
 * PATRON: Builder (Director)
 *
 * Orquesta los pasos del builder en el orden correcto.
 * El Director no sabe que tipo concreto de builder recibe,
 * solo llama los pasos en el orden definido.
 *
 * ANALOGIA CON EL PROFE:
 *   Lector_  ->  Director
 *   Lector_.parseInput()  ->  Director.construir(builder)
 *   Lector_ recibia un Converter_ y llamaba make___() segun el tipo de linea.
 *   Director recibe un ContratoBuilder y llama los 4 pasos de construccion.
 */
public class Director {

    public Contrato construir(ContratoBuilder builder) {
        builder.crearContrato();      // inicializar (equivale a new Converter_)
        builder.buildCliente();       // paso 1
        builder.buildVehiculo();      // paso 2
        builder.buildPlan();          // paso 3 (aqui se valida duracion > 30 dias)
        builder.buildAccesorios();    // paso 4
        return builder.getContrato(); // retornar producto terminado
    }
}
