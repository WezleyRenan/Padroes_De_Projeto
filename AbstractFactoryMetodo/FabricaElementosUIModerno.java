package AbstractFactoryMetodo;

// Implementação concreta da fábrica abstrata para estilo moderno
class FabricaElementosUIModerno implements FabricaElementosUI {
    public Botao criarBotao() {
        return new BotaoModerno();
    }

    public CaixaDeTexto criarCaixaDeTexto() {
        return new CaixaDeTextoModerna();
    }
}
