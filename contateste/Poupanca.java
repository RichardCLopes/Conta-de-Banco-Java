package contateste;

public class Poupanca extends Conta {
    private float rendimento;
    
     public Poupanca(String nome, int nconta, float saldo, float rendimento) {
        this.nome = nome;
        this.nconta = nconta;
        this.saldo = saldo;
        this.rendimento=rendimento;
    }
    public float getRendimento() {
        return rendimento;
    }

    public void setRendimento(float rendimento) {
        this.rendimento = rendimento;
    }

    @Override
    public float getSaldo() {
        return saldo;
    }

    @Override
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
}
