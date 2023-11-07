package operadoresaritmeticos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        //Expressão Aritmética
        int numero1 = 20121, numero2 = 315;
        float media = (numero1 + numero2) / 2;
        System.out.printf("A média eh: " + media);
        System.out.println("\n");
        System.out.println("\n=====================\n");

        //Incremento e Decremento
        System.out.println("Incremento e Decremento Aritmético: ");
        System.out.println("(++ e --) \n");
        int n1 = 3;
        int n2 = 2;
        int iEsq = n1 + n2++; // -> ++ a esquerda não incrementa com a expressão soma
        int iDir = n1 + ++n2; // -> ++ a direita incrementa com a expressão soma
        int dEsq = n1 + --n2; // -> Decremento
        int dDir = n1 + n2--; // -> Decremento
        System.out.println("Incremento do Lado Direito: " + iDir);
        System.out.println("Incremento do Lado Esquerdo: " + iEsq);
        System.out.println("Decremento do Lado Esquerdo: " + dEsq);
        System.out.println("Decremento do Lado Direito: " + dDir);
        System.out.println();
        // -> Incremento e Decremento e bastante utilizado em laços de repetição
        System.out.println("\n=====================\n");

        //Operador de Atribuição 
        System.out.println("Utilizando o Operador de Atribuição");
        System.out.println("(+=, *=, /+, %=): \n");
        int num1 = 2;
        int num2 = 3;
        int soma = num1 += num2;
        int mult = num1 *= num2;
        int div = num1 /= num2;
        int rest = num1 %= num2;
        System.out.println("Somando: " + soma);
        System.out.println("Multiplicando: " + mult);
        System.out.println("Dividindo: " + div);
        System.out.println("Resto de Divisão: " + rest);
        System.out.println("\n=====================\n");

        //Classe Math
        System.out.println("Utilizando a Classe Math");
        System.out.println("(Math.sqrt(), Math.cbrt(), Math.PI, Math.pow):\n");
        int numb1 = 512;
        float raizQ = (float) Math.sqrt(numb1); // Ou posso apenas colocar double no lugar do float
        double raizC = Math.cbrt(numb1);
        double pi = Math.PI;
        double expon = Math.pow(5, 2);
        System.out.println("Raiz Quadrada: " + raizQ);
        System.out.println("Raiz Cubica: " + raizC);
        System.out.println("Número de pi: " + pi);
        System.out.println("Exponenciação(5²): " + expon);
        System.out.println("\n=====================\n");

        //Arredondamento
        System.out.println("Utilizando Arredondamentos");
        System.out.println("(abs, floor, ceil, round): \n");
        float number1 = 4.6f; // Ou float number1 = (float) 4.6;
        float valorAb = Math.abs(-10);
        float arredBaixo = (float) Math.floor(number1);
        float arredCima = (float) Math.ceil(number1);
        double arredArit = Math.round(number1);
        System.out.println("Valor absoluto(-10): " + valorAb);
        System.out.println("Valor Arredondado para Baixo(4.6): " + arredBaixo);
        System.out.println("Valor Arredondado para Cima(4.6): " + arredCima);
        System.out.println("Valor Arredondado Aritmeticamente(4.6): " + arredArit);
        System.out.println("\n=====================\n");

        //Número aleatório com Math.random();
        System.out.println("Numero aleatorio com Math.random(), de 0 a 1: \n");
        double ale = Math.random();
        double ale1 = 5 + ale * (10-5);
        int ale2 = (int) (0 + ale * (100-0));
        System.out.println("Numero Aleatorio(0 a 1): " + ale);
        System.out.println("Numero Aleatorio(5 a 10): " + ale1);
        System.out.println("Numero Aleatorio(0 a 100): " + ale2);
        System.out.println("\n=====================\n");

    }

}
