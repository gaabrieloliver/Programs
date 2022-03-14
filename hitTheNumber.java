import java.util.Random;
import java.util.Scanner;

public class Aula_25 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //gera números aleatórios
        Random ran = new Random();


        boolean acertou = false;
        //tentativas restantes, ou vidas restantes;
        int tentativas = 10;

        //variável que vai conter um número aleatório que vai ser gerado pelo random.
        int numeroSecreto = ran.nextInt();
        long chute = 0;

        System.out.println("Seu número secreto é: "+numeroSecreto);
        while(tentativas > 0 && acertou == false){
            System.out.println("Qual o seu chute?");
            chute=in.nextLong();

            if(numeroSecreto == chute){
                System.out.println("Você acertou!!");
                acertou = true;
            }else if(chute < numeroSecreto) {
                --tentativas;
                System.out.println("Número muito pequeno!" + tentativas + " tentativas restantes.");

            }else{
                --tentativas;
                System.out.println("Número muito grande!" + tentativas + " tentativas restantes.");



            }
        }
    }
}
