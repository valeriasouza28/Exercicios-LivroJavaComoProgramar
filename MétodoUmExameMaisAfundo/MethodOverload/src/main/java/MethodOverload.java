// Declarações de métodos sobrecarregados
public class MethodOverload
{
    // teste de métodos sauqre sobrecarregados
    public static void main(String[] args)
    {
        System.out.printf("Square de inteiros 7 é %d%n", square(7));
        System.out.printf("Square de double 7.5 é %f%n", square(7.5));
    }

    //método square com o  argumento de int
    public static int square(int intValue)
    {
        System.out.printf("%nChamada de square com argumento int: %d%n", intValue);
        return intValue * intValue;
    }

    // método square com argumento double
    public static double square(double doubleValue)
    {
        System.out.printf("%nChamada de square com argumento double: %f%n", doubleValue);
        return doubleValue * doubleValue;
    }

}
