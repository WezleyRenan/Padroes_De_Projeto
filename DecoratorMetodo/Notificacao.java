package DecoratorMetodo;

public abstract class Notificacao { //Classe Principal

	String exibirMensagem; //atributo de mensagem
	
	public String getExibirMensagem() { //retornar a mensagem
		return exibirMensagem;
	}
	public void setExibirMensagem(String exibirMensagem) {
        this.exibirMensagem = exibirMensagem;
    }
	
}
