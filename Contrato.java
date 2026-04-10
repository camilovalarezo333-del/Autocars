/**
 * PATRON: Builder (producto final)
 */
public class Contrato {

    private String cliente;
    private Vehiculo vehiculo;
    private String plan;
    private int duracionDias;

    private boolean gps;
    private boolean seguro;
    private boolean cargadorPortatil;

    private double descuento;

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public void setDuracionDias(int dias) {
        this.duracionDias = dias;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    public void setCargadorPortatil(boolean cargador) {
        this.cargadorPortatil = cargador;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public void mostrar() {
        System.out.println("------ Contrato AutoCar ------");
        System.out.println("Cliente   : " + cliente);
        System.out.println("Plan      : " + plan);
        System.out.println("Duracion  : " + duracionDias + " dias");
        System.out.print("Accesorios: ");
        if (gps)
            System.out.print("[GPS] ");
        if (seguro)
            System.out.print("[Seguro] ");
        if (cargadorPortatil)
            System.out.print("[Cargador] ");
        System.out.println();
        if (descuento > 0) {
            System.out.println("Descuento : " + (int) (descuento * 100) + "%  (duracion > 30 dias)");
        }
        System.out.print("Vehiculo  : ");
        vehiculo.mostrarInfo();
        System.out.println("------------------------------\n");
    }
}
