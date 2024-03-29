package org.lasencinas;

public abstract class FactoriaLavadora {

    public Lavadora creaLavadora() {
        Lavadora lavadora = creaLavadoraTipo();
        lavadora.ponerMandos();
        lavadora.ponerTambor();
        return lavadora;
    }

    protected abstract Lavadora creaLavadoraTipo();
}
