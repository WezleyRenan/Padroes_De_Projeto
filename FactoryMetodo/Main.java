package FactoryMetodo;
// FactoryMethodExample.java

public class Main {
    public static void main(String[] args) {
        // Crie uma fábrica para caminhões
        FabricaTransporte fabricaCaminhao = new FabricaCaminhao();

        // Use a fábrica para criar um objeto de caminhão
        Transporte caminhao = fabricaCaminhao.criarTransporte();
        caminhao.entregar();

        // Repita o processo para navios e aviões
        FabricaTransporte fabricaNavio = new FabricaNavio();
        Transporte navio = fabricaNavio.criarTransporte();
        navio.entregar();

        FabricaTransporte fabricaAviao = new FabricaAviao();
        Transporte aviao = fabricaAviao.criarTransporte();
        aviao.entregar();
    }
}