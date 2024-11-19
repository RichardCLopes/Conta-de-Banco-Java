package contateste;

public abstract class Conta {
    protected String nome;
    protected int nconta;
    protected float saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNconta() {
        return nconta;
    }

    public void setNconta(int nconta) {
        this.nconta = nconta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void Sacar(float quant)
    {
        try
        {
        if(getSaldo()-quant<0)    
            {
                throw new Exception();
            }
        else
            {
                setSaldo(getSaldo()-quant);
                System.out.println("Saque realizado");
            }
        }
        catch (Exception naoliberado)
              {    
              System.out.println("Valor não liberado");
              }
    }
    
    public void Depositar(float quant)
    {
        setSaldo(getSaldo()+quant);
    }
   
}
