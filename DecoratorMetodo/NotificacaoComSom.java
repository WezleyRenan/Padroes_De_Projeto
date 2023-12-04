package DecoratorMetodo;

public class NotificacaoComSom extends NotificacaoDecorator { //classe decorativa, extende a classe decorator
	

	public NotificacaoComSom(Notificacao umaNotificacao) { // Construtor
		super(umaNotificacao);
		exibirMensagem = "Notificação com Som!";
	}

}
