package org.example;

public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new IphoneImp();

        meuIphone.selecionarMusica("Que calor");
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.exibirPagina("Google");

    }
}