package FactoryMetodo;
// Aviao.java

public class Aviao implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entregando via avião.");
    }
}