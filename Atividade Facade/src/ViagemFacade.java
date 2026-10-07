public class ViagemFacade {
    private VooService vooService;
    private HotelService hotelService;
    private TransportService transportService;
    private ComprovanteService comprovanteService;
    private NotificacaoService notificacaoService;

    public ViagemFacade() {
        this.vooService = new VooService();
        this.hotelService = new HotelService();
        this.transportService = new TransportService();
        this.comprovanteService = new ComprovanteService();
        this.notificacaoService = new NotificacaoService();
    }

    public Reserva reservarViagem(Cliente cliente, String destino) {
        vooService.reservarVoo(destino);
        hotelService.reservarHotel(destino);
        transportService.reservarTransporte(destino);
        Reserva reserva = comprovanteService.gerarComprovante(destino);
        notificacaoService.enviarConfirmacao(cliente, reserva);
        return reserva;
    }
}