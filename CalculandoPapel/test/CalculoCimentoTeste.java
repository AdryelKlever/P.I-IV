import java.util.Objects;
import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculoCimentoTeste {
    
    public CalculoCimento c;
    
    public CalculoCimentoTeste(){
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        c = new CalculoCimento();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testCalculoAreia(){
        System.out.println("Retorna Areia");
        float retorna = 180f;
        float resultado = c.calculoAreia();
        assertEquals(retorna, resultado);
    }
    
    @Test
    public void testcalculoPedra(){
        System.out.println("Retorna Pedra");
        float retorna = 180f;
        float resultado = c.calculoPedra();
        assertEquals(retorna, resultado);
    }
    
    @Test
    public void testcalculoCimento(){
        System.out.println("Retorna Cimento");
        float retorna = 1440f;
        float resultado = c.calculoCimento();
        assertEquals(retorna, resultado);
    }
}
