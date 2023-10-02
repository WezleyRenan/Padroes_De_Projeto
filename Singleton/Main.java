public class Main {
    public static void main(String[] args) {
        // 4. Obtendo a instância do Singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // 5. Verificando se as duas variáveis apontam para a mesma instância
        if (singleton1 == singleton2) {
            System.out.println("As duas variáveis apontam para a mesma instância do Singleton.");
        }

        // 6. Usando métodos da instância Singleton
        singleton1.doSomething();
    }
}