public class Scope {

    //campo acessivel para todos os métodos dessa classe
    private static int x = 1;

    //O método main cria e inicializa a váriavel local x
    //e chama os métodos useLocalVariable e useField
    public static void main(String[] args) {

        int x = 5; //variável local x do método sombreia o campo x

        System.out.printf("local x in mainis %d%n", x);

        useLocalVariable(); //useLocalVariable tem uma variável local x
        useField(); //useField utiliza o campo x da classe Scope
        useLocalVariable(); //useLocalVariable reinicializa a variável local x
        useField(); // campo x da classe Scope retém seu valor

        System.out.printf("%n variável local x do método main %d%n", x);

    }
    //cria e einicializa a varável local x durante cada chamada
    public static void useLocalVariable()
    {
        int x = 25; //inicaliza toda vez que useLocalVariable é chamado

        System.out.printf("%n A variável local x ao inserir o método useLocalVariable %d%n", ++x); //modifica variável local x desse método
        System.out.printf("variável local após a saída do método useLocalVariable is %d%n", x);
    }

    //modifica o capo x da classe scope duarnte cada chamada
    public static  void useField ()
    {
        System.out.printf("%nfield x ao entrar o metódo useField é %d%n",x);
        x *= 10; //modifica o campo da classe Scope
        System.out.printf("field x  antes da saída do método useField é %d%n", x);

    }
}//fim da classe Scope
