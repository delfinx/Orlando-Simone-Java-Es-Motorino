public class Motorino {
    private String colore;
    private float velocita;
    private String tipo;
    private boolean antifurto = false;

    public Motorino(String colore, float velocita, String tipo){
        this.colore = colore;
        this.velocita = velocita;
        this.tipo = tipo;
    }

    public float getVelocita() {
        return velocita;
    }

    public float accellera(float accellerazione){
        
        return antifurto == false ? velocita += accellerazione : velocita;
    }

    public boolean inserisciAntifurto(){
        antifurto = true;
        return antifurto;
    }
}
