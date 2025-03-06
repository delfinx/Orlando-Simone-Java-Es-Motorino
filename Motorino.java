public class Motorino {
    private String colore;
    public float velocita;
    private String tipo;
    public boolean antifurto = false;

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
