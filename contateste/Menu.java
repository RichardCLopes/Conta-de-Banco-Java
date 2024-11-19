package contateste;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private String nome;
    private int nconta, isim=0, iesp=0, ipou=0;
    private float saldo, saque, deposito, limite, rendimento;
    private boolean invalido;
    private Simples[] consim= new Simples[100];
    private Especial[] conesp= new Especial[100];
    private Poupanca[] conpou= new Poupanca[100];
    private Scanner input = new Scanner(System.in);
    
public void menu1()
{
    System.out.println("1-Simples\n2-Especial\n3-Poupança\n4-Sair");
}

public void menu2(int tipo)
{
    if(tipo==1 || tipo==2)
    {
        System.out.println("1-Criar conta\n2-Saldo\n3-Saque\n4-Deposito");
    }
    else
    {
        System.out.println("1-Criar conta\n2-Saldo\n3-Saque\n4-Deposito\n5-Efetuar rendimentos");
    }
}

public void verifica(int num)
{
    for(int i=0;i<100;i++)
        {
            if(consim[i]!=null)
            {
                if(nconta==consim[i].getNconta())
                {
                    invalido=true;
                }
            }
            if(conesp[i]!=null)
            {
                if(nconta==conesp[i].getNconta())
                {
                    invalido=true;
                }
            }
            if(conpou[i]!=null)
            {
                if(nconta==conpou[i].getNconta())
                {
                    invalido=true;
                }
            }
        }
}

