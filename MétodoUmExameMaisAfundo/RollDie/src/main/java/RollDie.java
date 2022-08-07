import java.security.SecureRandom;

//Rola um dado de seis lados 6.000.000 vees.
public class RollDie {

    public static void main(String[] args) {

        //objeto randomNumbers produzirá números aleatŕios
        SecureRandom randomNumbers = new SecureRandom();

        int frequency1 = 0; //contagem de 1s lançados
        int frequency2 = 0; //contagem de 2s lançados
        int frequency3 = 0; //contagem de 3s lançados
        int frequency4 = 0; //contagem de 4s lançados
        int frequency5 = 0; //contagem de 5s lançados
        int frequency6 = 0; //contagem de 6s lançados

        //soma 6.000.000 lançamentos de um dado
        for (int roll = 1; roll <= 6000000; roll++)
        {

            int face = 1 + randomNumbers.nextInt(6); //número entre 1 e 6

            //usa valor 1-6 para faces a fim de determinar qual contador incrementar
            switch(face)
            {

                case 1:
                    ++frequency1; //incrementa o contador de 1s
                    break;

                case 2:
                    ++frequency2; //incrementa o contador de 2s
                    break;

                case 3:
                    ++frequency3; //incrementa o contador de 3s
                    break;

                case 4:
                    ++frequency4; //incrementa o contador de 4s
                    break;

                case 5:
                    ++frequency5; //incrementa o contador de 5s
                    break;

                case 6:
                    ++frequency6; //incrementa o contador de 6s
                    break;
            }//fim do switch
        }//fim do for

        System.out.println("Face\tFrequency"); // cabeçalhos de saída
        /* O \t coloca um espaço entre uma string.
         O %d exibe as variável no local onde esse caractere está,
         ele funciona como o place holder do java script.
         E o %n é um caractere utilizado para pular linha*/
        System.out.printf("1\t\t%d%n2\t\t%d%n3\t\t%d%n4\t\t%d%n5\t\t%d%n6\t\t%d%n", frequency1,
                frequency2, frequency3, frequency4,frequency5,frequency6);


        int number = randomNumbers.nextInt(5);
        System.out.println("mostra radom number: " + number);
        //int number1 = 3 * randomNumbers.nextInt(5);
        //System.out.println("vezes 3: " + number1);

    }// fim do método main

}//fim da classe RollDie
