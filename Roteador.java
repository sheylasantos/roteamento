import java.util.ArrayList;

public class Roteador extends DispositivoDeRede implements Roteamento{
    protected Porta[] portas = new Porta[5];
    protected ArrayList<Pacote> buffers;

    public Porta roteamento(Pacote pacote){
        return portas[0];
    }
}
