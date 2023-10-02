public class Singleton {
    // 1. Variável estática privada para armazenar a instância única
    private static Singleton instance;

    // 2. Construtor privado para evitar a criação de instâncias diretas
    private Singleton() {
        // Qualquer lógica de inicialização desejada aqui
        System.out.println("Singleton foi criado.");
    }

    // 3. Método público para obter a instância única (com inicialização preguiçosa)
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Adicione métodos e propriedades adicionais conforme necessário
    public void doSomething() {
        System.out.println("Singleton está fazendo algo.");
    }
}