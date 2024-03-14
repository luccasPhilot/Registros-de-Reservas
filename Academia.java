//Luccas Philot Goncalves RA: 2525879
class Academia extends Reserva implements Reservavel {
    
    private int parceiros;
    
    public Academia() {}
    
    public Academia(int parceiros) {
        this.parceiros = parceiros;
    }
    
    public void setParceiros(int parceiros) {
        this.parceiros = parceiros;
    }
    
    public int getParceiros() {
        return parceiros;
    }

    // Sobrescrita
    @Override
    public void fazerReserva() {
        System.out.println("Reservando Academia...");
    }
    // Sobrescrita
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
    }
}
