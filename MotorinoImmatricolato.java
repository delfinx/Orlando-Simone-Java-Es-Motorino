public class MotorinoImmatricolato extends Motorino{
    private float maxVelocita;
    private String marca;

    public MotorinoImmatricolato(float maxVelocita, String marca){
        super("Motorino", 35.75f, "Suzuki");
        this.maxVelocita = maxVelocita;
        this.marca = marca;
    }

    public void getMax() {
        System.out.println(maxVelocita);
    }

    @Override
    public float accellera(float accellerazione){
        float s = 0;
        if(velocita < maxVelocita){
            s =  antifurto == false ? velocita += accellerazione : velocita;
            s += velocita;
            if(s < maxVelocita){
                maxVelocita = s;
            }
            else{
                velocita = maxVelocita;
            }
            return s;
        }
        else{
            return 0;
        }

    }
}
