//Metódo maximum declarado pelo progarmador com trẽs parâmetros double
import java.util.Scanner;

public class MaximumFinder {

    //obtém trẽs valores de ponto flutuante e localiza o valor máximo
    public static void main(String[] args) {

        //cria  um Scanner para entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        //solicita e insere três valores de ponto flutuante
        System.out.print(
                "Digite três valores de pontos flutuantes separados por espaços : ");
        double numero1 = input.nextDouble(); //lê o primeiro double
        double numero2 = input.nextDouble(); //lê o segundo  double
        double numero3 = input.nextDouble(); //lẽ terceiro double

        //determina o valor máximo
        double result = maximum(numero1, numero2,numero3);
        System.out.println("mostra result" + result.type);


        //exibe valor maximum
        System.out.println("Maximum é: " + result);



    }//Fim do método main

    //retorna o máximo dos seus trẽs parãmetros de double
    public static double maximum(double x, double y, double z){

        double maximumValue = x;// supõe que x é omaior valor inicial

        //determina se y é maior que maximumValue
        if (y > maximumValue)
            maximumValue = y;

        //determina se z é maior que maximumValue
        if (z > maximumValue)
            maximumValue = z;

        return maximumValue;
    }

}//Fim da classe MaximumFinder
