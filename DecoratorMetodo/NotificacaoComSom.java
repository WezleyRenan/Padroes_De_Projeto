package DecoratorMetodo;

public class NotificacaoComSom extends NotificacaoDecorator {
	
	public NotificacaoComSom(Notificacao umaNotificacao) {
		super(umaNotificacao);
		exibirMensagem = "Notifica��o comm Som!";
	}

}
