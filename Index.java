import java.util.Scanner;
public class Index{
    public static void main(String[]args){
    soma();

}
public static void soma() {

        Scanner input= new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n1= input.nextInt();

        System.out.println("Digite um numero: ");
        int n2= input.nextInt();

        int adicao = n1 + n2;

         System.out.println("Resultado: " + adicao);

        input.close();
        
        


        
    }
}