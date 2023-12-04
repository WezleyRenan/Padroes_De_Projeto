package DecoratorMetodo;
 
 public class Main {
     public static void main(String [] args){

    // Criando uma notificação base
    Notificacao notificacao = new NotificacaoBase("uma mensagem");

     // Decorando a notificação com log 
     notificacao = new NotificacaoComLog(notificacao);
     System.out.println("Mensagem com log: " + notificacao.getExibirMensagem());

     // Decorando a notificação com prioridade e som
     notificacao = new NotificacaoComPrioridade(new NotificacaoComSom(notificacao));
     System.out.println("Mensagem com prioridade e som: " + notificacao.getExibirMensagem());

     }


 }