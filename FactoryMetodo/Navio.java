package FactoryMetodo;

// Navio.java

public class Navio implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entregando via navio.");
    }
}
