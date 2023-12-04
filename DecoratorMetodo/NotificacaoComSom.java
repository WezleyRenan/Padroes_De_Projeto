package Atividade7;

public class NotificacaoComSom extends NotificacaoDecorator {
	
	public NotificacaoComSom(Notificacao umaNotificacao) {
		super(umaNotificacao);
		exibirMensagem = "Notificação comm Som!";
	}

}
