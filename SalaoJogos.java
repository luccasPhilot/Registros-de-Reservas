//Luccas Philot Goncalves RA: 2525879
class SalaoJogos extends Reserva implements Reservavel {
    private String Jogo;
    public SalaoJogos() {
        
    }
    // Sobrescrita
    @Override
    public void fazerReserva() {
        System.out.println("Reservando Salao de Jogos...");
    }
    // Sobrescrita
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
    }
    public String getJogo() {
        return Jogo;
    }
    public void setJogo(String Jogo) {
        this.Jogo = Jogo;
    }
}
