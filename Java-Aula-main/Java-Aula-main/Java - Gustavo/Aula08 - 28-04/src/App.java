import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Aluno aluno1 = new Aluno();

        int opcao = 0; //OPÇÕES DO MENU

        do{
            
            System.out.printf("\n#####--- MENU ---#####\n");
            System.out.printf("\n--- > 1 - APLICAR NOTA < ---");
            System.out.printf("\n--- > 2 - APLICAR PRESENÇA < ---");
            System.out.printf("\n--- > 3 - APLICAR BÔNUS < ---");
            System.out.printf("\n--- > 4 - SAIR < ---\n");
            System.out.printf("\nDigite a Opção: ");

            try{

                opcao = sc.nextInt();
            switch(opcao){

                case (1): 

                    try{ //TRATAMENTO DE EXCEÇÕES 

                        System.out.printf("\nDigite a nota: ");
                        float nota = sc.nextFloat();
                        aluno1.aplicar_nota(nota);
                    }

                    catch(Exception e){

                        System.out.printf("\nValor Incorreto!\n");
                        sc.nextLine(); //É O COMANDO QUE VAI ESVAZIAR O SCANNER - PARA UTILIZAR ESTE METÓDO TEM QUE ESTAR DENTRO DO "CATCH"

                    }

                    break;

                case (2):

                    try{

                        System.out.printf("\nDigite o total de presenças: ");
                        int presencas = sc.nextInt();
                        aluno1.aplicar_presencas(presencas);
                    }
        
                    catch(Exception e){
        
                        System.out.printf("\nValor Incorreto!!\n");
                        sc.nextLine();
                    }

                    break;

                case (3):

                    try{

                        System.out.printf("\nDigite o bônus: ");
                        int bonus = sc.nextInt();
                        aluno1.aplicar_bonus(bonus);
                    }
        
                    catch(Exception e){
        
                        System.out.printf("\nValor Incorreto\n");
                        sc.nextLine();
                    }

                case (4):

                    System.out.printf("\nUsuário saiu do programa!!");
                    break;
                
                default: //SIGNIFICA PADRÃO
                
                    System.out.printf("\nOpção Inexistente!");
            }
                } 
                
                catch(Exception e){
                    
                    System.out.printf("\nDigte apenas números\n");
                    sc.nextLine();

                }

        } while (opcao != 4);

    }
}
