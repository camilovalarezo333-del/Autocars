/**
 * PATRON: Factory Method
 *
 * La fabrica centraliza la creacion de vehiculos.
 * El resto del codigo pide un vehiculo por tipo (string) y
 * no necesita saber que clase concreta se instancia.
 *
 * ANALOGIA CON EL PROFE:
 *   En EjecutarBuilder el profe escribia directamente:
 *     new ASCIIConverter_("ASCII")
 *     new PDFConverter_("PDF")
 *   Con Factory Method eso queda oculto:
 *     VehiculoFactory.crear("auto", "ABC-001", 350)
 *
 * POR QUE FACTORY METHOD Y NO PROTOTYPE:
 *   Prototype seria util si existieran plantillas de vehiculos
 *   que se clonan y personalizan (ej: "auto urbano estandar").
 *   Aqui cada vehiculo tiene placa unica y no hay estado base
 *   compartido que valga la pena clonar, por eso Factory Method
 *   es la eleccion correcta: centraliza la logica de creacion
 *   y facilita agregar nuevos tipos sin modificar el resto del codigo.
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
