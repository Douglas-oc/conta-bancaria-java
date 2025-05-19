
import java.util.Scanner;

public class ContaUsuario {
    private Usuario usuario;
    Scanner scanner = new Scanner(System.in);

//    String nomeUsuario, senhaUsuario;
//    int numeroContaUsuario = rand.nextInt(100);
//    String agenciaContaUsuario = rand.nextInt(100) + "-" + rand.nextInt(10);
//    float saldoContaUsuario = rand.nextFloat() * 100;

    public void LoginUsuario() {
        usuario = new Usuario();

        System.out.println("--Infome seu nome: ");
        usuario.setNome(scanner.nextLine());

        System.out.println("--Informe sua senha: ");
        usuario.setSenha(scanner.nextLine());
        System.out.println("--Aguarde um momento....");
        TelaInicialBanco();
    }

    public void CriarUsuario() {
        usuario = new Usuario();

        System.out.println("--Informe seu nome: ");
        usuario.setNome(scanner.nextLine());

        while(true){
            System.out.println("--Informe uma senha: ");
            usuario.setSenha(scanner.nextLine());

            System.out.println("--Confirme sua senha: ");
            if(scanner.nextLine().equals(usuario.getSenha())) {
                System.out.println("--Conta criada com sucesso! Seja bem vindo(a) ao JavinhaBank "+ usuario.getNome() + "! --");
                TelaInicialBanco();
                break;
            } else {
                System.out.println("--ERRO! As senhas não correspodem--");
                System.out.println("--Tente novamente por favor!");
            }
        }
    }

    public void TelaInicialBanco() {
        while(true) {
            System.out.println("-----Seja bem vindo(a) "+ usuario.getNome());//nomeUsuario, numeroContaUsuario, agenciaContaUsuario, saldoContaUsuario
            System.out.println("-----Dados da conta----- \n" +
                    "-----Número da conta - "+  usuario.getNumeroConta()+
                    "\n-----Agência - "+  usuario.getAgenciaConta());
            System.out.printf("-----Saldo atual - R$ %.2f\n", usuario.getSaldoConta());
            System.out.println("-----Operações: " +
                    "Depósito [1] || "+
                    "Saque [2]");
            break;
        }

    }
}
