package org.example;

public interface Iphone {
    // Métodos para o Reprodutor Musical
    void tocar();
    void pausar();
    void selecionarMusica(String musica);

    // Métodos para o Aparelho Telefônico
    void ligar();
    void atender();
    void iniciarCorreioEletronico();

    // Métodos para o Navegador de Internet
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}
