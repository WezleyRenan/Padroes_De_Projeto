package PrototypeMetodo;

class Moto implements VeiculoPrototype {
    private String marca;

    public Moto(String marca) {
        this.marca = marca;
    }

    @Override
    public VeiculoPrototype clonar() {
        return new Moto(this.marca);
    }

    @Override
    public String exibirInfo() {
        return "Moto da marca: " + marca;
    }
}
