package SingletonMetodo;

public class Log {
    // 1. Variável estática privada para armazenar a instância única
    private static Log instance;
    int numeroOperaçao = 0;

    // 2. Construtor privado para evitar a criação de instâncias diretas
    private Log() {
        // Qualquer lógica de inicialização desejada aqui
        System.out.println("iniciado uma operação Numero: ");
    }

    // 3. Método público para obter a instância única (com inicialização preguiçosa)
    public static Log getInstance() {
        if (instance == null) {
            instance = new Log();
        }
        return instance;
    }

    // Adicione métodos e propriedades adicionais conforme necessário
    public void retornar(String operação) {
        System.out.println("Foi feita uma operação de: " + operação + "// da conta de numero: " + ++numeroOperaçao);
    }
}