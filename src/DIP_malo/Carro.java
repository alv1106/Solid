package DIP_malo;

public class Carro {
    private MotorGasolina motor = new MotorGasolina();
    
    //todo carro ahora tiene motor de gasolina

    public void arrancar() {
        motor.encender();
    }
}
