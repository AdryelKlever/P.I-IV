import java.util.Objects;
import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculoTest {
    
    public Calculo c;

    public CalculoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        c = new Calculo();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of somaDivisao method, of class Calculo.
     */
    @Test
    public void testSomaDivisao() {
        assertEquals(4, c.somaDivisao(200, 200));
       
    }

    
    @Test
    public void testsomaMutiplicacao() {
        assertEquals(8, c.somaDivisaoMutiplicacao(200, 200, 2));
        
    }

    
    @Test
    public void testsomaDivisaoMutiplicacaoDivisao() {
        assertEquals(4, c.somaDivisiaoMutiplicacaoDivisao(200, 200, 2, 2));
       
    }
    
    @Test
    public void testcalculo(){
        System.out.println("Retorna calculo");
        float retorna = 1.4f;
        float resultado = c.calculo();
        assertEquals(retorna, resultado);
    }
    
    @Test
    public void testRetornaGetAltura() {
        System.out.println("Retorna a Altura");
        float retorna = 40f;
        float resultado = c.getAltura();
        assertEquals(retorna, resultado);
    
    }
    
    @Test
    public void testEnviaSetAltura() {
        System.out.println("Enviar altura");
        float envia = 40f;
        c.setAltura(envia);
        assertEquals(c.getAltura(), envia);
   
     
    }
       

    
    @Test
    public void testEnviaSetAlturaMedia() {
        System.out.println("Enviar altura media");
        float envia = 2f;
        c.setAlturaMedia(envia);
        assertEquals(c.getAlturaMedia(), envia);
   
     
    }

    
    @Test
    public void testRetornaGetAlturaMedia() {
        System.out.println("Retorna a Altura Media");
        float retorna = 2f;
        float resultado = c.getAlturaMedia();
        assertEquals(retorna, resultado);
        
    }
   
    @Test
    public void testRetornaGetMontagemLateral() {
        System.out.println("Retorna a Montagem Lateral");
        float retorna = 3f;
        float resultado = c.getMontagemLateral();
        assertEquals(retorna, resultado);
        
    }

  
    @Test
    public void testEnviaSetMontagemLateral() {
        System.out.println("Enviar Montagem Lateral");
        float envia = 3f;
        c.setMontagemLateral(envia);
        assertEquals(c.getMontagemLateral(), envia);

    }

    
    @Test
    public void testRetornaGetEtiquetasUnidades() {
        System.out.println("Retorna a quantidade de etiquetas por unidade ");
        float retorna = 100f;
        float resultado = c.getEtiquetasUnidades();
        assertEquals(retorna, resultado);
      
    }

    
    @Test
    public void testSetEtiquetasUnidades() {
        System.out.println("Enviar quantidade de etiquetas");
        float envia = 100f;
        c.setEtiquetasUnidades(envia);
        assertEquals(c.getEtiquetasUnidades(), envia);
        
    }
    
}
