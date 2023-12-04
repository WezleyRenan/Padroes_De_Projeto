package DecoratorMetodo;

public abstract class NotificacaoDecorator extends Notificacao {
	
	Notificacao notificacao;
	
	public NotificacaoDecorator(Notificacao umaNotificacao) {
		notificacao = umaNotificacao;
	}
	

	public String getExibirMensagem() {
		return notificacao.getExibirMensagem() + " + " + exibirMensagem;
	}

}
