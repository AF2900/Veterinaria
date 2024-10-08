package co.edu.uniquindio.poo;

public class TipoSalvaje extends Animal {
    
   public TipoSalvaje(String nombre, int edad, double peso, String especie, String raza, String tratamiento){
    super(nombre, edad, peso, especie, raza, tratamiento);
   }

   @Override
   public String toString(){
        return super.toString();
    } 
}