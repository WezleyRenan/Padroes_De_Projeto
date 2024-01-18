package AbstractFactoryMetodo;

public class Programa {
    public static void main(String[] args) {
        // Escolhendo a fábrica abstrata de estilo moderno
        FabricaElementosUI fabricaModerna = new FabricaElementosUIModerno();
        Botao botaoModerno = fabricaModerna.criarBotao();
        CaixaDeTexto caixaModerna = fabricaModerna.criarCaixaDeTexto();

        // Renderizando elementos de estilo moderno
        botaoModerno.renderizar();
        caixaModerna.renderizar();

        // Trocando para a fábrica de estilo clássico
        FabricaElementosUI fabricaClassica = new FabricaElementosUIClassico();
        Botao botaoClassico = fabricaClassica.criarBotao();
        CaixaDeTexto caixaClassica = fabricaClassica.criarCaixaDeTexto();

        // Renderizando elementos de estilo clássico
        botaoClassico.renderizar();
        caixaClassica.renderizar();
    }
}
