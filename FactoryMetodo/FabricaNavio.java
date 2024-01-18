package FactoryMetodo;
// FabricaNavio.java

public class FabricaNavio implements FabricaTransporte {
    @Override
    public Transporte criarTransporte() {
        return new Navio();
    }
}