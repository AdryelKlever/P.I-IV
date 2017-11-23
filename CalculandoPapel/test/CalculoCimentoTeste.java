import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
    public void testEnviaSetAreia() {
        System.out.println("Enviar Areia");
        float envia = 60f;
        c.setAreia(envia);
        assertEquals(c.getAreia(), envia);
    }
    
    @Test
    public void testRetornaAreia() {
        System.out.println("Retorna Areia");
        float retorna = 60f;
        float resultado = c.getAreia();
        assertEquals(retorna, resultado);
        
    }
    
    @Test
    public void testEnviaSetPedra() {
        System.out.println("Enviar Pedra");
        float envia = 60f;
        c.setAreia(envia);
        assertEquals(c.getPedra(), envia);
    }
    
    @Test
    public void testRetornaGetPedra() {
        System.out.println("Retorna Pedra");
        float retorna = 60f;
        float resultado = c.getPedra();
        assertEquals(retorna, resultado);
        
    }
    
    @Test
    public void testEnviaSetCimento() {
        System.out.println("Enviar Cimento");
        float envia = 480f;
        c.setAreia(envia);
        assertEquals(c.getCimento(), envia);
    }
    
    @Test
    public void testRetornaGetCimento() {
        System.out.println("Retorna Cimento");
        float retorna = 480f;
        float resultado = c.getCimento();
        assertEquals(retorna, resultado);
        
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
