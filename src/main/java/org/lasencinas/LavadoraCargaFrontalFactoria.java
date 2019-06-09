package org.lasencinas;

public class LavadoraCargaFrontalFactoria extends FactoriaLavadora {

    @Override
    public Lavadora creaLavadoraTipo() {
        return new LavadoraCargaFrontal();
    }
}
