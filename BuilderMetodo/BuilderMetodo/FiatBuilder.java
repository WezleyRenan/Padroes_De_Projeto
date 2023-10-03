package BuilderMetodo;

public class FiatBuilder implements CarroBuilder {
    private String ModeloCarro;
    private String TipoDeLataria;
    private double preco;
    private boolean teto;

    public void buildModeloCarro(){
        ModeloCarro = "Fiat 2012";
    }
    public void buildTipoDeLataria(){
        TipoDeLataria = "Metalica";
    }
    public void buildPreco(){
        preco = 5000 ;
    } 
    public void buildTeto(){
        teto = true;
    }
    public CarroProduto GetCarro(){
        return new CarroProduto(ModeloCarro,TipoDeLataria,preco,teto);
    }

}