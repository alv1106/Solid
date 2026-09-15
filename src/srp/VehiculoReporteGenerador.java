package srp;
public class VehiculoReporteGenerador {
    private String Vehiculo;
    public void generarPDF(Vehiculo v){
        //responsabilidad unica reporteria
        System.out.println("generando pdf con los datos de " + v.getMarca()+ "...");
    }
    
}
