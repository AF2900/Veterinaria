package co.edu.uniquindio.poo;

public class TipoDomestico extends Animal {
    private String dueño;

    public TipoDomestico(String nombre, int edad, double peso, String especie, String raza, String tratamiento, String dueño){
        super(nombre, edad, peso, especie, raza, tratamiento);
        this.dueño=dueño;
        assert !dueño.isBlank();
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}