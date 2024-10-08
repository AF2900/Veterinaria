package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class TestTipoSalvaje {
    private static final Logger LOG = Logger.getLogger(TestTipoSalvaje.class.getName());

    @Test
    public void testDatosVaciosSalvaje() {
        LOG.info("Iniciando test DatosVacíos");
        
        assertThrows(Throwable.class, ()-> new TipoSalvaje(" ", 0, 0, " ", " ", " "));
        
        LOG.info("Finalizando test DatosVacíos");
    }

    @Test
    public void agregarTipoSalvaje(){
        LOG.info("Iniciando test AgregarSalvaje");
        
        Veterinaria veterinaria = new Veterinaria();
        TipoSalvaje salvaje1 = new TipoSalvaje("Douglas", 2, 68.8, "León", "León asiático", "terapia");
        TipoSalvaje salvaje2 = new TipoSalvaje("estrella", 5, 45.6, "Puma", "Puma concolor", "medicina");

        veterinaria.agregarSalvaje(salvaje1);
        veterinaria.agregarSalvaje(salvaje2);

        assertTrue(veterinaria.getListaSalvajes().contains(salvaje1));
        assertTrue(veterinaria.getListaSalvajes().contains(salvaje2));

        assertEquals(2, veterinaria.getListaSalvajes().size());

        LOG.info("Finalizando test AgregarSalvaje");
    }

    @Test
    public void edadNegativa(){
        LOG.info("Iniciando test EdadNegativa");

        assertThrows(Throwable.class, ()-> new TipoSalvaje("Douglas", -2, 68.8, "León", "León asiático", "terapia"));

        LOG.info("Finalizando test EdadNegativa");
    }

    @Test
    public void PesoNegativo(){
        LOG.info("Iniciando test PesoNegativo");

        assertThrows(Throwable.class, ()-> new TipoSalvaje("Douglas", 2, -68.8, "León", "León asiático", "terapia"));

        LOG.info("Finalizando test PesoNegativo");
    }
    
}