public void escolha(int op, int op2)
{
    if(op==1 && op2==1)
    {
        boolean nc1=true, ns1=true;
        input.nextLine();
        System.out.println("Nome:");
        nome=input.nextLine();
        do{
            try{
        System.out.printf("Numero da conta:\n");
        nconta=input.nextInt();
        if(nconta<0 || nconta>1000)
        {
            throw new Exception();
        }
        nc1=false;
        }
             catch(InputMismatchException naoint)
              {
              System.err.printf("Entre com um inteiro válido.\n");
              input.nextLine();
              }
            catch (Exception coderro)
              {
              input.nextLine();
              System.err.println("0<N<1000");
              }
        }while(nc1);
        do{
            try{
        System.out.println("Saldo:");
        saldo=input.nextFloat();
        if(saldo<0)
        {
             throw new Exception();
        }
        ns1=false;
            }
            catch(InputMismatchException naoint)
              {
              System.err.printf("Entre com uma quanta válida.\n");
              input.nextLine();
              }
            catch (Exception coderro)
              {
              input.nextLine();
              System.err.print("0<N");
              }
        }while(ns1);
        verifica(nconta);
        if(invalido==false)
        {
           consim[isim] = new Simples(nome, nconta, saldo);
           isim=isim+1;
        }
        else
        {
            System.out.println("Numero de conta já existente");
        }
    }
    if(op==1 && op2==2)
    {
        boolean nc1=true, exist=false;
          do{
            try{
        System.out.printf("Numero da conta:\n");
        nconta=input.nextInt();
        if(nconta<0 || nconta>1000)
        {
            throw new Exception();
        }
        nc1=false;
        }
             catch(InputMismatchException naoint)
              {
              System.err.printf("Entre com um inteiro válido.\n");
              input.nextLine();
              }
            catch (Exception coderro)
              {
              input.nextLine();
              System.err.println("0<N<1000");
              }
        }while(nc1);
        for(int i=0;i<100;i++)
        {
            if(consim[i]!=null)
            {
                if(nconta==consim[i].getNconta())
                {
                    System.out.printf("Saldo: R$%.2f\n", consim[i].getSaldo());
                    exist=true;
                }
            }
        }
        if(exist==false)
        {
            System.out.println("Conta não existe.");
        }
    }
    if(op==1 && op2==3)
    {
        boolean nc1=true, qs=true, exist=false;
         do{
            try{
        System.out.printf("Numero da conta:\n");
        nconta=input.nextInt();
        if(nconta<0 || nconta>1000)
        {
            throw new Exception();
        }
        nc1=false;
        }
             catch(InputMismatchException naoint)
              {
              System.err.printf("Entre com um inteiro válido.\n");
              input.nextLine();
              }
            catch (Exception coderro)
              {
              input.nextLine();
              System.err.println("0<N<1000");
              }
        }while(nc1);
         do{
             try{
        System.out.println("Quantia do saque:");
        saque=input.nextFloat();
        if(saque<=0)
        {
            throw new Exception();
        }
        qs=false;
             }
              catch(InputMismatchException naoint)
              {
              System.err.printf("Entre com uma quantia válida.\n");
              input.nextLine();
              }
            catch (Exception coderro)
              {
              input.nextLine();
              System.err.println("0<N");
              }
        }while(qs);
        for(int i=0;i<100;i++)
        {
            if(consim[i]!=null)
            {
                if(nconta==consim[i].getNconta())
                {
                    consim[i].Sacar(saque);
                    exist=true;
                }
            }
        }
        if(exist==false)
        {
            System.out.println("Conta não existe.");
        }
    }
    if(op==1 && op2==4)
    {
        boolean nc1=true, qd=true, exist=false;
        
         do{
            try{
        System.out.printf("Numero da conta:\n");
        nconta=input.nextInt();
        if(nconta<0 || nconta>1000)
        {
            throw new Exception();
        }
        nc1=false;
        }
             catch(InputMismatchException naoint)
              {
              System.err.printf("Entre com um inteiro válido.\n");
              input.nextLine();
              }
            catch (Exception coderro)
              {
              input.nextLine();
              System.err.println("0<N<1000");
              }
        }while(nc1);
        
         do{
             try{
        System.out.println("Quantia do deposito:");
        deposito=input.nextFloat();
        if(deposito<=0)
        {
            throw new Exception();
        }
        qd=false;
             }
             catch(InputMismatchException naoint)
              {
              System.err.printf("Entre com uma quantia válida.\n");
              input.nextLine();
              }
            catch (Exception coderro)
              {
              input.nextLine();
              System.err.println("0<N");
              }
        }while(qd);
         
        for(int i=0;i<100;i++)
        {
            if(consim[i]!=null)
            {
                if(nconta==consim[i].getNconta())
                {
                    consim[i].Depositar(deposito);
                    exist=true;
                }
            }
        }
        if(exist==false)
        {
            System.out.println("Conta não existe.");
        }
    }
    if(op==2 && op2==1)
    {
        boolean nc1=true, ns1=true, nl=true;
        input.nextLine();
        System.out.println("Nome:");
        nome=input.nextLine();
        do{
            try{
        System.out.printf("Numero da conta:\n");
        nconta=input.nextInt();
        if(nconta<0 || nconta>1000)
        {
            throw new Exception();
        }
        nc1=false;
        }
             catch(InputMismatchException naoint)
              {
              System.err.printf("Entre com um inteiro válido.\n");
              input.nextLine();
              }
            catch (Exception coderro)
              {
              input.nextLine();
              System.err.println("0<N<1000");
              }
        }while(nc1);
        do{
            try{
        System.out.println("Saldo:");
        saldo=input.nextFloat();
        if(saldo<0)
        {
             throw new Exception();
        }
        ns1=false;
            }
            catch(InputMismatchException naoint)
              {
              System.err.printf("Entre com uma quantia válido.\n");
              input.nextLine();
              }
            catch (Exception coderro)
              {
              input.nextLine();
              System.err.print("0<N");
              }
        }while(ns1);
        do{
            try{
        System.out.println("Limite:");
        limite=input.nextFloat();
        if(limite<0)
        {
             throw new Exception();
        }
        nl=false;
            }
            catch(InputMismatchException naoint)
              {
              System.err.printf("Entre com uma quantia válida.\n");
              input.nextLine();
              }
            catch (Exception coderro)
              {
              input.nextLine();
              System.err.print("0<=N");
              }
        }while(nl);
        verifica(nconta);
        if(invalido==false)
        {
           conesp[iesp] = new Especial(nome, nconta, saldo, limite);
           iesp=iesp+1;
        }
        else
        {
            System.out.println("Numero de conta já existente");
        }
    }
    if(op==2 && op2==2)
    {
        boolean nc1=true, exist=false;
         do{
            try{
        System.out.printf("Numero da conta:\n");
        nconta=input.nextInt();
        if(nconta<0 || nconta>1000)
        {
            throw new Exception();
        }
        nc1=false;
        }
             catch(InputMismatchException naoint)
              {
              System.err.printf("\nEntre com um inteiro válido.\n");
              input.nextLine();
              }
            catch (Exception coderro)
              {
              input.nextLine();
              System.err.println("0<N<1000");
              }
        }while(nc1);
        for(int i=0;i<100;i++)
        {
            if(conesp[i]!=null)
            {
                if(nconta==conesp[i].getNconta())
                {
                    System.out.printf("Saldo: R$%.2f\n", conesp[i].getSaldo());
                    exist=true;
                }
            }
        }
          if(exist==false)
        {
            System.out.println("Conta não existe.");
        }
    }
    
    if(op==2 && op2==3)
    {
        boolean nc1=true, qs=true, exist=false;
         do{
            try{
        System.out.printf("Numero da conta:\n");
        nconta=input.nextInt();
        if(nconta<0 || nconta>1000)
        {
            throw new Exception();
        }
        nc1=false;
        }
             catch(InputMismatchException naoint)
              {
              System.err.printf("Entre com um inteiro válido.\n");
              input.nextLine();
              }
            catch (Exception coderro)
              {
              input.nextLine();
              System.err.println("0<N<1000");
              }
        }while(nc1);
         do{
             try{
        System.out.println("Quantia do saque:");
        saque=input.nextFloat();
        if(saque<=0)
        {
            throw new Exception();
        }
        qs=false;
             }
              catch(InputMismatchException naoint)
              {
              System.err.printf("Entre com uma quantia válida.\n");
              input.nextLine();
              }
            catch (Exception coderro)
              {
              input.nextLine();
              System.err.println("0<N");
              }
        }while(qs);
        for(int i=0;i<100;i++)
        {
            if(conesp[i]!=null)
            {
                if(nconta==conesp[i].getNconta())
                {
                    conesp[i].Sacar(saque);
                    exist=true;
                }
            }
        }
        if(exist==false)
        {
            System.out.println("Conta não existe.");
        }
    }
    if(op==2 && op2==4)
    {
        boolean nc1=true, qd=true, exist=false;
        do{
            try{
        System.out.printf("Numero da conta:\n");
        nconta=input.nextInt();
        if(nconta<0 || nconta>1000)
        {
            throw new Exception();
        }
        nc1=false;
        }
             catch(InputMismatchException naoint)
              {
              System.err.printf("Entre com um inteiro válido.\n");
              input.nextLine();
              }
            catch (Exception coderro)
              {
              input.nextLine();
              System.err.println("0<N<1000");
              }
        }while(nc1);
        
        do{
             try{
        System.out.println("Quantia do deposito:");
        deposito=input.nextFloat();
        if(deposito<=0)
        {
            throw new Exception();
        }
        qd=false;
             }
             catch(InputMismatchException naoint)
              {
              System.err.printf("Entre com uma quantia válida.\n");
              input.nextLine();
              }
            catch (Exception coderro)
              {
              input.nextLine();
              System.err.println("0<N");
              }
        }while(qd);
        
        for(int i=0;i<100;i++)
        {
            if(conesp[i]!=null)
            {
                if(nconta==conesp[i].getNconta())
                {
                    conesp[i].Depositar(deposito);
                    exist=true;
                }
            }
        }
        if(exist==false)
        {
            System.out.println("Conta não existe.");
        }
    }
    if(op==3 && op2==1)
    {
        boolean nc1=true, ns1=true, nr=true;
        input.nextLine();
        System.out.println("Nome:");
        nome=input.nextLine();
         do{
            try{
        System.out.printf("Numero da conta:\n");
        nconta=input.nextInt();
        if(nconta<0 || nconta>1000)
        {
            throw new Exception();
        }
        nc1=false;
        }
             catch(InputMismatchException naoint)
              {
              System.err.printf("Entre com um inteiro válido.\n");
              input.nextLine();
              }
            catch (Exception coderro)
              {
              input.nextLine();
              System.err.println("0<N<1000");
              }
        }while(nc1);
        do{
            try{
        System.out.println("Saldo:");
        saldo=input.nextFloat();
        if(saldo<0)
        {
             throw new Exception();
        }
        ns1=false;
            }
            catch(InputMismatchException naoint)
              {
              System.err.printf("Entre com uma quantia válido.\n");
              input.nextLine();
              }
            catch (Exception coderro)
              {
              input.nextLine();
              System.err.print("0<N");
              }
        }while(ns1);
        do{
            try{
        System.out.println("Rendimento em %:");
        rendimento=input.nextFloat();
        if(rendimento<=0)
        {
            throw new Exception();
        }
        nr=false;
            }
            catch(InputMismatchException naoint)
              {
              System.err.printf("Entre com uma porcentagem válida.\n");
              input.nextLine();
              }
            catch (Exception coderro)
              {
              input.nextLine();
              System.err.print("0<N");
              }
        }while(nr);
        verifica(nconta);
        if(invalido==false)
        {
           conpou[ipou] = new Poupanca(nome, nconta, saldo, rendimento);
           ipou=ipou+1;   
        }
        else
        {
            System.out.println("Numero de conta já existente");
        }  
    }
    if(op==3 && op2==2)
    {
        boolean nc1=true, exist=false;
         do{
            try{
        System.out.println("Numero da conta:");
        nconta=input.nextInt();
        if(nconta<0 || nconta>1000)
        {
            throw new Exception();
        }
        nc1=false;
        }
             catch(InputMismatchException naoint)
              {
              System.err.printf("\nEntre com um inteiro válido.\n");
              input.nextLine();
              }
            catch (Exception coderro)
              {
              input.nextLine();
              System.err.println("0<N<1000");
              }
        }while(nc1);
        for(int i=0;i<100;i++)
        {
            if(conpou[i]!=null)
            {
                if(nconta==conpou[i].getNconta())
                {
                    System.out.printf("Saldo: R$%.2f\n", conpou[i].getSaldo());
                    exist=true;
                }
            }
        }
          if(exist==false)
        {
            System.out.println("Conta não existe.");
        }
    }
    if(op==3 && op2==3)
    {
         boolean nc1=true, qs=true, exist=false;
         do{
            try{
        System.out.printf("Numero da conta:\n");
        nconta=input.nextInt();
        if(nconta<0 || nconta>1000)
        {
            throw new Exception();
        }
        nc1=false;
        }
             catch(InputMismatchException naoint)
              {
              System.err.printf("Entre com um inteiro válido.\n");
              input.nextLine();
              }
            catch (Exception coderro)
              {
              input.nextLine();
              System.err.println("0<N<1000");
              }
        }while(nc1);
         do{
             try{
        System.out.println("Quantia do saque:");
        saque=input.nextFloat();
        if(saque<=0)
        {
            throw new Exception();
        }
        qs=false;
             }
              catch(InputMismatchException naoint)
              {
              System.err.printf("Entre com uma quantia válida.\n");
              input.nextLine();
              }
            catch (Exception coderro)
              {
              input.nextLine();
              System.err.println("0<N");
              }
        }while(qs);
        for(int i=0;i<100;i++)
        {
            if(conpou[i]!=null)
            {
                if(nconta==conpou[i].getNconta())
                {
                   conpou[i].Sacar(saque);
                   exist=true;
                }
            }
        }
        if(exist==false)
        {
            System.out.println("Conta não existe.");
        }
    }
    if(op==3 && op2==4)
    {
        boolean nc1=true, qd=true, exist=false;
        do{
            try{
        System.out.printf("Numero da conta:\n");
        nconta=input.nextInt();
        if(nconta<0 || nconta>1000)
        {
            throw new Exception();
        }
        nc1=false;
        }
             catch(InputMismatchException naoint)
              {
              System.err.printf("Entre com um inteiro válido.\n");
              input.nextLine();
              }
            catch (Exception coderro)
              {
              input.nextLine();
              System.err.println("0<N<1000");
              }
        }while(nc1);
        
        do{
             try{
        System.out.println("Quantia do deposito:");
        deposito=input.nextFloat();
        if(deposito<=0)
        {
            throw new Exception();
        }
        qd=false;
             }
             catch(InputMismatchException naoint)
              {
              System.err.printf("Entre com uma quantia válida.\n");
              input.nextLine();
              }
            catch (Exception coderro)
              {
              input.nextLine();
              System.err.println("0<N");
              }
        }while(qd);
        for(int i=0;i<100;i++)
        {
            if(conpou[i]!=null)
            {
                if(nconta==conpou[i].getNconta())
                {
                    conpou[i].Depositar(deposito);
                    exist=true;
                }
            }
        }
        if(exist==false)
        {
            System.out.println("Conta não existe.");
        }
    }
    if(op==3 && op2==5)
    {
        for(int i=0;i<100;i++)
        {
            if(conpou[i]!=null)
            {
                conpou[i].setSaldo(conpou[i].getSaldo()+(conpou[i].getRendimento()*conpou[i].getSaldo()/100));
                System.out.println("Efetuado");
            }
        }
    }
}
}

