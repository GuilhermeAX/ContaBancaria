package contabancaria;

import contabancaria.model.Conta;
import contabancaria.model.ContaCorrente;
import contabancaria.model.ContaPoupanca;
import contabancaria.util.Cores;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int opcao;
        Scanner scanner = new Scanner(System.in);
        Cores cores = new Cores();

        ContaCorrente conta1 = new ContaCorrente(1, 123, 1, "Guilherme", 10000.0f, 1000.0f);

        conta1.visualizar();
        conta1.sacar(12000.0f);
        conta1.visualizar();
        conta1.depositar(5000.0f);

        ContaPoupanca contaPoupanca1 = new ContaPoupanca(2, 123, 2, "Rafael", 100000.0f, 15);
        contaPoupanca1.visualizar();


        while (true) {
            System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "****************************************************************");
            System.out.println("*                                                              *");
            System.out.println("*                       BANCO DO BRAZIL                        *");
            System.out.println("*                                                              *");
            System.out.println("****************************************************************");
            System.out.println("*                                                              *");
            System.out.println("*          1 - Criar Conta                                     *");
            System.out.println("*          2 - Listar todas as contas                          *");
            System.out.println("*          3 - Buscar Conta por Numero                         *");
            System.out.println("*          4 - Atualizar Dados da Conta                        *");
            System.out.println("*          5 - Apagar Conta                                    *");
            System.out.println("*          6 - Sacar                                           *");
            System.out.println("*          7 - Depositar                                       *");
            System.out.println("*          8 - Transferir Valores Entre Contas                 *");
            System.out.println("*          9 - Sair                                            *");
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
                    keyPress();
                    break;
                case 2:
                    System.out.println("\nBuscar Todas as Contas");
                    keyPress();
                    break;
                case 3:
                    System.out.println("\nBuscar Conta por Numero");
                    keyPress();
                    break;
                case 4:
                    System.out.println("\nAtualizar Dados da Conta");
                    keyPress();
                    break;
                case 5:
                    System.out.println("\nApagar Conta");
                    keyPress();
                    break;
                case 6:
                    System.out.println("\nSacar");
                    keyPress();
                    break;
                case 7:
                    System.out.println("\nDepositar");
                    keyPress();
                    break;
                case 8:
                    System.out.println("\nTransferir Valores Entre Contas");
                    keyPress();
                    break;

                default:
                    System.out.println("OPÇÃO INVÁLIDA!!");
                    keyPress();
                    break;
            }

        }
    }

    public static void keyPress() {
        try {
            System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
            System.in.read();
        } catch (IOException e) {
            System.out.println("Você pressionou uma tecla diferente de enter!");
        }
    }
}