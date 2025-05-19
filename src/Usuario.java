import java.util.Random;

public class Usuario {
    private String nome;
    private String senha;
    private final String agenciaConta;
    private float saldoConta;
    private final int numeroConta;

    public Usuario() {
        Random rand = new Random();
        this.agenciaConta = String.format("%04d-%d", rand.nextInt(10000), rand.nextInt(10));
        this.numeroConta = 100000 + rand.nextInt(900000);
        this.saldoConta = rand.nextInt(1000);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getAgenciaConta() {
        return agenciaConta;
    }


    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }


    public int getNumeroConta() {
        return numeroConta;
    }


}
