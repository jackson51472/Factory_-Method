import Ocp.Veiculo;

public class Main {
    public static void main(String[] args) throws Exception {

        Veiculo arquivo = new Veiculo("Carro");

        if (!(arquivo.getDispositivo() == null)){
        arquivo.setConteudo("texto");
        arquivo.imprimir();
        }

    }
}