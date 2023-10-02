package SingletonMetodo;

public class Main {
    public static void main(String[] args) {
        // 4. Obtendo a instância do Singleton
        Log singleton1 = Log.getInstance();
        Log singleton2 = Log.getInstance();
        Log singleton3 = Log.getInstance();
        Log singleton4 = Log.getInstance();

        
        // 6. Usando métodos #1 da instância Singleton
        singleton1.retornar("Adição");
        singleton2.retornar("Subtração");
        singleton3.retornar("Multiplicação");
        singleton4.retornar("divisão");
    }
}