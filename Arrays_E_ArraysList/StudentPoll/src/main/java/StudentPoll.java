//Programa de anaálise de enquete

public class StudentPoll {

    public static void main(String[] args)
    {
        //array das respostas dos alunos (mais tipicamente, inserido em tempo de execução)
        int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3,
        2, 3, 3, 2, 14};
        int[] frequency = new int[6];

        // como indice de frequeẽncia para determinar elemento a incrementar
        for (int answer = 0; answer < responses.length; answer++)
        {
            try
            {
                ++frequency[responses[answer]];
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
                System.out.printf("  responses[%d] = %d%n%n",
                        answer, responses[answer]);
            }
        }//fim do for

        System.out.printf("%s%10s%n", "Rating", "Frequency");

        //gera saída do valor de cada elemento do array
        for (int rating = 1; rating < frequency.length; rating++ )
        {
            System.out.printf("%6d%10d%n", rating , frequency[rating]);
        }
    }    //fim do método main
}//fim da classe StudantePoll
