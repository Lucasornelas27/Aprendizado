import java.util.Scanner;
public class Decisao {
    public static void main(String[]args){
    int a, i;
    Scanner ler = new Scanner(System.in);
        System.out.println("qual sua idade?");
        i=ler.nextInt();
        a=i;
        if (a>=18){
        System.out.println("adulto");
        } else{
        System.out.println("criança ou adolescente");
        }
    }
}
