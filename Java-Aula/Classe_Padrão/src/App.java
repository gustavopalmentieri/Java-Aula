/*AQUI ESTÁ O CÓDIGO FONTE*/

public class App { //CLASSE PÚBLICA - ESTÁ VÍSIVEL PARA OS OBJETOS
    public static void main(String[] args) { //FUNÇÃO PRINCIPAL
        
        //CRIANDO UM OBJETO

        Celular celular_A = new Celular(); //ESTOU CRIANDO O PRIMEIRO CELULAR DENTRO DA CLASSE
        celular_A.nome = "S26";
        celular_A.fabricante = "Samsung";
        celular_A.so = "Android";
        celular_A.hd = 256;
        celular_A.tela = 6.3f; //TRABALHANDO COM A VÁRIAVEL FLOAT NA LINGUAGEM TEM QUE FIXAR O 'F' APÓS O VALOR DECLARADO.

        Celular celular_B = new Celular(); //ESTOU CRIANDO O SEGUNDO CELULAR DENTRO DA CLASSE
        celular_B.nome = "Iphone 17";
        celular_B.fabricante = "Apple";
        celular_B.so = "IOS";
        celular_B.hd = 512;
        celular_B.tela = 7.2f; 


        System.out.printf("-> CELULAR A <-%n - Celular: %s%n - Fabricante: %s%n - SO: %s%n - HD: %d GB%n - Tela: %.2f%n", celular_A.nome, 
        celular_A.fabricante, celular_A.so, celular_A.hd, celular_A.tela); //COMO ESTÁ SENDO TRABALHADO COM 'PRINTF' - PARA QUEBRAR A LINHA TEM QUE SER '%N'

        System.out.format("%n-> CELULAR B <-%n - Celular: %s%n - Fabricante: %s%n - SO: %s%n - HD: %d GB%n - Tela: %.2f%n", celular_B.nome, 
        celular_B.fabricante, celular_B.so, celular_B.hd, celular_B.tela); //MESMA COISA QUE O PRINTF - SÃO FUNÇÕES IDÊNTICAS QUE IMPRIMEM


    }
}

class Celular { //CLASSE PACKAGE PRIVATE (PACOTE PRIVADO) - CLASSE INTERNA - DA CLASSE PÚBLICA - APENAS PARA CLASSE APP (UTLIZANDO ISSO, POIS JAVA NÃO ACEITA MAIS DE UMNA CLASSE PÚBLICA NO MESMO ARQUIVO)

    //ATRIBUTOS DE UM CELULAR

    String nome; 
    String fabricante;
    String so;

    int hd;
    float tela;
    
}


