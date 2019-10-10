import sun.net.util.IPAddressUtil;

public abstract class DispositivoDeRede {
    protected String enderecoIP;
    protected String enderecoMAC;

    public String getIP() {
        return enderecoIP;
    }

    public void setIP(String enderecoIP) {
        this.enderecoIP = enderecoIP;
    }

    public String getMAC() {
        return enderecoMAC;
    }

    public void setMAC(String enderecoMAC) {
        this.enderecoMAC = enderecoMAC;
    }
}
