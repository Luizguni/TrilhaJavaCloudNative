package Operadores;

import java.util.Date;

public class TiposOperadores {
    public static void main(String[] args) {

        //Operadores - Símbolos especias para operações mathematics
        String nome = "Guni";
        int idade = 40;
        double peso = 94.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();
        //atribuições precisam seguir as regras

        //Operadores aritimeticos
        double soma = 10.8 + 50.22;
        int subtracao = 89 - 68;
        int multiplicacao = 87 * 63;
        int divisao = 15 / 88;
        int modulo = 894 % 136;
        double resultado = (10 * 7) + ((double) 20 / 4);
        System.out.println(resultado);

        // Operadores de adição quando utilizados em variáveis do tipo String realizará a concatenação desses textos
        String nomeCompleto = "Luiz" + "Guni";
        System.out.println(nomeCompleto);

        //Concatenação
        String concatencao = "?";

        concatencao = 1 + 1 + 1 + "numero";

        System.out.println(concatencao);

        concatencao = 1 + "numero" + 1 + 1;

        System.out.println(concatencao);

        concatencao = 1 + "numero" + 1 + "numero" + 1;

        System.out.println(concatencao);

        concatencao = "numero" + 1 + 1 + 1;

        System.out.println(concatencao);

        concatencao = "numero" + (1 + 1 + 1);

        System.out.println(concatencao);

        //Operador unário /positivo+,negativo-, incremento++, negação

        int numero = 8;
        numero = -numero;
        System.out.println(numero);
        numero = numero * -1;
        System.out.println(numero);

        //Incrementando numeros, fluxo de repetição

        int numeroPositivo = 5;
        //x repetição
        numeroPositivo = numero + 3;

        System.out.println(numeroPositivo);

        //Operador ternário
        int a, b;
        a = 3 + 3;
        b = 6;

        String result = a == b ? "verdadeiro" : "falso";
        System.out.println(result);

//Operadores Relacionais
        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;
        System.out.println("NumeroUm é igual a numeroDois?" + simNao);

        simNao = numero1 != numero2;
        System.out.println("NumeroUm é diferente de numeroDois?" + simNao);

        simNao = numero1 + numero1 == numero2;
        System.out.println("NumeroUm + numeroUm é igual a numeroDois?" + simNao);
    }
}
