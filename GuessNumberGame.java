import java.util.Scanner;
public class GuessNumberGame {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       
       int sct=16102006;
       int gu=0;
       int at=0;
       
       while(gu!=sct){
           System.out.print("guess number : ");
           gu=sc.nextInt();
           at++;
           
           if(gu>sct){
               System.out.println("Too high");
           }else if(gu<sct){
               System.out.println("Too low");
           }else{
               System.out.println("correct!");
           }
           
       }
       System.out.println("attempts = "+at);
       sc.close();
    }
    
}
