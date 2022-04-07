public class Personagem nome {
    String nome; //variavel de instancia e referencia
    int energia; //variaveis de instancia e primitivas
    int fome;
    int sono;

    //metodo de instancia
    void cacar(){
        System.out.println(nome + " cacando...")
    }

    void comer(){
        System.out.printf("%s comendo...", nome);
    }

    void dormir(){
        System.out.println(String.format("%s dormindo...", nome);
    }

    //classe de alta coesao - resolve somente um problema
    //nossa classe diz quais sao os atributos e comportamentos do personagem nome
    //sim, resolveu o problema, poucas linhas de codigo
    //se utilizar o JOptionPane, por exemplo, deixa de ser coesa
    //em outras plataformas nao  tem JOP, ele resolve interface com usuario
}