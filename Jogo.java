import java.util.Random;
public class Jogo {
    public static void main(String[] args) throws Exception {
        Personagem cacador = new Personagem(10, 0, 0); //criacao de objeto com variavel de referencia (cacador)
        Personagem soneca = new Personagem(2, 4, 10);
        Personagem guloso = new Personagem(4, 10, 2);
        cacador.setNome("Cacador");
        Random gerador = new Random();
        while(true){
            int oQueFazer = gerador.nextInt(3)+1; // [1,3]
            switch(oQueFazer){
                case 1:
                    cacador.cacar();
                    soneca.cacar();
                    guloso.cacar();
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
