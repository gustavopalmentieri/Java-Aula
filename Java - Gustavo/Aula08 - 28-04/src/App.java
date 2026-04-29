import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Aluno aluno1 = new Aluno();

        //APLICANDO SCANNER 

        System.out.printf("\nDigite a nota: ");
        float nota = sc.nextFloat();
        aluno1.aplicar_nota(nota);

        System.out.printf("\nDigite o total de presenças: ");
        int presencas = sc.nextInt();
        aluno1.aplicar_presencas(presencas);

        System.out.printf("\nDigite o bônus: ");
        int bonus = sc.nextInt();
        aluno1.aplicar_bonus(bonus);
    }
}
