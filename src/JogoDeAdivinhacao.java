import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int num = new Random().nextInt(100);
        int tentativas = 0;
        int palpite = 0;

        System.out.println(""" 
                Jogo De Adivinhação, 
                voce tem 5 tentativas para acertar, 
                digite um numero entre 0 e 100: 
                  """);


        while(tentativas <= 4  && palpite != num){

            palpite = leitura.nextInt();

            if(palpite < num){
                System.out.println("Numero maior que " + palpite);
            }else if(palpite > num){
                System.out.println("Numero menor que " + palpite);
            } else if(palpite == num){
                System.out.println("Acertou!! Numero secreto é " + num);
                break;
            }

            if (tentativas == 4) {
                System.out.println("Infelizmente acabou suas chances" +
                        ", Numero secreto é " + num);
            }

            tentativas++;
        }
    }
}
