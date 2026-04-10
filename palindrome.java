//to reverse the numbers
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = n;
        int rev = 0;
        while(n>0){
            rev = rev*10 +n%10;
            n = n/10;
        }
        if(rev==s){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
