package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class TestTipoDomestico {
    private static final Logger LOG = Logger.getLogger(TestTipoDomestico.class.getName());
    
    @Test
    public void testDatosVaciosDomestico() {
        LOG.info("Iniciando test DatosVacíos");
        
        assertThrows(Throwable.class, ()-> new TipoDomestico(" ", 0, 0, "", "", " ", " "));
        
        LOG.info("Finalizando test DatosVacíos");
    }

    @Test
    public void agregarTipoDomestico(){
        LOG.info("Iniciando test AgregarDomestico");
        
        Veterinaria veterinaria = new Veterinaria();
        TipoDomestico domestico1 = new TipoDomestico("Lucas", 4, 4.5, "Perro", "Pastor alemán", "fractura", "Mario");
        TipoDomestico domestico2 = new TipoDomestico("Zeus", 3, 3.4, "gato", "Siamés", "terapia", "Sofía");

        veterinaria.agregarDomestico(domestico1);
        veterinaria.agregarDomestico(domestico2);

        assertTrue(veterinaria.getListaDomesticos().contains(domestico1));
        assertTrue(veterinaria.getListaDomesticos().contains(domestico2));

        assertEquals(2, veterinaria.getListaDomesticos().size());

        LOG.info("Finalizando test AgregarDomestico");
    }

    @Test
    public void edadNegativa(){
        LOG.info("Iniciando test EdadNegativa");

        assertThrows(Throwable.class, ()-> new TipoDomestico("Lucas", -4, 4.5, "Perro", "Pastor alemán", "fractura", "Mario"));

        LOG.info("Finalizando test EdadNegativa");
    }

    @Test
    public void PesoNegativo(){
        LOG.info("Iniciando test PesoNegativo");

        assertThrows(Throwable.class, ()-> new TipoDomestico("Lucas", 4, -4.5, "Perro", "Pastor alemán", "fractura", "Mario"));

        LOG.info("Finalizando test PesoNegativo");
    }
}