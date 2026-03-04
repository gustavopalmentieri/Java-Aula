/*AQUI ESTÁ O CÓDIGO FONTE*/

public class App { //CLASSE PÚBLICA - ESTÁ VÍSIVEL PARA OS OBJETOS
    public static void main(String[] args) { //FUNÇÃO PRINCIPAL
        
        //CRIANDO UM OBJETO

        Celular celular_A = new Celular(); //ESTOU CRIANDO O PRIMEIRO CELULAR DENTRO DA CLASSE
        celular_A.nome = "S26";

        System.out.printf("Celular: %s", celular_A.nome);
    }
}

