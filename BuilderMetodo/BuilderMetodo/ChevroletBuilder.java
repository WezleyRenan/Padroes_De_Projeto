package BuilderMetodo;

public class ChevroletBuilder implements CarroBuilder {
    private String ModeloCarro;
    private String TipoDeLataria;
    private double preco;
    private boolean teto;

    public void buildModeloCarro(){
        ModeloCarro = "Chevrolet 2025";
    }
    public void buildTipoDeLataria(){
        TipoDeLataria = "Ferro";
    }
    public void buildPreco(){
        preco = 12000 ;
    } 
    public void buildTeto(){
        teto = true;
    }
    public CarroProduto GetCarro(){
        return new CarroProduto(ModeloCarro,TipoDeLataria,preco,teto);
    }

}

