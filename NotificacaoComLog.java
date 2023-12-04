package Atividade7;

public class NotificacaoComLog extends NotificacaoDecorator {

	public NotificacaoComLog(Notificacao umaNotificacao) {
		super(umaNotificacao);
		exibirMensagem = "notificação com arquivo log";
	}

}
