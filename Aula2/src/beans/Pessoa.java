package beans;

public class Pessoa {
    // Atributo
    private int id;
    private String nome;
    private int idade;
    private String cidade;
    private String sentimento;

    //Getter + Setters
    public void setIdade( int idade){
        if (idade < 0){
            this.idade = 0;
        } else {
            this.idade = idade;
        }
    }

    public int getIdade(){
        return this.idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSentimento() {
        return sentimento;
    }

    public void setSentimento(String sentimento) {
        this.sentimento = sentimento;
    }



    // Metodos + operações
    public void comer(String refeicao){
        System.out.println("Tipo de Refeição:" + refeicao);
        this.sentimento = "Relaxado e Tranquilo";
    }

    public void dormir(int tempo){
        System.out.println("Tempo de sono:" + tempo);

        if (tempo <= 5) {
            this.sentimento = "Cansaço";
        } else {
            this.sentimento = "Descansado";
        }
    }

}
