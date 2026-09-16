// Bicicleta ya no promete algo que no puede cumplir
package LSP;
public class Bicicleta extends Vehiculo {
    public Bicicleta(String marca, int velocidadMax) {
        super(marca, velocidadMax);
    }

    @Override
    public void acelerar() {
        System.out.println(marca + " acelera con pedaleo.");
    }
}