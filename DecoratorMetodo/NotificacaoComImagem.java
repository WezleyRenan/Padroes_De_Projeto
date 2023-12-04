package DecoratorMetodo;

public class NotificacaoComImagem extends NotificacaoDecorator { //classe decorativa, extende a classe decorator

	public NotificacaoComImagem(Notificacao umaNotificacao) { //construtor com o diferencial
		super(umaNotificacao);
		exibirMensagem = "Notificação com imagem!";
	}

}
