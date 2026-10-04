import java.util.Scanner;
public class CountEvenNumber{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("enter start number : ");
        int sn=sc.nextInt();
        
        System.out.print("enter end number : ");
        int en=sc.nextInt();
        
        int i;
        int sum=0;
        int count=0;

        for(i=sn; i<=en; i++){
            if(i%2==0){
                sum=i+sum;
                count++;
            }
        }
        System.out.println("Total Even Number =  "+count);
        System.out.println("Sum of Even Number = "+sum);
    }  
}