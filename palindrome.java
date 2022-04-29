
import java.util.Scanner;
public class palindrome {
    public void palindromecheck(){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter you number: ");
        int n=sc.nextInt();
        int sum=0,remainder,temp;
        temp=n;
        while (n>0){
           remainder=n%10;
           sum=(sum*10)+remainder;
           n=n/10;
          }
       if(temp==sum){
           System.out.println("it is palindrome number");
       }
       else{
           System.out.println("It is not palindrome number");
           }
       }
    public static void main(String[] args) {
    palindrome p= new palindrome();
            p.palindromecheck();
          }
}
