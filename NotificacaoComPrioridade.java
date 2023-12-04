package Atividade7;

public class NotificacaoComPrioridade extends NotificacaoDecorator {
	
	boolean prioridade = false;

	public NotificacaoComPrioridade(Notificacao umaNotificacao) {
		super(umaNotificacao);
		exibirMensagem = "notificação com prioridade";
		prioridade = true;
	}
	
	

}
