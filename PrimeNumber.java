import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("enter number : ");
        int num=sc.nextInt();
        
        if(num==2 || num==3){
            System.out.println(num+ " is Prime Number");
        }else if(num%2==0 || num%3==0 || num==1){
            System.out.println(num+" is not Prime Number");
        }else{
            System.out.println(num+" is Prime Number");
        }
    }
    
}
