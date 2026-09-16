public class App {
    public static void main(String[] args) throws Exception {
        Carro car = new Carro();
        car.andarEnTierra();
        Avioneta avio = new Avioneta();
        avio.volar();
        avio.andarEnTierra();
        VehiculoAnfibio vefibio = new VehiculoAnfibio();
        vefibio.andarEnTierra();
        vefibio.navegar();

    }
    
}
