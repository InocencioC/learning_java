package org.example;
import java.util.Scanner;

public class Main {
    
        public static void main(String[] args) {

            int[][] matriz = new int[3][3];

            Scanner scanner = new Scanner(System.in);

            // Preenchendo a matriz
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    System.out.printf("Digite o valor da posição [%d][%d]: ", i, j);
                    matriz[i][j] = scanner.nextInt();
                }
            }

            // Somando todos os valores da matriz
            int soma = 0;
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    soma += matriz[i][j];
                }
            }
            System.out.printf("A soma de todos os valores da matriz é: %d\n", soma);

            // Imprimindo todos os valores na diagonal
            System.out.print("Valores na diagonal: ");
            for(int i=0; i<3; i++) {
                System.out.printf("%d ", matriz[i][i]);
            }
            System.out.println();

            // Contando números pares e ímpares
            int pares = 0, impares = 0;
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    if(matriz[i][j] % 2 == 0) {
                        pares++;
                    } else {
                        impares++;
                    }
                }
            }
            System.out.printf("Total de números pares: %d\n", pares);
            System.out.printf("Total de números ímpares: %d\n", impares);

            // Contando números negativos
            int negativos = 0;
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    if(matriz[i][j] < 0) {
                        negativos++;
                    }
                }
            }
            System.out.printf("Total de números negativos: %d\n", negativos);

            // Calculando o fatorial dos valores na diagonal principal
            System.out.print("Fatorial dos valores na diagonal: ");
            for(int i=0; i<3; i++) {
                int fatorial = 1;
                for(int j=1; j<=matriz[i][i]; j++) {
                    fatorial *= j;
                }
                System.out.printf("%d ", fatorial);
            }
            System.out.println();
        }
    }

