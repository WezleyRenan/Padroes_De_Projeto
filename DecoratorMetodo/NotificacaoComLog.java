package DecoratorMetodo;

public class NotificacaoComLog extends NotificacaoDecorator { //classe decorativa, extende a classe decorator

	public NotificacaoComLog(Notificacao umaNotificacao) { //Construtor
		super(umaNotificacao);
		exibirMensagem = "notificação com arquivo log";
	}

}
