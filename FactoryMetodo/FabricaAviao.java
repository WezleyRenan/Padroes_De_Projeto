package FactoryMetodo;
// FabricaAviao.java

public class FabricaAviao implements FabricaTransporte {
    @Override
    public Transporte criarTransporte() {
        return new Aviao();
    }
}