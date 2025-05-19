
import java.util.Scanner;

public class ContaUsuario {
    private Usuario usuario;
    Scanner scanner = new Scanner(System.in);
    TelaInicialBanco telaInicialBanco = new TelaInicialBanco();

    public void LoginUsuario() {
        usuario = new Usuario();

        System.out.println("--Infome seu nome: ");
        usuario.setNome(scanner.nextLine());

        System.out.println("--Informe sua senha: ");
        usuario.setSenha(scanner.nextLine());
        System.out.println("--Aguarde um momento....");

        telaInicialBanco.setUsuario(usuario);
        telaInicialBanco.exibirTelaInicial(usuario);



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
                telaInicialBanco.setUsuario(usuario);
                telaInicialBanco.exibirTelaInicial(usuario);
                break;
            } else {
                System.out.println("--ERRO! As senhas não correspodem--");
                System.out.println("--Tente novamente por favor!");
            }
        }
    }


}
