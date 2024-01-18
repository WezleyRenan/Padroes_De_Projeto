package AbstractFactoryMetodo;

// Implementação concreta da fábrica abstrata para estilo clássico
class FabricaElementosUIClassico implements FabricaElementosUI {
    public Botao criarBotao() {
        return new BotaoClassico();
    }

    public CaixaDeTexto criarCaixaDeTexto() {
        return new CaixaDeTextoClassica();
    }
}