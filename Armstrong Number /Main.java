import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int temp = n;
      int dig = 0;
      int sum = 0;
      while(temp>0)
      {
        dig += 1;
        temp = temp / 10;
      }
      int temp2 = n;
      while(n>0)
      {
        sum = sum + (int)Math.pow((n%10),dig);
        n = n/10;
      }
      if(temp2 == sum)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
     
        
	}
}