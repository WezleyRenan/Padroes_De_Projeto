package PrototypeMetodo;

class Carro implements VeiculoPrototype {
    private String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    @Override
    public VeiculoPrototype clonar() {
        return new Carro(this.marca);
    }

    @Override
    public String exibirInfo() {
        return "Carro da marca: " + marca;
    }
    
}
