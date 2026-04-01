import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Poupança conta1 = new Poupança();

        conta1.depositar(150); //METÓDO DA CLASSE MÃE
        conta1.render(); //METÓDO DA CLASSE FILHA
    }
}
