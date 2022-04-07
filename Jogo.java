import java.util.Random;
public class Jogo {
    public static void main(String[] args) throws Exception {
        Personagem cacador = new Personagem(); //criacao de objeto com variavel de referencia (cacador)
        Random gerador = new Random();
        while(true){
            int oQueFazer = gerador.nextInt(3) +1; // [1,3]
            switch(oQueFazer){
                case 1:
                    cacador.cacar();
                    break;
                case 2:
                    cacador.comer();
                    break;
                case 3:
                    cacador.dormir();
                    break;
            }
            System.out.println("==============================");
            Thread.sleep(2000); //quantos minutos de pausa antes de fazer a proxima operação // da erro se nao tiver Exception
        }
    }
}
