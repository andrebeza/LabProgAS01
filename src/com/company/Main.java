package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner enterStr = new Scanner(System.in);
        Scanner exitStr = new Scanner(System.in);

        int options;
        getMenu reference;

        String title, sinopse, watchList;
        int seasons, totalEpisodes, totalSeries = 0;

        do {
            interfaceMenu();
            options = enterStr.nextInt();

            switch (options){
                case 1:
                    System.out.println("Informe o nome da Série:");
                    title = exitStr.nextLine();
                    System.out.println("Quantidade de temporadas:");
                    seasons = exitStr.nextInt();
                    System.out.println("Número de episódios totais:");
                    totalEpisodes = exitStr.nextInt();
                    System.out.println("Sinopse da série:");
                    sinopse = exitStr.nextLine();
                    System.out.println("Está série foi assistida?");
                    watchList = exitStr.nextLine();

                    reference = new getMenu(title, sinopse, watchList, seasons, totalEpisodes, totalSeries);

                    codSerie.addSerie(reference);
                    break;

                case 2:
                    System.out.println("<<<=Séries listadas:=>>>");
                    System.out.println(codSerie.list());
                    break;

                case 3:
                    System.out.println("<<<=Série exluída:=>>>");
                    System.out.println("Informe o nome da série a ser excluída:");

                    title = exitStr.nextLine();

                    if (!(codSerie.getArraySeries().isEmpty())){
                        System.out.println("Série removida com sucesso!");
                    }else {
                        System.out.println("Título não existe ou não foi encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Série assistida ou não?");

                    watchList = exitStr.nextLine();

                    break;

                case 5:
                    System.out.println("Pesquisa pelo nome da série:");
                    System.out.println("Informe o nome da série:");

                    title = exitStr.nextLine();

                case 6:
                    System.out.println("Quantidade de séries:");

                    totalSeries = exitStr.nextInt();

                    System.out.println("Existem"+ codSerie.searchSerie(totalSeries)+"no seu catálogo.");

                default:
                    System.out.println("Opção inválida!!!");
            }

        }while (options != 0);
    }

    static void interfaceMenu(){
        System.out.println("---Menu---");
        System.out.println("1-Adicionar Série:");
        System.out.println("2-Remover Série:");
        System.out.println("3-Série assistida ou não:");
        System.out.println("4-Pesquisa por nome:");
        System.out.println("5-Quantidade de séries totais:");
        System.out.println("6-Aperte 0 para finalizar o programa.");
        System.out.println("---FIM---");
    }
}
