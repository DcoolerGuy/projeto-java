/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj.individual;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author jvass
 */
public class SistemaDoJurgenKlopp {

    public static void main(String[] args) throws InterruptedException {
        CalculadoraReds calc = new CalculadoraReds();
        Scanner leitor = new Scanner(System.in);
        Boolean finalizar = false;
        calc.getLogo();
        Integer opcao = 0;

        while (opcao != 5) {
            calc.getStartUp();
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    //Calculo da financias

                    System.out.println("Calculo de salário\n");
                    System.out.println("Digite o salario semanal do jogador:");
                    Double salarioDig = leitor.nextDouble();

                    calc.getFinancia(salarioDig);

                    break;
                case 2:
                    //Calculo de tranferencias

                    System.out.println("Aqui você tera um valor aproximado de quanto sera\n"
                            + "o valor de trasnferência de um jogador");

                    System.out.println("Como se categoriza a fase dele?");
                    System.out.println("1 - Pessima");
                    System.out.println("2 - Má");
                    System.out.println("3 - Boa");
                    System.out.println("4 - Ótima");
                    Integer fase = leitor.nextInt();

                    System.out.println("Qual o valor de mercado atual dele?");
                    Double valorDig = leitor.nextDouble();

                    Double valorExp = calc.getMercado(valorDig, fase);
                    String frase = String.format("O valor de mercado estimado desse jogador é de \u20AC%.1f", valorExp);

                    System.out.println(frase);

                    break;

                case 3:
                    //Elenco
                    System.out.println("Confira aqui as suas escalações");
                    System.out.println("1 - 4-3-3");
                    System.out.println("2 - 4-2-3-1");
                    System.out.println("3 - 4-3-3 falso 9");
                    System.out.println("Digite qual escalação você gostaria de visualizar:");
                    Integer escalacaoDig = leitor.nextInt();

                    calc.getEscalacao(escalacaoDig);

                    break;
                case 4:
                    //champions

                    calc.getchampionsLogo();
                    Integer verPlacar;

                    System.out.println("\n\n\n\nOitavas de finais: ");
                            calc.getBvb();
                            System.out.println("Digite algo para ver o resultado");
                            verPlacar = leitor.nextInt();

                            Integer golLiv = ThreadLocalRandom.current().nextInt(1, 5);
                            Integer golOponente = ThreadLocalRandom.current().nextInt(1, 2);
                            
                            System.out.println("Liverpool: "+golLiv);
                            System.out.println("B. Dortmund: "+golOponente);
                            
                            if(golOponente>=golLiv){
                                System.out.println("Mais sorte na próxima");
                                break;
                            }
                            
                            System.out.println("\n\nQuartas de finais: ");
                            calc.getNapoli();
                            System.out.println("Digite algo para ver o resultado");
                            verPlacar = leitor.nextInt();
                            
                            golLiv = ThreadLocalRandom.current().nextInt(1, 5);
                            golOponente = ThreadLocalRandom.current().nextInt(1, 3);
                            
                            System.out.println("Liverpool: "+golLiv);
                            System.out.println("Napoli: "+golOponente);
                            
                            if(golOponente>=golLiv){
                                System.out.println("Mais sorte na próxima");
                                break;
                            }

                            System.out.println("\n\nSemi Finais: ");
                            calc.getCity();
                            System.out.println("Digite algo para ver o resultado");
                            verPlacar = leitor.nextInt();

                            golLiv = ThreadLocalRandom.current().nextInt(1, 5);
                            golOponente = ThreadLocalRandom.current().nextInt(1, 4);
                            
                            System.out.println("Liverpool: "+golLiv);
                            System.out.println("Manchester City: "+golOponente);
                            
                            if(golOponente>=golLiv){
                                System.out.println("Mais sorte na próxima");
                                break;
                            }
                            
                            System.out.println("\n\nFinal:");
                            calc.getReal();
                            System.out.println("Digite algo para ver o resultado");
                            verPlacar = leitor.nextInt();

                            golLiv = ThreadLocalRandom.current().nextInt(1, 5);
                            golOponente = ThreadLocalRandom.current().nextInt(1, 5);
                            
                            System.out.println("Liverpool: "+golLiv);
                            System.out.println("Real Madrid: "+golOponente);
                            
                            if(golOponente>=golLiv){
                                System.out.println("Mais sorte na próxima");
                                break;
                            }
                            
                            calc.getChampion();
                            
                            break;

                case 5:
                    calc.getLogOff();
                    break;
                default:
                    System.out.println("Opção invalida");
            }

        }

    }
}
