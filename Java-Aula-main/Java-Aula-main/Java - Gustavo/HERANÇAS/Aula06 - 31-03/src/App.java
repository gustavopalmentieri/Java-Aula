import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        Poupança conta1 = new Poupança();

        //APLICANDO SCANNER NO DEPOSITO:

        //TRATANDO EXCEÇÃO

        float deposito = 0;
        boolean valor = false;

        while (!valor){ //"!" - INVERTE O QUE E FALSO SE TORNA VERDADEIRO OU O QUE E VERDADEIRO SE TORNA FALSA 

            try { //A INDENTAÇÃO NÃO E OBRIGATÓRIA 

                System.out.printf("Digte o valor do deposito: ");
                deposito = sc.nextFloat();
                valor = true; // CASO O USUARIO DIGITE O NUMERO QUE E A SITUAÇÃO CORRETA ELE SAI DO LAÇO FAZ COM QUE SAIA DO LAÇO, CASO NÃO ACONTEÇA O ERRO, PARA QUE NÃO SE TORNE INFINITO - AJEITAR O COMENT DA LINHA
            }

            catch(Exception e){

                System.out.printf("\nValor digitado de forma incorreta!! Digite apenas valores númericos.\n");
                sc.nextLine(); //ESVAZIANDO O BUFFER DO SCANNER - LIMPAR A MEMÓRIA DO SCANNER QUE ESTÁ ARMAZENADO COM O ERRO DIGITADO
            }
        }

        conta1.depositar(deposito); //METÓDO DA CLASSE MÃE - NÃO FUNCIONA DENTRO DO LAÇO PRECISA ESTAR FORA

        //APLICANDO SCANNER NO RENDIMENTO:
        //TRATANDO EXCESSÃO

        float render = 0;
        boolean vlr_rend = false;

        while (!vlr_rend){
            try {
            
                System.out.printf("\nDigite a porcentagem do seu rendimento: ");
                render = sc.nextFloat();
                vlr_rend = true;
            
            }

            catch(Exception e){

                System.out.printf("\nValor digitado de forma incorreta!! Erro no sistema.\n");
                sc.nextLine(); //ESVAZIANDO O BUFFER DO SCANNER
            }
        }

        conta1.rendimento(render); //METÓDO DA CLASSE FILHA
    }
}
