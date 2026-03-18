public class Aluno {
    
    //DEFININDO OS ATRIBUTOS

    String nome;
    int idade;
    double nota1;
    double nota2;

    //METÓDO QUE CALCULA A MÉDIA DA NOTAS:

    public double média (){

        return (nota1 + nota2) / 2;

    }
    
    //METÓDO PARA EXIBIR OS ATRIBUTOS DO ALUNO

    public void exibir (){


        System.out.println("Nome: " + nome); //POR ESTAR UTILIZANDO 'PRINTLN', NÃO PRECISA DE NENHUMA FORMATAÇÃO PARA........
        System.out.println("Idade: " + idade);
        System.out.println("Média: " + média());
        System.out.println("Situação: " + situação());
    
    }

    //METÓDO DO STATUS:

    public String situação(){

        if (média() >= 6) {
            
            return "APROVADO";
            
        } 
        
        else{

            return "REPROVADO";
        }
    }
}
