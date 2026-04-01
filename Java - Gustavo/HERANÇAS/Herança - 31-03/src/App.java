public class App {
    public static void main(String[] args) throws Exception {
        
        //INSTANCIANDO A CLASSE SMARTPHONE - CLASSE FILHA

        Smartphone celular1 = new Smartphone();

        celular1.mensagem();
        celular1.ligar(); //O METÓDO LIGAR FOI HERDADO DA CLASSE MÃE POR ISSO PODE SER UTILIZADO
        celular1.carregar_bateria();
    }
}
