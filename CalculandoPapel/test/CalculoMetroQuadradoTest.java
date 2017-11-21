

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
        System.out.println("somaDivisao2");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = instance.somaDivisao2(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    @Test
    public void testSomaDivisaoMultiplicacao2() {
        System.out.println("somaDivisaoMultiplicacao2");
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int expResult = 0;
        int result = instance.somaDivisaoMultiplicacao2(a, b, c, d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testMultipicacao() {
        System.out.println("multipicacao");
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int expResult = 0;
        int result = instance.multipicacao(a, b, c, d, e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testTotal() {
        System.out.println("Total");
        int expResult = 0;
        int result = instance.Total();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetLargura() {
        System.out.println("getLargura");
        int expResult = 0;
        int result = instance.getLargura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetLargura() {
        System.out.println("setLargura");
        int largura = 0;
        instance.setLargura(largura);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetAlturaMilimetro() {
        System.out.println("getAlturaMilimetro");
        int expResult = 0;
        int result = instance.getAlturaMilimetro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    @Test
    public void testSetAlturaMilimetro() {
        System.out.println("setAlturaMilimetro");
        int alturaMilimetro = 0;
        instance.setAlturaMilimetro(alturaMilimetro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetQtd() {
        System.out.println("getQtd");
        int expResult = 0;
        int result = instance.getQtd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetQtd() {
        System.out.println("setQtd");
        int qtd = 0;
        instance.setQtd(qtd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetAlturaEsquelto() {
        System.out.println("setAlturaEsquelto");
        int alturaEsqueleto = 0;
        instance.setAlturaEsquelto(alturaEsqueleto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetAlturaEsqueleto() {
        System.out.println("getAlturaEsqueleto");
        int expResult = 0;
        int result = instance.getAlturaEsqueleto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetEsqueleto() {
        System.out.println("setEsqueleto");
        int esqueleto = 0;
        instance.setEsqueleto(esqueleto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetEsqueleto() {
        System.out.println("getEsqueleto");
        int expResult = 0;
        int result = instance.getEsqueleto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
