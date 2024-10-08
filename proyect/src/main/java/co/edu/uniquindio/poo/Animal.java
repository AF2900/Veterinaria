package co.edu.uniquindio.poo;

public class Animal {
    public String nombre;
    public int edad;
    public double peso;
    public String especie;
    public String raza;
    public String tratamiento;

    public Animal (String nombre, int edad, double peso, String especie, String raza, String tratamiento){
        this.nombre=nombre;
        this.edad=edad;
        this.peso=peso;
        this.especie=especie;
        this.raza=raza;
        this.tratamiento=tratamiento;
        assert !nombre.isBlank();
        assert edad>0;
        assert peso>0;
        assert !especie.isBlank();
        assert !raza.isBlank();
        assert !tratamiento.isBlank();
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", especie=" + especie + ", raza="
                + raza + ", tratamiento=" + tratamiento + "]";
    }
}