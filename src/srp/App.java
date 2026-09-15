package srp;
public class App {
    public static void main(String[] args) throws Exception {
        Vehiculo carro = new Vehiculo("twingo", 12);

        VehiculoRepositorio repo= new VehiculoRepositorio();
        repo.guardar(carro);

        VehiculoReporteGenerador reporte = new VehiculoReporteGenerador();
        reporte.generarPDF(carro);

    }
}
