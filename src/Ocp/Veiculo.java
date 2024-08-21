package Ocp;
public class Veiculo {
    // OCP - Open Closed Principle
    // Princípio Aberto/Fechado

    private String conteudo;

    private Imprimir dispositivo;

    public Veiculo(String tipoVeiculo) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Ocp." + tipoVeiculo);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            this.dispositivo = null;
        }
        if (!(objeto instanceof Imprimir)) {
            this.dispositivo = null;
        }
        this.dispositivo = (Imprimir) objeto;
    }

    public String getConteudo() {
            return conteudo;
        }

    public Imprimir getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Imprimir dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void imprimir() {
        this.dispositivo.imprimir(conteudo);
    }

    }

