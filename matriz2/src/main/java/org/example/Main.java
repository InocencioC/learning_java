package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        // Leitura da matriz
        System.out.println("Digite os elementos da matriz 3x3:");
        int i = 0;
        int j = 0;
        while (i < 3) {
            j = 0;
            while (j < 3) {
                matriz[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }

        // Imprimir a matriz original
        System.out.println("Matriz original:");
        i = 0;
        while (i < 3) {
            j = 0;
            while (j < 3) {
                System.out.print(matriz[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }

        // Transformar em uma matriz identidade
        i = 0;
        while (i < 3) {
            j = 0;
            while (j < 3) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
                j++;
            }
            i++;
        }

        // Imprimir a matriz identidade
        System.out.println("Matriz identidade:");
        i = 0;
        while (i < 3) {
            j = 0;
            while (j < 3) {
                System.out.print(matriz[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

