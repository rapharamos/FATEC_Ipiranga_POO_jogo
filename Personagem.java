public class Personagem {
    String nome; //variavel de instancia e referencia
    int energia; //variaveis de instancia e primitivas
    int fome;
    int sono;

    final static int LIMITE_SUPERIOR = 10; //constante, não da pra trocar esse valor, final quer dizer que nao pode atribuir
    //coloque o static para nao puxar essa memo pra cada objeto
    //static significa é dessa classe, não crie varias para cada objeto, instancias
    //valor compartilhado pra todas as instancias, uma copia para todos os objetos
    //para atribuir pode Personagem.constante = .. porque é da classe e nao das instancias

    //metodo de instancia
    void cacar(){
        if (this.energia >= 2) {
            System.out.println(this.nome + " cacando...");
            this.energia -= 2;
            this.fome = Math.min (this.fome +1, 10);
            this.sono = Math.min(this.sono +1, 10);
        }
        else{
            System.out.println(this.nome + " sem energia para cacar... ");
        }
    }

    void comer(){
        if(this.fome >= 1){
            System.out.printf("%s comendo...", this.nome);
            this.fome -= 1;
            this.energia = this.energia + 1 <= 10 ? this.energia + 1 : this.energia;
        }
        else{
            System.out.printf("%s sem fome...\n", this.nome);
        }

    }

    void dormir(){
        if(this.sono >= 1){
            System.out.println(String.format("%s dormindo...", this.nome));
            this.sono -= 1;
            this.energia = this.energia + 1 <=10 ? this.energia +1 : this.energia;
        }
        else{
            System.out.println(nome + "sem sono...");
        }
    }

    //classe de alta coesao - resolve somente um problema
    //nossa classe diz quais sao os atributos e comportamentos do personagem nome
    //sim, resolveu o problema, poucas linhas de codigo
    //se utilizar o JOptionPane, por exemplo, deixa de ser coesa
    //em outras plataformas nao  tem JOP, ele resolve interface com usuario
}