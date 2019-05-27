import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int lno = num%10;
    num = num/10;
    int slno = num%10;
    num = num/10;
    int fno = num%10;
    
    int sno = (lno*100) + (slno*10) + fno;
    System.out.println(sno);
  }
}