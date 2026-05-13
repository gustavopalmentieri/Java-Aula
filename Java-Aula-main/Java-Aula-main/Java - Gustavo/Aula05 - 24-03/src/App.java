import java.util.Scanner; //CLASSE SCANER -> FUNÇÃO PARA RECEBER O QUE FOR DIGITADO PELO USUÁRIO

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in); //INSTANCIANDO A CLASSE SCANNER - ATIVANDO A FUNÇÃO IMPORTADA
        
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular  = "Gustavo";
        conta1.agencia = "0525";
        conta1.conta = "10035x";
        conta1.saldo = 1000f;
    
        conta1.exibir();
        conta1.depositar(150f);

        

        //TRANSFERÊNCIA VIA SCANNER:

        System.out.printf("\nDigite o valor - agência - conta de destino: ");
        float transferido = sc.nextFloat();
        String agencia_dest = sc.next();
        String conta_dest = sc.next();

        conta1.pix(transferido, agencia_dest, conta_dest);

        //SAQUE VIA SCANNER

        System.out.printf("\nRealize seu saque!!");
        System.out.printf("\nDigite o valor que deseja sacar: ");
        float saque = sc.nextFloat();

        conta1.sacar(saque);
      
    }
}
