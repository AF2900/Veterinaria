package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        Veterinaria veterinaria = new Veterinaria();
        TipoDomestico domestico1 = new TipoDomestico("Lucas", 4, 4.5, "Perro", "Pastor alemán", "fractura", "Mario");
        TipoDomestico domestico2 = new TipoDomestico("Zeus", 3, 3.4, "gato", "Siamés", "terapia", "Sofía");
        TipoSalvaje salvaje1 = new TipoSalvaje("Douglas", 2, 68.8, "León", "León asiático", "terapia");
        TipoSalvaje salvaje2 = new TipoSalvaje("estrella", 5, 45.6, "Puma", "Puma concolor", "medicina");

        veterinaria.agregarDomestico(domestico1);
        veterinaria.agregarDomestico(domestico2);
        veterinaria.agregarSalvaje(salvaje1);
        veterinaria.agregarSalvaje(salvaje2);

        veterinaria.mostrarDomestico();
        veterinaria.mostrarSalvaje();

        veterinaria.mostrarMensaje(veterinaria.toString());
    }
}