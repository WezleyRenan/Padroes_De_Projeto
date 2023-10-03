package BuilderMetodo;

public class FordBuilder implements CarroBuilder {
    private String ModeloCarro;
    private String TipoDeLataria;
    private double preco;
    private boolean teto;

    public void buildModeloCarro(){
        ModeloCarro = "fordCar 2001";
    }
    public void buildTipoDeLataria(){
        TipoDeLataria = "Plastico";
    }
    public void buildPreco(){
        preco = 2750 ;
    } 
    public void buildTeto(){
        teto = false;
    }
    public CarroProduto GetCarro(){
        return new CarroProduto(ModeloCarro,TipoDeLataria,preco,teto);
    }

}
