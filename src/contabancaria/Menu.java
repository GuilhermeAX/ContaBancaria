package contabancaria;

import contabancaria.model.Conta;
import contabancaria.model.ContaCorrente;
import contabancaria.model.ContaPoupanca;
import contabancaria.util.Cores;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int opcao;
        Scanner scanner = new Scanner(System.in);
        Cores cores = new Cores();

        Conta conta1 = new ContaCorrente(1, 123, 1, "Guilherme", 10000.0f, 1000.0f);

        conta1.visualizar();

        conta1.sacar(12000.0f);
        conta1.depositar(5000.0f);

        ContaPoupanca contaPoupanca1 = new ContaPoupanca(2,123,2,"Rafael",100000.0f,15);
        contaPoupanca1.visualizar();

        Conta conta2 = new Conta();
        conta2.visualizar();
        conta2.setTitular("Galvão");
        conta2.visualizar();

       /* while (true) {
            System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "****************************************************************");
            System.out.println("*                                                              *");
            System.out.println("*                       BANCO DO BRAZIL                        *");
            System.out.println("*                                                              *");
            System.out.println("****************************************************************");
            System.out.println("*                                                              *");
            System.out.println("*          1 - Criar Conta                                     *");
            System.out.println("*          2 - Ver Saldo da Conta                              *");
            System.out.println("*          3 - Dados da Conta                                  *");
            System.out.println("*          4 - Sacar                                           *");
            System.out.println("*          5 - Depositar                                       *");
            System.out.println("*          6 - Transferir                                      *");
            System.out.println("*          7 - Sair                                            *");
            System.out.println("*                                                              *");
            System.out.println("****************************************************************");
            System.out.print("Entre com a opção desejada: ");
            System.out.println("                                                                ");
            opcao = scanner.nextInt();


            if (opcao == 7) {
                System.out.println("Banco do Brazil com Z - O seu futuro começa aqui!");
                scanner.close();
                System.exit(0);
            }
            switch (opcao) {
                case 1:
                    System.out.println("\nCriar Conta");

                    break;
                case 2:
                    System.out.println("\nVer Saldo");

                    break;
                case 3:
                    System.out.println("\nDados da Conta");

                    break;
                case 4:
                    System.out.println("\nSacar");

                    break;
                case 5:
                    System.out.println("\nDepistar");

                    break;
                case 6:
                    System.out.println("\nTransferir");

                    break;

                default:
                    System.out.println("OPÇÃO INVÁLIDA!!");
            }

        }*/
    }
}