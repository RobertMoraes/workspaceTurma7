package br.com.aula9.excecao;

public class ControleException extends Exception{

    // LogBancoDados


    public ControleException(String message, Exception ex) {
        super(message, ex);
        print();

        if (message.equalsIgnoreCase("email")){
            enviarEmail();
        }
    }

    private void enviarEmail() {
        String smtpServer = "smtp://fiap.br";
        String smtpPort = "22";

        System.out.println("-Abrindo Conexao email");
        System.out.println("-email suporte: Supote@fiap.br");
        System.out.println("-----Detalhes----");
        System.out.println(getMessage());
        printStackTrace();
    }

    private void print(){
        System.out.println("=== Meu Exception ===");
        System.out.println(getMessage());
    }

}
