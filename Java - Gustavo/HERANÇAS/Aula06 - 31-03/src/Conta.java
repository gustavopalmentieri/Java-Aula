public class Conta { //CLASSE MÃE   


    float saldo; //ATRIBUTO DA CLASSE MÃE

    //METÓDO DEPOSITO

    public void depositar(float deposito){

        if (deposito > 0){

            saldo += deposito;
            System.out.printf("\nValor depositado: %.2f Reais \nSaldo Atual: %.2f Reais\n", deposito, saldo);
        }

        else{

            System.out.printf("\nDeposito não realizado! - Saldo Insuficiente.");
        }
    }
    
}

    //CLASSE FILHA

    class Poupança extends Conta{ //A 'CLASSE POUPANÇA' HERDA DA 'CLASSE CONTA'

        //METÓDO RENDIMENTO

        public void rendimento(float render){

            if (render > 0){
                
                render = render / 100;
                saldo += saldo * render;

                System.out.printf("\n-------> Saldo Final <--------\n \nSaldo Atual + Rendimento: %.2f Reais", saldo, render);
            }

            else{

                System.out.printf("\nOperação não realizada!! Ajuste o valor do rendimento.");
            }
            

        }

    }
