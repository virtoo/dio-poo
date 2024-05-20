package celular;

import aparelhoTelefonico.AparelhoTel;
import navegadorInternet.NavInternet;
import reprodutorMusical.RepMusical;

import java.sql.SQLOutput;

public class Iphone implements AparelhoTel, NavInternet, RepMusical {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("ATENDEU A LIGAÇÃO");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("CORREIO DE VOZ INICIADO!");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página " + url);
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("NOVA PÁGINA ADICIONADA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("PÁGINA ATUALIZADA!");
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA!");
    }

    @Override
    public void pausar() {
        System.out.println("MÚSICA PAUSADA!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música Selecionada: " + musica);
    }
}
