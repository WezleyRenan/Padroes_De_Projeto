package DecoratorMetodo;

public class NotificacaoComPrioridade extends NotificacaoDecorator {
	
	boolean prioridade = false;

	public NotificacaoComPrioridade(Notificacao umaNotificacao) {
		super(umaNotificacao);
		exibirMensagem = "notifica��o com prioridade";
		prioridade = true;
	}
	
	

}
