package contateste;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTeste {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op = 0, op2 = 0;
        boolean lopa=true, lopb=true, lopall=true;
        Menu c = new Menu();
     
        do{
        do{
            c.menu1();
            
            try
            {
            op=input.nextInt();
             if(op!=1 && op!=2 && op!=3 && op!=4)
            {
                throw new Exception();
            }
             lopa=false;
            }
            catch(InputMismatchException naoint)
              {
              System.err.printf("Entre com um inteiro válido.");
              input.nextLine();
              }
            catch (Exception naop)
              {
              System.err.printf("Entre com um inteiro válido.");
              input.nextLine();
              }
         }while(lopa);
        
      if(op==4)
      {
          break;
      }
        
        do{
            c.menu2(op);
            
            try
            {
                
            op2=input.nextInt();
            
            if(op==1 || op==2)
            {
                if(op2!=1 && op2!=2 && op2!=3 && op2!=4)
                {
                throw new Exception();
                }
            }
            else
            {
                if(op2!=1 && op2!=2 && op2!=3 && op2!=4 && op2!=5)
                {
                throw new Exception();
                }
            }
            lopb=false;
            }
            catch(InputMismatchException naoint)
              {
              System.err.printf("Entre com um inteiro válido.");
              input.nextLine();
              }
            catch (Exception naop)
              {
              System.err.printf("Entre com um inteiro válido.");
              input.nextLine();
              }
        }while(lopb);
            
        c.escolha(op, op2);
        
        }while(lopall);
    }
    
}
