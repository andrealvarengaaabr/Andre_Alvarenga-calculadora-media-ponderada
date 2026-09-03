/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora_media_ponderada;

/**
 *
 * @author André P. Alvarenga
 */
       import java.util.Scanner;
        public class Calculadora_media_ponderada {
           public static void main(String[] args) {
           
               Scanner entrada = new Scanner(System.in);
            int totalAlunos =0;
               double somaMedias = 0;
              while (true) {
               System.out.print("Nome do aluno (SAIR -1): ");
                   String nomeAluno = entrada.nextLine();
                  if (nomeAluno.equals("-1")) {
                 break;
                  }
                  
                  System.out.print(" Nota do 1º Bimestre : ");
                  double nota1 = entrada.nextDouble();
                     System.out.print(" Nota  do 2º Bimestre: ");
                         double nota2 = entrada.nextDouble();
                     double media = (nota1 * 2 + nota2 * 3) / 5;
                    System.out.println(" Aluno:" + nomeAluno);
             System.out.printf("Média final : %.2f%n ", media);
                 somaMedias += media;
                         totalAlunos++;
                     entrada.nextLine();
                     }
                        double mediaGeral = 0;
                             if (totalAlunos > 0) {
                      mediaGeral = somaMedias / totalAlunos;
                         }
                  System.out.println(" \n===== Resultado da turma ===== ");
                   System.out.println(" Total de alunos: " + totalAlunos);
                   System.out.printf("  Média geral da turma: %.2f%n", mediaGeral);
                    entrada.close();
                 }
                            }