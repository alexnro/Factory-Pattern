package org.lasencinas;

public class LavadoraCargaFrontalFactoria extends FactoriaLavadora {

    @Override
    protected Lavadora creaLavadoraTipo() {
        return new LavadoraCargaFrontal();
    }
}
