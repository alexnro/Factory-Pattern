package org.lasencinas;

import org.junit.Assert;
import org.junit.Test;

public class TestLavadora {

    @Test
    public void test_carga_frontal() {

        Lavadora lavadora = new LavadoraCargaFrontal();
        lavadora.ponerMandos();
        lavadora.ponerTambor();

        Assert.assertEquals("frontal", lavadora.tipoCarga);
        Assert.assertTrue(lavadora.tieneMandos);
        Assert.assertTrue(lavadora.tieneTambor);
    }

    @Test
    public void test_carga_superior() {

        Lavadora lavadora = new LavadoraCargaSuperior();
        lavadora.ponerMandos();
        lavadora.ponerTambor();

        Assert.assertEquals("superior", lavadora.tipoCarga);
        Assert.assertTrue(lavadora.tieneMandos);
        Assert.assertTrue(lavadora.tieneTambor);
    }

}