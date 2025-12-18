package BasicMath;

import java.util.Scanner;

class ReverseNumberUsingOperators{
    static int res=0;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scan.nextInt();
        reverse(n);
        System.out.println("Reverse number: "+res);
    }
    static void reverse(int n)
    {
        while(n>0)
        {
            res=(res*10)+(n%10);
            n=n/10;
        }
    }
}