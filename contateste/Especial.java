package contateste;

public class Especial extends Conta {
    private float limite;
    
     public Especial(String nome, int nconta, float saldo, float limite) {
        this.nome = nome;
        this.nconta = nconta;
        this.saldo = saldo;
        this.limite=limite;
    }

    public float getLimite() {
        return limite;
    }
     
    public void setLimite(float limite)
    {
        this.limite=limite;
    }
    
    @Override
     public void Sacar(float quant)
    {
        if((getSaldo()+getLimite())-quant<0)    
            {
                System.out.println("Valor nao liberado");
            }
        else
            {
                setSaldo(getSaldo()-quant);
                System.out.println("Saque realizado");
            }
    }
     
}
