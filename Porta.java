public class Porta {
    protected Pacote bufferEntrada;
    protected Pacote bufferSaida;
    protected Roteador saida;

    public Pacote getBufferEntrada() {
        return bufferEntrada;
    }

    public void setBufferEntrada(Pacote bufferEntrada) {
        this.bufferEntrada = bufferEntrada;
    }

    public Pacote getBufferSaida() {
        return bufferSaida;
    }

    public void setBufferSaida(Pacote bufferSaida) {
        this.bufferSaida = bufferSaida;
    }

    public void setSaida(Roteador saida) {
        this.saida = saida;
    }
}
