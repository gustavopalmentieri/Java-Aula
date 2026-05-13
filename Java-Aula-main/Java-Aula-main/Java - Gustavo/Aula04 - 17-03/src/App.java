public class App {
    public static void main(String[] args) throws Exception {
        
        //CRIANDO O PRIMEIRO OBJETO:

        Celular celular1 = new Celular();
        celular1.modelo = "A25";
        celular1.fabricante = "Samsung";
        celular1.bateria = 50.5f;

        //METÓDO EXIBIR

        celular1.exibir();
        celular1.ligacao("Gustavo");
        celular1.mensagem("Claudio", "Parabéns você ganhou 5 Milhões de Doláres");
        celular1.foto(15.5f);
        celular1.carregar(10.5f);
}


}


