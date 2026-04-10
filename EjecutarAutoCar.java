/**
 * MAIN - EjecutarAutoCar
 */
public class EjecutarAutoCar {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║   AutoCar - Sistema de Alquiler EV   ║");
        System.out.println("╚══════════════════════════════════════╝\n");

        // ── ESCENARIO 1: Factory Method + Inventario ──────────────────────────

        System.out.println(">>> ESCENARIO 1: Inventario de Vehiculos (Factory Method)\n");

        // Se crean vehiculos usando la fabrica
        // El main NO necesita saber si es new Auto(), new Van() o new Camion()
        Vehiculo v1 = VehiculoFactory.crear("auto", "ABC-001", 350);
        Vehiculo v2 = VehiculoFactory.crear("van", "XYZ-002", 200);
        Vehiculo v3 = VehiculoFactory.crear("camion", "LMN-003", 280);
        Vehiculo v4 = VehiculoFactory.crear("auto", "QRS-004", 420);
        Vehiculo v5 = VehiculoFactory.crear("van", "TUV-005", 180);

        Inventario inventario = new Inventario(10);
        inventario.agregar(v1);
        inventario.agregar(v2);
        inventario.agregar(v3);
        inventario.agregar(v4);
        inventario.agregar(v5);

        inventario.mostrarTodos();

        System.out.println("\n>> Buscar placa LMN-003:");
        Vehiculo encontrado = inventario.buscarPorPlaca("LMN-003");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        } else {
            System.out.println("No encontrado.");
        }

        System.out.println("\n>> Ordenados por autonomia (menor a mayor):");
        inventario.ordenarPorAutonomia();
        inventario.mostrarTodos();

        System.out.println("\n>>> ESCENARIO 2: Contratos de Alquiler (Builder)\n");
        Director director = new Director();

        ContratoBuilder builderBasico = new ContratoBasicoBuilder("Juan Perez", v1);
        Contrato contrato1 = director.construir(builderBasico);
        contrato1.mostrar();

        ContratoBuilder builderEmpresarial = new ContratoEmpresarialBuilder("Empresa TechCar S.A.", v3);
        Contrato contrato2 = director.construir(builderEmpresarial);
        contrato2.mostrar();

        ContratoBuilder builderVip = new ContratoVipBuilder("Maria Lopez VIP", v4);
        Contrato contrato3 = director.construir(builderVip);
        contrato3.mostrar();
    }
}
