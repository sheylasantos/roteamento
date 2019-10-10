import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Roteador[][] matriz = new Roteador[3][3];
        int count=1;
        for (int i = 0; i < 3; i++){
            for (int j = 0;j<3;++j){
                matriz[i][j]=new Roteador();
                matriz[i][j].enderecoIP="192.168.0."+count;
                System.out.println(matriz[i][j].getIP());
                count++;
            }
        }


    }
}
