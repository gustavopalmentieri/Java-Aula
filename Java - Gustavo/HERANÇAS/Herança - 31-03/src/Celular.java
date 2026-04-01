public class Celular { //SERÁ A CLASSE MÃE  
    
    //METÓDO LIGAR  

    public void ligar(){

        System.out.printf("\nO celular está ligando.");
    }

    //METÓDO CARREGAR BATERIA   

    public void carregar_bateria(){

        System.out.printf("\nO celular está carregando a bateria.");
    }
}

class Smartphone extends Celular{ //A CLASSE SMARTPHONE HERDA DA CLASSE CELULAR, POR ISSO DO "extends" - ALÉM DE SER UMA CLASSE DEFAULT

    public void mensagem(){

        System.out.printf("\nO Smartphone está enviando uma mensagem!!");
    }

}
