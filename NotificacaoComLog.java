package Atividade7;

public class NotificacaoComLog extends NotificacaoDecorator {

	public NotificacaoComLog(Notificacao umaNotificacao) {
		super(umaNotificacao);
		exibirMensagem = "notifica��o com arquivo log";
	}

}
