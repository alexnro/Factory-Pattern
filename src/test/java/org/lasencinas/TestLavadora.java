package org.lasencinas;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class TestLavadora {

    @Test
    public void test_carga_frontal() {

//        Lavadora lavadora = new LavadoraCargaFrontal();
//        lavadora.ponerMandos();
//        lavadora.ponerTambor();

        FactoriaLavadora factoria = new LavadoraCargaFrontalFactoria();
        assertNotNull(factoria);

        Lavadora lavadora = factoria.creaLavadora();
        assertNotNull(lavadora);

        Assert.assertEquals("frontal", lavadora.tipoCarga);
        Assert.assertTrue(lavadora.tieneMandos);
        Assert.assertTrue(lavadora.tieneTambor);
    }

    @Test
    public void test_carga_superior() {

//        Lavadora lavadora = new LavadoraCargaSuperior();
//        lavadora.ponerMandos();
//        lavadora.ponerTambor();

        FactoriaLavadora factoria = new LavadoraCargaSuperiorFactoria();
        assertNotNull(factoria);

        Lavadora lavadora = factoria.creaLavadora();
        assertNotNull(lavadora);

        Assert.assertEquals("superior", lavadora.tipoCarga);
        Assert.assertTrue(lavadora.tieneMandos);
        Assert.assertTrue(lavadora.tieneTambor);
    }

}