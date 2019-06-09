package org.lasencinas;

public class LavadoraCargaSuperiorFactoria extends FactoriaLavadora {

    @Override
    public Lavadora creaLavadoraTipo() {
        return new LavadoraCargaSuperior();
    }

}
