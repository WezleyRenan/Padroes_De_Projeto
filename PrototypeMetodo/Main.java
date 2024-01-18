package PrototypeMetodo;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Crie um registro de protótipos
        Map<String, VeiculoPrototype> registro = new HashMap<>();

        // Adicione protótipos de carros e motos ao registro
        registro.put("carro", new Carro("Toyota"));
        registro.put("moto", new Moto("Honda"));

        // Cliente cria novos veículos com base nos protótipos
        VeiculoPrototype carroNovo = registro.get("carro").clonar();
        VeiculoPrototype motoNova = registro.get("moto").clonar();

        // Exibe informações dos novos veículos
        System.out.println(carroNovo.exibirInfo());
        System.out.println(motoNova.exibirInfo());
    }
}
