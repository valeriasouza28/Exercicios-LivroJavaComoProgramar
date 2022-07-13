public class Account {

    //Exemplo3

    //Classe Account com uma variável de instância balance do tipo double eum construtor
    // e um método deposit que executa a validação
    private String nome; //variável de instância
    private double saldo; //variável de instância

    //Construtor de Account que recebe dois parãmetros
    public Account(String nome, double saldo)
    {
        this.nome = nome; // atribui anme a variável de instãncia name

        //valida que o balance é maior que 0.0; se não for,
        //a variável de instãncia balance mantém seu valor inicial padrão 0.0
        if(saldo > 0.0) //se o saldo for válido
            this.saldo = saldo; // o atribui a variável de  instância balance

    }

    //métodod que deposita (adicona) apenas uma quantia válida no saldo
    public void deposito (double depositoQuantia)
    {
        if (depositoQuantia > 0.0) // se depositAmount for válido
            saldo = saldo + depositoQuantia; //o adiciona ao saldo
    }

    public void saque(double saqueQuantia) {
        if(saqueQuantia < saldo)

            saldo = saldo - saqueQuantia;
    }

    //método retorna  o saldo da conta
    public double getSaldo ()
    {
        return saldo;
    }

    //modo que define o nome
    public void setNome()
    {
        this.nome = nome;
    }

    //método que retorna o nome
    public String getNome()
    {
        return  nome;
    }

    /*
    //Exemplo2

     private String name; //variável de instãncia

    //o construtor inicialiaza name com nome do parâmetro
    public Account(String name) //o nome do construtor é o nome da classe
    {
        this.name = name;
    }

    //método para configurar o nome de um objeto
    public void setName(String name) {

        this.name = name;
    }

    //método para recuperar o nome do curso
    public String getName() {

        return name; // retorna do nome para o chamador
    }*/

    /*
    //Exemplo1

    //método para configurar o nome de um objeto
    public void setName(String name) {

        this.name = name;
    }

    //método para recuperar o nome do curso
    public String getName() {

        return name; // retorna do nome para o chamador
    }
    */



}//fim da classe Account

