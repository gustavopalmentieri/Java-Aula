public class Celular {

    //DEFININDO ATRIBUTOS

    String modelo;
    String fabricante;   
    float  bateria;

    //METÓDO EXIBIR 

    void exibir(){

        //A DIFERENÇA ENTRE "PRINTLN E PRINTF" É A FORMA QUE VOCê VAI FORMATAR AMBOS - ESTÁ É A ÚNICA DIFERENÇA - EXEMPLOS ABAIXO

        //System.out.println("Modelo:" + modelo + "Fabricante: " + fabricante + "Bateria: " + bateria + "%");
        System.out.printf("Modelo: %s Fabricante: %s Bateria: .1.f %%", modelo, fabricante, bateria );

        
    //METÓDO LIGAÇÃO


    }

    public void ligacao (String contato){ //PARÂMETRO - VARIÁVEL ALIMENTADA DENTRO DO METÓDO

        System.out.printf("\nO %s %s está ligando para %s", fabricante, modelo, contato);
    }

    //METÓDO MENSAGEM

    public void mensagem(String contato, String texto){ //02 - PARÂMETRO

        System.out.printf("\nO %s %s enviou uma mensagem para %s: %s", fabricante, modelo, contato, texto);
    }

    //METÓDO FOTO

    public void foto(float resolucao){

        System.out.printf("\nA resolução da foto tirada no %s %s foi de: %.1f MP", fabricante, modelo, resolucao);
    }
}
