package FactoryMetodo;
// Caminhao.java

public class Caminhao implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entregando via caminhão.");
    }
}