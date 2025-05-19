import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcaoUsuario;
        ContaUsuario contaUsuario = new ContaUsuario();

        while(true) {
            System.out.println("---------Bem vindo ao JavinhaBank!--------");
            System.out.println("---Você ja é cadastrado no nosso banco?---\n" +
                    "--SIM, ENTRAR NA CONTA [1] -- NAO, CRIAR CONTA [2]--");
            System.out.println("--Informe: ");
            if(scanner.hasNextInt()) {
                opcaoUsuario = scanner.nextInt();
                if(opcaoUsuario == 1 || opcaoUsuario == 2) {
                    break;
                } else {
                    System.out.println("--Entrada Inválida! Por favor digite uma das opções mencionadas, (1 ou 2).--");
                }
            }
        }

        if (opcaoUsuario == 1) {
            contaUsuario.LoginUsuario();
        } else {
            contaUsuario.CriarUsuario();
        }

        scanner.close();
    }
}
