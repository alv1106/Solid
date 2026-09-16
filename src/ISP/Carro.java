public class Carro implements Terrestre {//el carro solo va por tierra, no necesita implementar mas interfaces
    @Override
    public void andarEnTierra() {
        System.out.println("El carro anda por la carretera.");
        // no es necesario hacer excepciones porque no implementa cosas innecesarias
    }
}