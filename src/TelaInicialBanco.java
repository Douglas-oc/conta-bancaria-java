import java.util.Scanner;

public class TelaInicialBanco {
    Scanner scanner = new Scanner(System.in);
    private Usuario usuario;

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public void exibirTelaInicial(Usuario usuario) {
        this.usuario = usuario;

        while(true) {
            System.out.println("----- Seja bem-vindo(a), " + usuario.getNome() + " -----");
            System.out.println("----- Dados da Conta -----");
            System.out.println("Número da Conta: " + usuario.getNumeroConta());
            System.out.println("Agência: " + usuario.getAgenciaConta());
            System.out.printf("Saldo Atual: R$ %.2f%n", usuario.getSaldoConta());
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1 -> realizarDeposito();
                case 2 -> realizarSaque();
                case 3 -> {
                    System.out.println("Volte sempre! " + usuario.getNome());
                    System.out.println("O JavinhaBank agradece a sua preferência! :)");
                    return;
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
            break;
        }
    }

    private void realizarSaque() {
        while(true) {
            System.out.printf("-----Saldo atual - R$ %.2f\n", usuario.getSaldoConta());
            System.out.println("-----Quanto você deseja sacar? ");
            float valorSaque = scanner.nextFloat();
            if(valorSaque > usuario.getSaldoConta() || valorSaque < 0) {
                System.out.println("-----ERRO! Saldo insuficiente, tente novamente por favor.");
            } else {
                System.out.println("-----Saque realizado com sucesso!");
                float novoSaldo = usuario.getSaldoConta() - valorSaque;
                usuario.setSaldoConta(novoSaldo);

                System.out.println("-----Saldo atual: "+ novoSaldo);
                exibirTelaInicial(usuario);
                break;
            }
        }

    }


    private void realizarDeposito() {
        while (true) {
            System.out.printf("-----Saldo atual - R$ %.2f\n", usuario.getSaldoConta());
            System.out.println("-----Quanto você deseja depositar? ");
            float valorDeposito = scanner.nextFloat();
            if(valorDeposito > 0) {
                System.out.println("-----Deposito realizado com sucesso!");
                float novoSaldo = usuario.getSaldoConta() + valorDeposito;
                usuario.setSaldoConta(novoSaldo);

                System.out.println("-----Saldo atual: "+ novoSaldo);
                exibirTelaInicial(usuario);
                break;
            } else {
                System.out.println("-----ERRO! Digite um valor positivo para depositar.");
            }




        }
    }
}


