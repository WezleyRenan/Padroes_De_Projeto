package Atividade7;

public class NotificacaoComImagem extends NotificacaoDecorator {

	public NotificacaoComImagem(Notificacao umaNotificacao) {
		super(umaNotificacao);
		exibirMensagem = "Notifica��o com imagem!";
	}

}
