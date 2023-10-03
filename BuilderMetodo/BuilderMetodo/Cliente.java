package BuilderMetodo;

public class Cliente {
    public static void main(String[] args) {

        CarroBuilder construtoraFiat = new FiatBuilder();
        CarroBuilder construtoraFord = new FordBuilder();
        CarroBuilder construtoraChevrolet = new ChevroletBuilder();
        Diretor diretor = new Diretor();

        CarroProduto carro = diretor.construirCarro(construtoraFiat);
        System.out.println("Carro Fiat sendo contruido...");
        System.out.println(carro);

        carro = diretor.construirCarro(construtoraFord);
        System.out.println(" ");
        System.out.println("Carro Ford Sendo Construindo");
        System.out.println(carro);

        carro = diretor.construirCarro(construtoraChevrolet);
        System.out.println(" ");
        System.out.println("Carro Chevrolet sendo construido");

        System.out.println(carro);


    }

}