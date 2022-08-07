/*   Um  jogo popular de azar é é  um jogo de dados conhecidos como  craps,
que é jogado em cassinos e nas ruas de todo o mundo. As regras do jogosão simples:

     Você lança dois dados. Cda dado tem seis faces que contêm um, dois, três,quatro, cinco e seis  pontos
, respectivamente. Depois uqe  os  dados param de rolar, a soma  dos pontos nas faces viradas para cima á calculada.
    Se a soma  for 7 ou 11 no lance, vocẽ ganha. Se a soma for 2, 3 ou 12 no primeiro lance(chamado "craps"),
vocẽ perde(isto é. a "casa" ganha). Se a soma for 4,5, 6, 8, 9 ou 10 no primeiro lance, essa soma torna-se sua
"pontuação". Para ganhar, vocẽ deve continuar a rolar os dados até "fazer suapontuação" (isto é, obter um valor
 igual á sua pontuação). Você perde se obtiver um 7 antes de fazer sua pontuação.*/

import java.security.SecureRandom;

public class Craps {

    // cria um gerador seguro de números aleatórios para uso no método rollDice
    private static final SecureRandom randomNumbers  = new SecureRandom();

    //tipo enum coom constantes que representam o estadodo  jogo
    private enum Status{ CONTINUE, WON, LOST};

    //constantes que representam laçamentos comuns dos dados
    private static final int SNAKES_EYES =2;
    private static final int TREY = 3;
    private static final int  SEVEN = 7;
    private static final int  YO_LEVEN = 11;
    private static final int  BOX_CARS = 12;

    //joga partida de craps
    public static void main(String[] args){

        int myPoint = 0; //pontos  se  não ganhar ou perder na 1ª rolagem
        Status gameStatus; //pode conter CONTINUE, WON ou LOST

        int sumOfDice = rollDice(); //primeira rolagem dos dados

        //determina o estado da pontuação  com base no primeiro  lançamento
        switch (sumOfDice){
            case SEVEN: //ganha com 7 no primeiro lançamento
            case YO_LEVEN: //GANHA COM 11 NO PRIMEIRO LANÇAMENTO
                gameStatus = Status.WON;
                break;
            case SNAKES_EYES: //perde com 2 no primeiro laçamento
            case TREY: //perde com 3 no primeiro laçamento
            case BOX_CARS: //perde com 12 no primeiro  lançamento
                gameStatus = Status.LOST;
                break;
            default: //não ganhou nem perdeu, portanto registra a pontuação
                    gameStatus = Status.CONTINUE; // jogo  não terminou
                    myPoint = sumOfDice; //informa a pontuação
                System.out.printf("point is %d%n", myPoint);
                break;
        }

        //enquanto o jogo não estiver completo
        while (gameStatus == Status.CONTINUE) //nem WON nem LOST
        {
            sumOfDice = rollDice(); //lança os dados

            //determina o estado do jogo
            if (sumOfDice == myPoint) //vitória por pontuação
                gameStatus = Status.WON;
            else
                if (sumOfDice == SEVEN) //perde obtendo 7 antes de atingir a pontuação
                    gameStatus = Status.LOST;
        }

        //exibe uma mensagem ganhou ou perdeu
        if (gameStatus == Status.WON)
            System.out.println("Playesr wins");
        else
            System.out.println("Player loses");
    }

    /*nas resgras do jogo o jogador deve rolar dois dados na primeira e em todas as jogadas subsequentes.
    Declaramos o método rollDice para lançar o dado e calcular e imprimir sua soma.
    */
    //lança dados, calcula a soma e exibe os resultados
    public static int rollDice()
    {
        //seleciona valores aleatórios do dado
        int die1 = 1 + randomNumbers.nextInt(6); //primeiro lançamento do dado
        int die2 = 1 + randomNumbers.nextInt(6); //segundo lançamento do dado

        int sum = die1 + die2; //soma dos valores dos dados

        //exibe os resultados desse lançamento
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

        return sum;

    }
}// fim da classe Craps
