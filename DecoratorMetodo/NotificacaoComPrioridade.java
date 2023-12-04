package DecoratorMetodo;

public class NotificacaoComPrioridade extends NotificacaoDecorator { //classe decorativa, extende a classe decorator
	
	boolean prioridade;

	public NotificacaoComPrioridade(Notificacao umaNotificacao) { //Construtor
		super(umaNotificacao);
		exibirMensagem = "notificação com prioridade" + "/n prioridade:" + prioridade;
		prioridade = true;
	}
	
	

}
