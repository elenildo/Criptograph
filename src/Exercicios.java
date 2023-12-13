import Criptograph.Cripto;

public class Exercicios {
    public static void main(String[] args) {
        String msg = "Java is great!";
        System.out.println("Mensagem codificada:");
        String msgEncoded = Cripto.encode(msg, 0);
        String msgDecoded = Cripto.decode(msgEncoded, 0);
        System.out.println("Mensagem decodificada:\n"+ msgDecoded );

    }
}
