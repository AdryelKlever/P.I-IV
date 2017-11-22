import java.util.Objects;
import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculoMetroQuadradoTest {
    
    CalculoMetroQuadrado instance;
    
    public CalculoMetroQuadradoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new CalculoMetroQuadrado();
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testSomaDivisao2() {
        assertEquals(4, instance.somaDivisao2(2000, 2000));
    }

   
    @Test
    public void testSomaDivisaoMultiplicacao2() {
        assertEquals(16, instance.somaDivisaoMultiplicacao2(2000, 2000, 2000, 2000));
    }

    
    @Test
    public void testMultipicacao() {
        assertEquals(32, instance.multipicacao(2000, 2000, 2000, 2000, 2));
    }

    
    @Test
    public void testTotal() {
        System.out.println("Total");
        int expResult = 0;
        int result = instance.Total();
        assertEquals(expResult, result);
    }

    
    @Test
    public void testGetLargura() {
        System.out.println("getLargura");
        int expResult = 0;
        int result = instance.getLargura();
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSetLargura() {
        System.out.println("setLargura");
        int largura = 0;
        instance.setLargura(largura);
    }

    
    @Test
    public void testGetAlturaMilimetro() {
        System.out.println("getAlturaMilimetro");
        int expResult = 0;
        int result = instance.getAlturaMilimetro();
        assertEquals(expResult, result);
    }

   
    @Test
    public void testSetAlturaMilimetro() {
        System.out.println("setAlturaMilimetro");
        int alturaMilimetro = 0;
        instance.setAlturaMilimetro(alturaMilimetro);
    }

    
    @Test
    public void testGetQtd() {
        System.out.println("getQtd");
        int expResult = 0;
        int result = instance.getQtd();
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSetQtd() {
        System.out.println("setQtd");
        int qtd = 0;
        instance.setQtd(qtd);
    }

    
    @Test
    public void testSetAlturaEsquelto() {
        System.out.println("setAlturaEsquelto");
        int alturaEsqueleto = 0;
        instance.setAlturaEsquelto(alturaEsqueleto);
    }

    
    @Test
    public void testGetAlturaEsqueleto() {
        System.out.println("getAlturaEsqueleto");
        int expResult = 0;
        int result = instance.getAlturaEsqueleto();
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSetEsqueleto() {
        System.out.println("setEsqueleto");
        int esqueleto = 0;
        instance.setEsqueleto(esqueleto);
    }

    
    @Test
    public void testGetEsqueleto() {
        System.out.println("getEsqueleto");
        int expResult = 0;
        int result = instance.getEsqueleto();
        assertEquals(expResult, result);
    }
    
}
