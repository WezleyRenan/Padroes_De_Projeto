package BuilderMetodo;

public class Diretor {

    public CarroProduto construirCarro(CarroBuilder fabricaDeCarro) {
        fabricaDeCarro.buildModeloCarro();
        fabricaDeCarro.buildPreco();
        fabricaDeCarro.buildTeto();
        fabricaDeCarro.buildTipoDeLataria();
        return fabricaDeCarro.GetCarro();

    }

}