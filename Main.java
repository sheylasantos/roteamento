import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {
        Roteador[][] matriz = new Roteador[3][3];
        int count=1;
        for (int i = 0; i < 3; i++){
            for (int j = 0;j<3;++j){
                matriz[i][j]=new Roteador();
                if (i <2){
                    matriz[i][j].getPortas()[3].setSaida(matriz[i+1][j]);
                }
                if (j<2){
                    matriz[i][j].getPortas()[2].setSaida(matriz[i][j+1]);
                }
                matriz[i][j].enderecoIP="192.168.0."+count;
                System.out.println(matriz[i][j].getIP());
                count++;
            }
        }
        Pacote pack = new Pacote();
        pack.destino.enderecoIP="192.168.0.8";
        pack.dados="Oi";

        String linha;
        String ipOrigem = new String();
        String ipDestino;
        int qtd=0;
        String msg;
        String path="comunicacao.txt";
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        FileWriter writer = new FileWriter("saida1.txt");
        linha=buffRead.readLine();
        linha.getChars(0,10,ipOrigem.toCharArray(),0);
        System.out.println(ipOrigem);



        matriz[0][0].roteamento(pack);

    }
}
