import java.util.Scanner;
public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        
        if(number==0){
            System.out.print(number +" is zero");
        }
        else if(number>0){
            System.out.print(number+ " is positive int");
        }
        else{
            System.out.print(number+" is negative int");
        }
    }
}