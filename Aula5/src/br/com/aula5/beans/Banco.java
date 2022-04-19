package br.com.aula5.beans;

public class Banco {
    private String razaoSocial;
    private int idBancario;

    public Banco(){}

    public Banco(String razaoSocial, int idBancario) {
        this.razaoSocial = razaoSocial;
        this.idBancario = idBancario;
    }
    // get + set

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public int getIdBancario() {
        return idBancario;
    }

    public void setIdBancario(int idBancario) {
        this.idBancario = idBancario;
    }


}
