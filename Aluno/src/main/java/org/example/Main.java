package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                List<String> nomes = new ArrayList<>();
                List<Integer> anosNascimento = new ArrayList<>();
                List<String> sexos = new ArrayList<>();
                List<String> moradas = new ArrayList<>();
                List<Double> notasMatematica = new ArrayList<>();
                List<Double> notasFisica = new ArrayList<>();
                List<Double> notasQuimica = new ArrayList<>();
                List<Double> notasLaboratorio = new ArrayList<>();

                Scanner scanner = new Scanner(System.in);

                for (int i = 1; i <= 10; i++) {
                    System.out.println("Informe os dados do estudante " + i + ":");
                    System.out.print("Nome completo: ");
                    String nomeCompleto = scanner.nextLine();
                    nomes.add(nomeCompleto);

                    System.out.print("Ano de nascimento: ");
                    int anoNascimento = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do scanner
                    anosNascimento.add(anoNascimento);

                    System.out.print("Sexo: ");
                    String sexo = scanner.nextLine();
                    sexos.add(sexo);

                    System.out.print("Morada: ");
                    String morada = scanner.nextLine();
                    moradas.add(morada);

                    System.out.print("Nota de Matemática: ");
                    double notaMatematica = scanner.nextDouble();
                    notasMatematica.add(notaMatematica);

                    System.out.print("Nota de Física: ");
                    double notaFisica = scanner.nextDouble();
                    notasFisica.add(notaFisica);

                    System.out.print("Nota de Química: ");
                    double notaQuimica = scanner.nextDouble();
                    notasQuimica.add(notaQuimica);

                    System.out.print("Nota da Avaliação do Laboratório: ");
                    double notaLaboratorio = scanner.nextDouble();
                    notasLaboratorio.add(notaLaboratorio);

                    System.out.println("--------------------------------------");
                }

                mostrarInformacoes(nomes, anosNascimento, sexos, moradas, notasMatematica, notasFisica, notasQuimica,
                        notasLaboratorio);
            }

            private static void mostrarInformacoes(List<String> nomes, List<Integer> anosNascimento, List<String> sexos,
                                                   List<String> moradas, List<Double> notasMatematica, List<Double> notasFisica,
                                                   List<Double> notasQuimica, List<Double> notasLaboratorio) {
                int totalEstudantes = nomes.size();
                int totalMulheres = 0;
                int totalHomens = 0;
                int totalAdultos = 0;

                for (int i = 0; i < totalEstudantes; i++) {
                    String nome = nomes.get(i);
                    int anoNascimento = anosNascimento.get(i);
                    String sexo = sexos.get(i);
                    String morada = moradas.get(i);
                    double notaMatematica = notasMatematica.get(i);
                    double notaFisica = notasFisica.get(i);
                    double notaQuimica = notasQuimica.get(i);
                    double notaLaboratorio = notasLaboratorio.get(i);

                    System.out.println("Nome: " + nome);
                    System.out.println("Idade: " + (2023 - anoNascimento));
                    System.out.println("Morada: " + morada);
                    System.out.println("Notas:");
                    System.out.println("Matemática: " + notaMatematica);
                    System.out.println("Física: " + notaFisica);
                    System.out.println("Química: " + notaQuimica);
                    System.out.println("Nota da Avaliação do Laboratório: " + notaLaboratorio);
                    System.out.println("Nota Final: " + calcularNotaFinal(notaMatematica, notaFisica, notaQuimica, notaLaboratorio));
                    System.out.println("--------------------------------------");

                    if (sexo.equalsIgnoreCase("Feminino")) {
                        totalMulheres++;
                    } else {
                        totalHomens++;
                    }

                    if (anoNascimento <= 1978) {
                        totalAdultos++;
                    }
                }

                System.out.println("Total de Estudantes: " + totalEstudantes);
                System.out.println("Total de Mulheres: " + totalMulheres);
                System.out.println("Total de Homens: " + totalHomens);
                System.out.println("Total de Adultos: " + totalAdultos);
            }

            private static double calcularNotaFinal(double notaMatematica, double notaFisica, double notaQuimica,
                                                    double notaLaboratorio) {
                double pesoMatematica = 0.4;
                double pesoFisica = 0.35;
                double pesoQuimica = 0.25;

                double mediaPonderada = (pesoMatematica * notaMatematica + pesoFisica * notaFisica + pesoQuimica * notaQuimica)
                        / (pesoMatematica + pesoFisica + pesoQuimica);

                double tempoLaboratorio = notaLaboratorio;
                if (tempoLaboratorio < 60) {
                    tempoLaboratorio *= 0.1;
                } else if (tempoLaboratorio >= 60 && tempoLaboratorio < 120) {
                    tempoLaboratorio *= 0.06;
                } else {
                    tempoLaboratorio = 0;
                }

                double notaFinal = mediaPonderada + tempoLaboratorio;

                int anosNascimento = 0;
                int idade = 2023 - anosNascimento;
                if (idade > 45) {
                    notaFinal += notaFinal * 0.12;
                }

                return notaFinal;
            }
        }
