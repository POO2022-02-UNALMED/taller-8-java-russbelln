package futbol;

import javax.swing.plaf.FontUIResource;

public abstract class Futbolista implements Comparable<Futbolista> {
    private String nombre;
    private int edad;
    private String posicion;

    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public Futbolista(){
        this.nombre = "Maradona";
        this.edad = 30;
        this.posicion = "delantero";
    }

    @Override
    public String toString() {
        return "El futbolista "+this.nombre+" tiene "+this.edad+", y juega de "+this.posicion;
    }


    public abstract boolean jugarConLasManos();

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public int compareTo(Futbolista o) {
        return 0;
    }
}
