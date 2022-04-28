package br.com.aula9.beans;

public class Login {
    private String usuario;
    private String senha;

    // constante de acesso
    private String userAcesso = "admin";
    private String userPwd = "admin";
    //

    public Login(){}

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean fazerLogin (String user, String password){
        try {
            if (user.equalsIgnoreCase(this.userAcesso) && password.equalsIgnoreCase(this.userPwd)) {
                return true;
            }
            throw new Exception("ERRO 5020: Usuario/Senha Invalidos - " + user);
        } catch (Exception ex){
            // Como tratar a exception ??
            System.out.println(ex.getMessage());
        }
        return false;
    }

}
