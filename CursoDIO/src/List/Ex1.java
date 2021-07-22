package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {

    /*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
    Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
    e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
    */

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            List<Double> temp = new ArrayList<Double>();

            double soma = 0.0;
            for (int i = 1; i <= 6; i++) {
                System.out.print("Qual a temperatura do mês " + i + ": ");
                double t = scan.nextDouble();
                temp.add(t);
                soma += t;
            }

            double media = soma/temp.size();

            System.out.println("Temperaturas Semestral: " + temp);
            System.out.println("Média temperaturas Semestral: " + media);
            System.out.println("----------");

            for (Double t : temp) {
                if(t > media) {
                    int index = temp.indexOf(t);
                    switch (index) {
                        case 0:
                            System.out.println((index + 1) + " - Janeiro: " + t);
                            break;
                        case 1:
                            System.out.println((index + 1) + " - Fevereiro : " + t);
                            break;
                        case 2:
                            System.out.println((index + 1) + " - Março: " + t);
                            break;
                        case 3:
                            System.out.println((index + 1) + " - Abril: " + t);
                            break;
                        case 4:
                            System.out.println((index + 1) + " - Maio: " + t);
                            break;
                        case 5:
                            System.out.println((index + 1) + " - Junho: " + t);
                            break;
                        default:
                            System.out.println("Fim");
                            break;
                    }
                }
            }
        }
    }
