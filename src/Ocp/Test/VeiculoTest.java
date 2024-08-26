package Ocp.Test;

import Ocp.Caminhao;
import Ocp.Carro;
import Ocp.Moto;
import Ocp.Veiculo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    private Carro carro;
    private Veiculo veiculo;
    private Caminhao caminhao;
    private Moto moto;

    @BeforeEach
    void setUp() {
        carro = new Carro();
        caminhao = new Caminhao();
        moto = new Moto();
    }

    @Test
    void deveRetornarCarro() throws Exception {

        Veiculo veiculo = new Veiculo("Carro");
        veiculo.setConteudo("Testando carro");

        String resultado = veiculo.getDispositivo().imprimir(veiculo.getConteudo());
        assertEquals("Carro: Testando carro", resultado);
    }

    @Test
    void deveRetornarMoto() throws Exception {

        Veiculo veiculo = new Veiculo("Moto");
        veiculo.setConteudo("Testando Moto");

        String resultado = veiculo.getDispositivo().imprimir(veiculo.getConteudo());
        assertEquals("Moto: Testando Moto", resultado);
    }

    @Test
    void deveRetornarCaminhao() throws Exception {

        Veiculo veiculo = new Veiculo("Caminhao");
        veiculo.setConteudo("Testando Caminhão");

        String resultado = veiculo.getDispositivo().imprimir(veiculo.getConteudo());
        assertEquals("Caminhão: Testando Caminhão", resultado);
    }

    @Test
    void deveLancarExcecaoParaTipoVeiculoDigitadoIncorreto() throws Exception {
        try{
            new Veiculo("Barco");
        } catch (Exception e){
            assertEquals("Nome digitado incorretamente", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSeNaoImplementarImprimir() {

        try{
            new Veiculo("Pessoa");
        } catch (Exception e){
            assertEquals("Classe não implementa Imprimir", e.getMessage());
        }


    }
}