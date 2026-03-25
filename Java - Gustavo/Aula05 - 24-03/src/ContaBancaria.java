public class ContaBancaria {

    //ATRIBUTOS

    String titular;
    String agencia;
    String conta;
    float saldo;

    //METÓDO EXIBIR

    public void exibir(){

        System.out.printf("\nTitular: %s \nAgência: %s \nConta: %s \nSaldo: %.2f Reais\n", titular, agencia, conta, saldo);
    }

    //METÓDO DEPOSITO

    public void depositar (float deposito){

    if(deposito > 0){

        saldo += deposito;

        System.out.printf("\nDeposito realizado!! \nDepósito: %.2f Reais \nSaldo Atual: %.2f\n", deposito, saldo);

    }
    else{

        System.out.printf("\nDeposito não realizado!! \nServiço indisponivel - Valor Incorreto \nSaldo Atual: %.2f\n", saldo);

    }
    }

    public void pix (float transferido, String agencia_dest, String conta_dest){

        if(transferido <= saldo){

            saldo -= transferido;
            System.out.printf("\nPix realizado com sucesso!! \nAgência: %s \nConta: %s \nValor transferido: %.2f \nSaldo Atual: %.2f",agencia_dest, conta_dest,transferido, saldo);
        }

        else{

            System.out.printf("\nPix não realizado!! - Saldo Insuficiente");

        }
    }

}