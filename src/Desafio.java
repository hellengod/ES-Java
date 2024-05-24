import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

      // 1
        System.out.println("Digite um numero: ");
        int num1 = leitura.nextInt();
        if(num1 >= 1){
            System.out.println("Numero positivo!");
        }else{
            System.out.println("Numero negativo!");
        }

        //2
        System.out.println("Digite dois numeros: ");
        int num2 = leitura.nextInt();
        int num3 = leitura.nextInt();
        if(num2 == num3){
            System.out.println("Numeros iguais");
        }else if(num2 != num3){
            System.out.println("Numeros diferentes");
        }
        if (num2 > num3){
            System.out.println("primeiro numero é maior");
        }else if (num2 < num3){
            System.out.println("segundo numero é maior");
        }

        //3
        System.out.println("Digite 1 para Calcular área do quadrado " +
                ", 2 para Calcular área do círculo e 3 para sair");
        int opcao = leitura.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Diga a medida de um lado do quadrado");
                double ladoQuadrado = leitura.nextDouble();
                double areaQuadrado = ladoQuadrado * ladoQuadrado;
                System.out.println("A area do quadrado é " + areaQuadrado);
                break;
            case 2:
                System.out.println("Diga a medida do raio do circulo");
                double pi = 3.14159;
                double raioCirculo = leitura.nextDouble();
                double areaCiculo = pi * (raioCirculo * raioCirculo);
                System.out.println("A area do circulo é " + areaCiculo);
                break;
            case 3:
                break;
        }

        //4
        System.out.println("Digite um numero: ");
        int numero = leitura.nextInt();
        for (int i = 1; i < 11; i++) {
            int conta = numero * i;
            System.out.println(numero + " x " + i + " = " + conta);
        }

        //5
        System.out.println("Digite um numero inteiro: ");
        int numero1 = leitura.nextInt();

        if (numero1 % 2 == 0) {
            System.out.println("Numero par");
        }else {
            System.out.println("Numero impar");
        }

        //6
        System.out.println("Digite um numero");
        int numero2 = leitura.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= numero2; i++) {
            fatorial = fatorial * i;

        }
        System.out.println("O fatorial de " + numero2 + " é: " + fatorial);

    }
    }

