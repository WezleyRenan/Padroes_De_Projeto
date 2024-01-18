package AbstractFactoryMetodo;

// Implementação concreta do produto Botão para estilo clássico
class BotaoClassico implements Botao {
    public void renderizar() {
        System.out.println("Botão clássico renderizado");
    }
}
