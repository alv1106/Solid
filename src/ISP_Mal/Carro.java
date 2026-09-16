public class Carro implements Vehiculo {
    @Override
    public void andarEnTierra() {
        System.out.println("El carro anda por la carretera.");
    }

    @Override
    public void volar() {
        // Un carro no vuela... ¿qué ponemos aquí?
        throw new UnsupportedOperationException("Un carro no vuela.");
    }

    @Override
    public void navegar() {
        throw new UnsupportedOperationException("Un carro no navega.");
    }
}