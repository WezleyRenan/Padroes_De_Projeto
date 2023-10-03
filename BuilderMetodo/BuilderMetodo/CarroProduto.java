package BuilderMetodo;

 public class CarroProduto {
    private String ModeloCarro;
    private String TipoDeLataria;
    private double preco;
    private boolean teto;

    public CarroProduto(String ModeloCarro, String TipoDeLataria, double preco, boolean teto) {
        this.ModeloCarro = ModeloCarro;
        this.TipoDeLataria = TipoDeLataria;
        this.preco = preco;
        this.teto = true;
    }
    public String toString() {
        return "Modelo do carro: " + ModeloCarro + " \n" + "Lataria: " + TipoDeLataria + " \n" + "Preço: " + preco + " \n" + "Teto: " + teto;
    }
}