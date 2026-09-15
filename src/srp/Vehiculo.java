package srp;
public class Vehiculo{
    private String marca;
    private int velocidadMax;

    public Vehiculo(String marca, int velocidadMax){
        this.marca = marca;
        this.velocidadMax = velocidadMax;
    }

    public void acelerar(){
        System.out.println(marca + " esta acelerando");
    }
    public void velocidadMax(){
        System.out.println(marca + " velocidad maxima : "+ velocidadMax);
    }

    public String getMarca(){
        return this.marca;
    }

    
}