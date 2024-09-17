package org.example;

public class IphoneImp implements Iphone{
    @Override
    public void tocar(){
        System.out.println("Tocando música!");
    }

    @Override
    public void pausar(){
        System.out.println("Pausando música!");
    }

    @Override
    public void selecionarMusica(String musica){
        System.out.println("Selecionando música "+ musica);
    }

    // Implementação dos métodos do Aparelho Telefônico
    @Override
    public void ligar() {
        System.out.println("Ligando para telefone celular");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada.");
    }

    @Override
    public void iniciarCorreioEletronico() {
        System.out.println("Iniciando correio eletrônico.");
    }

    // Implementação dos métodos do Navegador de Internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
