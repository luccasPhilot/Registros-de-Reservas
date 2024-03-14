//Luccas Philot Goncalves RA: 2525879
class Reserva {
    private String nome;
    private int cpf;
    private String data;
    private int duracao;
    private String local;

    public Reserva() {
        nome = "";
        cpf = 0;
        data = "";
        duracao = 0;
        local = "";
    }
    
    public Reserva(String nome, int cpf, String data, int duracao, String local) {
        this.nome = nome;
        this.cpf = cpf;
        this.data = data;
        this.duracao = duracao;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Local: " + local);
        System.out.println("Data da reserva: " + data);
        System.out.println("Duração da reserva: " + duracao + " horas\n");
    }  
    
}
