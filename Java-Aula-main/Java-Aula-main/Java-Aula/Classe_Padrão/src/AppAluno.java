public class AppAluno{
public static void main (String[] args) throws Exception{

    //CRIANDO O PRIMEIRO ALUNO

    Aluno aluno1 = new Aluno();

    aluno1.nome = "Gustavo";
    aluno1.idade = 18;
    aluno1.nota1 = 7.3;
    aluno1.nota2 = 5; //POR ESTAR UTILIZANDO DOUBLE NÃO PRECISA FIXAR NADA COMO NO FLOAT  
    
        //EXIBINDO OS DADOS DO ALUNO:
        
        aluno1.exibir();
        
    }
}