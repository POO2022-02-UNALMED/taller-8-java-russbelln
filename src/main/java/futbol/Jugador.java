package futbol;

public class Jugador extends Futbolista{
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion, short golesMarcadis, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcadis;
        this.dorsal = dorsal;
    }

    public Jugador(String nombre, int edad, String posicion) {
        super(nombre, edad, posicion);
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    @Override
    public boolean jugarConLasManos() {
        return false;
    }

    @Override
    public int compareTo(Futbolista o) {
        return Math.abs(o.getEdad()-this.getEdad());
    }

    @Override
    public String toString() {
        return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+", y juega de "+this.getPosicion()+" con el dorsal "+this.dorsal+". Ha marcado "+this.golesMarcados;
    }
}
