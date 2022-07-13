import java.security.SecureRandom;

//Inteiros aletórios deslocados e escalonados
public class RandomIntegers {

    public static void main(String[] args) {

        //o objeto randomNumbers produzirá números aleatórios seguros
        SecureRandom randomNumbers = new SecureRandom();

        //faz o loop 20 vezes
        for (int counter = 1; counter <= 20; counter++){

            //seleciona o inteiro aleatório entre 1 e 6
            int face = 1 + randomNumbers.nextInt(6);

            System.out.printf("%d ", face); //exibe o valor gerado

            //se o contaor for divisivel por 5, inicia uma nova linha
            if (counter % 5 == 0)
                System.out.println();

        }
    }
}//fim da classe RandomIntegers
