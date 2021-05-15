package com.local;

public class Principal {
    public static void main(String[] args){

        Carro meuCarro = new Carro();

        meuCarro.fabricante = "GM";
        meuCarro.modelo = "Fuscão Preto";
        meuCarro.anoDeFabricacao = 1977;
        meuCarro.cor = "Azulão";


        Carro seuCarro = new Carro();
        seuCarro.fabricante = "Honda";
        seuCarro.modelo = "Civic";
        seuCarro.anoDeFabricacao = 2009;
        seuCarro.cor = "Preto";

        System.out.println("Meu carro");
        System.out.println("-----------------");
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.anoDeFabricacao);

        System.out.println();
        System.out.println("Seu carro");
        System.out.println("___________________");
        System.out.println("Modelo: " + seuCarro.modelo);
        System.out.println("Ano: " + seuCarro.anoDeFabricacao);

}


}
