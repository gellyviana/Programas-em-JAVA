import java.util.Scanner;

public class pessoinha{
    public static void main(String [] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Qual sua altura?");
        double altura = s.nextInt();
        if(altura > 1.5 ){
            System.out.println("Você é alto!!!");
        }
        else{
            System.out.println("Você é baixo!!!");
        }
    }
}