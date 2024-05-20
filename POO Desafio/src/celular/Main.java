package celular;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Iphone iphone = new Iphone();
        boolean sair = false;
        int opcao;

        while (!sair){
            System.out.println("-----HOME-----");
            System.out.println("1. Música");
            System.out.println("2. Navegador");
            System.out.println("3. Telefone");
            System.out.println("0. Sair");
            opcao = scan.nextInt();

            if(opcao == 1){
                System.out.println("-----MÚSICA-----");
                iphone.selecionarMusica("Linkin Park - Somewhere I Belong");
                iphone.tocar();
                iphone.pausar();
                System.out.println();
            } else if (opcao == 2) {
                System.out.println("-----NAVEGADOR-----");
                iphone.exibirPagina("Twitter");
                iphone.atualizarPagina();
                iphone.adicionarNovaPagina();
                System.out.println();
            } else if (opcao == 3) {
                System.out.println("-----TELEFONE-----");
                iphone.ligar("4002-8922");
                iphone.atender();
                iphone.iniciarCorreioVoz();
                System.out.println();
            } else if (opcao == 0) {
                sair = true;
            }
        }
    }
}
