//Luccas Philot Goncalves RA: 2525879
class SalaoFestas extends Reserva implements Reservavel {
    private int convidados;
    public SalaoFestas() {
    }
    // Sobrescrita
    @Override
    public void fazerReserva() {
        System.out.println("Reservando Salao de Festas...");
    }
    // Sobrescrita
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
    }
    public int getConvidados() {
        return convidados;
    }
    public void setConvidados(int convidados) {
        this.convidados = convidados;
    }
}
