package AbstractFactoryMetodo;

// Implementação concreta do produto Caixa de Texto para estilo clássico
class CaixaDeTextoClassica implements CaixaDeTexto {
    public void renderizar() {
        System.out.println("Caixa de texto clássica renderizada");
    }
}
