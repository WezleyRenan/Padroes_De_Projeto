package DecoratorMetodo;

public abstract class NotificacaoDecorator extends Notificacao { //Classe Decorator geralmente extende a classe principal

	Notificacao notificacao; //atributo da classe principal
	
	public NotificacaoDecorator(Notificacao umaNotificacao) { 	//construtor
		this.notificacao = umaNotificacao;
	}
	

	public String getExibirMensagem() { //metodo de exibir mensagem
		return notificacao.getExibirMensagem() + " + " + exibirMensagem;
	}

}

