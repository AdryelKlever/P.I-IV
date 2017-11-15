import java.util.Objects;
import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eduardo Alves
 */
public class CalculoTintaTest {
    
        public CalculoTinta c;
        
    public CalculoTintaTest() {
        
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        c = new CalculoTinta();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCalculoTinta() {
        System.out.println("Retorna calculo");
        CalculoTinta c = new CalculoTinta();
        float retorna = 0.18130311f;
        float resultado = c.calculoTinta();
        assertEquals(retorna, resultado);
    }

    @Test
    public void testEnviaSetSubstrato() {
        System.out.println("Envia Substrato");
        float envia = 2f;
        CalculoTinta c = new CalculoTinta();
        c.setSubstrato(envia);
        assertEquals(c.getSubstrato(), envia);
    }

    @Test
    public void testRetornaGetSubstrato() {
        System.out.println("Retorna Substrato");
        CalculoTinta c = new CalculoTinta();
        float envia = 2f;
        float resultado = c.getSubstrato();
        assertEquals(envia, resultado);
    }

    @Test
    public void testEnviaSetProcessoImpressao() {
        System.out.println("Envia ProcessoImpressao");
        float envia = 2f;
        CalculoTinta c = new CalculoTinta();
        c.setProcessoImpressao(envia);
        assertEquals(c.getProcessoImpressao(), envia);
    }

    @Test
    public void testRetornaGetProcessoImpressao() {
        System.out.println("Retorna ProcessoImpressao");
        CalculoTinta instance = new CalculoTinta();
        float retorna = 2f;
        float resultado = instance.getProcessoImpressao();
        assertEquals(retorna, resultado);
    }

    @Test
    public void testEnviaSetAreaImpressao() {
        System.out.println("Envia AreaImpressao");
        float envia = 2f;
        CalculoTinta c = new CalculoTinta();
        c.setAreaImpressao(envia);
        assertEquals(c.getAreaImpressao(), envia);
    }

    @Test
    public void testRetornaGetAreaImpressao() {
        System.out.println("Retorna AreaImpressao");
        CalculoTinta instance = new CalculoTinta();
        float retorna = 2f;
        float resultado = instance.getAreaImpressao();
        assertEquals(retorna, resultado);

    }

    @Test
    public void testEnviaSetTiragemImpressao() {
        System.out.println("Envia TiragemImpressao");
        float envia = 2f;
        CalculoTinta c = new CalculoTinta();
        c.setTiragemImpressao(envia);
        assertEquals(c.getTiragemImpressao(), envia);
    }


    @Test
    public void testRetornaGetTiragemImpressao() {
        System.out.println("Retorna TiragemImpressao");
        CalculoTinta c = new CalculoTinta();
        float retorna = 2f;
        float resultado = c.getTiragemImpressao();
        assertEquals(retorna, resultado);
    }


    @Test
    public void testEnviaSetTipoGrafismo() {
        System.out.println("Envia TipoGrafismo");
        float envia = 2f;
        CalculoTinta c = new CalculoTinta();
        c.setTipoGrafismo(envia);
        assertEquals(c.getTipoGrafismo(), envia);
    }


    @Test
    public void testRetornaGetTipoGrafismo() {
        System.out.println("Retorna TipoGrafismo");
        CalculoTinta c = new CalculoTinta();
        float retorna = 2f;
        float resultado = c.getTipoGrafismo();
        assertEquals(retorna, resultado);

    }

    @Test
    public void testEnviaSetPesoEspecifico() {
        System.out.println("Envia PesoEspecifico");
        float envia = 2f;
        CalculoTinta c = new CalculoTinta();
        c.setPesoEspecifico(envia);
        assertEquals(c.getPesoEspecifico(), envia);
    }

    @Test
    public void testRetornaGetPesoEspecifico() {
        System.out.println("Retorna PesoEspecifico");
        CalculoTinta c = new CalculoTinta();
        float retorna = 2f;
        float resultado = c.getPesoEspecifico();
        assertEquals(retorna, resultado);
    }
    
}
